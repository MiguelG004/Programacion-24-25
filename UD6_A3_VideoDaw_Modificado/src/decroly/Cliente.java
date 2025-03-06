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
		this.listaAlquilados = new LinkedList<>();
	}

	
	public int getNumSocio() {
		return numSocio;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	
	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public LinkedList<Articulo> getListaAlquilados() {
		return listaAlquilados;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Persona [numSocio = " + numSocio + super.toString() +  ", articulos Alquilados = " + listaAlquilados + "]";
	}
	
	
	
	 public void añadirArticuloAlquilado(Articulo a) {
		 this.listaAlquilados.add(a);
	    }

	  public void eliminarArticuloAlquilado(Articulo a) {
	    this.listaAlquilados.remove(a);
	   }

	   public String mostrarArticulosAlquilados(){
	        Iterator <Articulo> itera = listaAlquilados.iterator();
	        Articulo art = null;
	        while (itera.hasNext()){
	            art = itera.next();
	        }
	        return art.toString();
	    }
	
	
	
	
}