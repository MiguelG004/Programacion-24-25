package decroly;
import java.time.*;
import java.util.LinkedList;
import java.util.Iterator;

public class VideoDaw {
	private String cif;
	private String dirreción;
	private LocalDate fechaAlta;
	private LinkedList <Articulo> listaArticulos = new LinkedList<>();
    private LinkedList <Cliente> listaClientes = new LinkedList<>();
	
    public VideoDaw(String cif, String dirreción) {
		this.cif = cif;
		this.dirreción = dirreción;
	}

	public String getCif() {
		return cif;
	}

	public String getDirreción() {
		return dirreción;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	


	public String mostrarInfoVideoClub() {
		return "VideoDaw [cif=" + cif + ", dirreción=" + dirreción + ", fechaAlta=" + fechaAlta
				+ ", articulosRegistrados=" + listaArticulos + ", clientesRegistrados=" + listaClientes
				+ "]";
	}
    
	public boolean registrarPelicula(Pelicula p){
        boolean isAdd = false;
        if(p != null){
            listaArticulos.add(p);
            isAdd= true;
        }
        return isAdd;
    }

    public boolean registrarVideojuego(Videojuego v){
        boolean isAdd = false;
        if(v != null){
            listaArticulos.add(v);
            isAdd= true;
        }
        return isAdd;
    }
	
	public String mostrarArticulosRegistrados() {
		Iterator<Articulo> itera = listaArticulos.iterator();
        StringBuilder resultado = new StringBuilder();
        while (itera.hasNext()) {
            Articulo art = itera.next();
            resultado.append(art.toString()).append("\n");
        }
        return resultado.toString();
	}
	
	public boolean registrarCliente(Cliente c) throws ClienteRegistradoException{
        for (Cliente cli : listaClientes) {
            if(c.getDni().equals(c.getDni())){
                throw new ClienteRegistradoException("Ya existe un cliente registrado con el dni: " + c.getDni() + ".");
            }
        }
        listaClientes.add(c);
        return true;
    }
	
	public String mostrarClientesRegistrados() {
        Iterator<Cliente> itera = listaClientes.iterator();
        StringBuilder resultado = new StringBuilder();
        while (itera.hasNext()) {
            Cliente cli = itera.next();
            resultado.append(cli.toString()).append("\n");
        }
        return resultado.toString();
    }
	
	
	 public boolean darBajaCliente(int numSocio){  
		 for (Cliente cli : listaClientes) {
	        if (cli.getNumSocio() == numSocio) {
	            listaClientes.remove(cli);
	            return true;
	        }
	    }
	        return false;
	    }
	
	
	public String mostrarArticulosNoAlquilados(VideoDaw vc) {
        Iterator<Articulo> itera = listaArticulos.iterator();
        StringBuilder noAlquilados = new StringBuilder();
        while (itera.hasNext()) {
            Articulo articulo = itera.next();
            if ((articulo instanceof Pelicula && !((Pelicula) articulo).isAlquilada()) || 
                (articulo instanceof Videojuego && !((Videojuego) articulo).isAlquilada())) {
                noAlquilados.append(articulo.toString()).append("\n");
            }
        }
        return noAlquilados.toString();
    }
	
	public boolean darBajaArticulo(int codigo){
        for (Articulo articulo : listaArticulos) {
            if (articulo.getCodigo() == codigo) {
                listaArticulos.remove(articulo);
                return true;
            }
        }
        return false;
    }
 
	
	public boolean alquilarArticulo(int codigo, int numSocio) throws ArticuloAlquiladoException{
        Articulo a = null;
        Cliente c = null;
        for (Articulo art : listaArticulos) {
            if(art.getCodigo() == codigo){
                a = art;
            }
        }
        for (Cliente cli : listaClientes) {
            if(cli.getNumSocio() == numSocio){
                c = cli;
            }
        }
        if(a == null){
            return false;
        }
        if(c == null){
            return false;
        }
        
        if(a instanceof Pelicula && ((Pelicula) a).isAlquilada()){
            throw new ArticuloAlquiladoException("La pelicula ya está alquilada.");
        } else if(a instanceof Videojuego && ((Videojuego) a).isAlquilada()){
            throw new ArticuloAlquiladoException("El videojuego ya está alquilado.");
        }
        
        LocalDateTime fechaAlquiler = LocalDateTime.now();
        if (a instanceof Pelicula) {
            ((Pelicula) a).setFechaAlquiler(fechaAlquiler);
            ((Pelicula) a).setIsAlquilada(true);
        } else if (a instanceof Videojuego) {
            ((Videojuego) a).setFechaAlquiler(fechaAlquiler);
            ((Videojuego) a).setIsAlquilada(true);
        }
        c.añadirArticuloAlquilado(a);
        return true;
            }

	public boolean devolverArticulo(int codigo, int numSocio) throws TiempoExcedidoException{
        Articulo a = null;
        Cliente c = null;
        for (Articulo art : listaArticulos) {
            if(art.getCodigo() == codigo){
                a = art;
            }
        }
        for (Cliente cli : listaClientes) {
            if(cli.getNumSocio() == numSocio){
                c = cli;
            }
        }
        if(a == null){
            return false;
        }
        if(c == null){
            return false;
        }

        LocalDateTime fechaDevolucion = LocalDateTime.now();
        if (a instanceof Pelicula) {
            if (!((Pelicula) a).isAlquilada()) {
                return false;
            }
            Period dias = Period.between(((Pelicula) a).getFechaAlquiler().toLocalDate(), fechaDevolucion.toLocalDate());
            if(dias.getDays() >= 2){
                throw new TiempoExcedidoException("Tiempo de alquiler excedido");
            }
            ((Pelicula) a).setIsAlquilada(false);
            ((Pelicula) a).setFechaAlquiler(null);
        } else if (a instanceof Videojuego) {
            if (!((Videojuego) a).isAlquilada()) {
                return false;
            }
            Period dias = Period.between(((Videojuego) a).getFechaAlquiler().toLocalDate(), fechaDevolucion.toLocalDate());
            if(dias.getDays() >= 2){
                throw new TiempoExcedidoException("Tiempo de alquiler excedido");
            }
            ((Videojuego) a).setIsAlquilada(false);
            ((Videojuego) a).setFechaAlquiler(null);
        }
        c.eliminarArticuloAlquilado(a);
        return true;
    }
    
	
	
}