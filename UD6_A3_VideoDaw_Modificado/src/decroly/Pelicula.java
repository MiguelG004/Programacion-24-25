package decroly;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Pelicula extends Articulo {

	private GeneroPelicula generoPeli;
	private LocalDateTime fechaAlquiler;
	private boolean isAlquilada;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
	
	public Pelicula(int codigo, String titulo, LocalDate fechaRegistro, LocalDate fechaBaja,
			GeneroPelicula generoPeli, LocalDateTime fechaAlquiler, boolean isAlquilada) {
		super(codigo, titulo, fechaRegistro, fechaBaja);
		this.generoPeli = generoPeli;
		this.fechaAlquiler = LocalDateTime.now();
		this.isAlquilada = isAlquilada;
	}
	//otro constructor para usar en el main con los datos que usaré
	public Pelicula(String titulo, GeneroPelicula generoPeli) {
		super(titulo);
		this.generoPeli = generoPeli;
		this.fechaAlquiler = LocalDateTime.now();
		this.isAlquilada = isAlquilada;
	}
	

	

	public GeneroPelicula getGeneroPeli() {
		return generoPeli;
	}


	public LocalDateTime getFechaAlquiler() {
		return fechaAlquiler;
	}


	public boolean isAlquilada() {
		return isAlquilada;
	}


	public DateTimeFormatter getFormatter() {
		return formatter;
	}


	@Override
	public String toString() {
		return "Pelicula [generoPeli=" + generoPeli + ", fechaAlquiler=" + fechaAlquiler + ", isAlquilada="
				+ isAlquilada + "]";
	}
	
	
	
	
}
