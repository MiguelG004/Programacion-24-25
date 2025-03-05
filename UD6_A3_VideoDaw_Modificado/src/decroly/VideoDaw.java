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

	public LinkedList<Articulo> getArticulosRegistrados() {
		return listaArticulos;
	}

	public LinkedList<Cliente> getClientesRegistrados() {
		return listaClientes;
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
	
	public boolean darBajaCliente(Cliente c){
        listaClientes.remove(c);
        return true;
    }
	
	public Cliente posicionCliente(int i){
        if (i >= 0 && i < listaClientes.size()) {
            return listaClientes.get(i);
        }
        return null;
    }
	
	
	public String mostrarArticulosNoAlquilados(VideoDaw videoclub) {
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
 
	
    
	
}
