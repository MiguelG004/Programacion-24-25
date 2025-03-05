package decroly;
import java.time.*;
import java.util.LinkedList;
import java.util.Iterator;
import java.time.format.*;
public class Cliente extends Persona{

	private int numSocio;
	private LocalDate fechaBaja;
	private LinkedList <Articulo> listaAlquilados;
	private static int contador = 1;
	DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {
		super(dni, nombre, direccion, fechaNacimiento);
		this.numSocio = this.contador;
		this.contador++;
		this.fechaBaja = fechaBaja;
		this.listaAlquilados = listaAlquilados;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public LinkedList<Articulo> getListaAlquilados() {
		return listaAlquilados;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return super.toString() + ", numSocio = " + numSocio  + ", articulosAlquilados = "
				+ listaAlquilados + "]";
	}
	
	
	
	 public void agregarArticuloAlquilado(Articulo articulo) {
		 listaAlquilados.add(articulo);
	    }

	    public void eliminarArticuloAlquilado(Articulo articulo) {
	    	listaAlquilados.remove(articulo);
	    }

	    public String mostrarArticulosAlquilados(){
	        Iterator <Articulo> itera = listaAlquilados.iterator();
	        Articulo cadaArticulo = null;
	        while (itera.hasNext()){
	            cadaArticulo = itera.next();
	        }
	        return cadaArticulo.toString();
	    }
	
	
	
	
}
