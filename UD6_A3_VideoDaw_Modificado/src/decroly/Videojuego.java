package decroly;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Videojuego extends Articulo{
	
	private GeneroJuego generoJuego;
	private LocalDateTime fechaAlquiler;
	private boolean isAlquilada;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
	
	public Videojuego(int codigo, String titulo, LocalDate fechaRegistro, LocalDate fechaBaja,
			GeneroJuego generoJuego, LocalDateTime fechaAlquiler, boolean isAlquilada) {
		super(codigo, titulo, fechaRegistro, fechaBaja);
		this.generoJuego = generoJuego;
		this.fechaAlquiler = LocalDateTime.now();
		this.isAlquilada = isAlquilada;
	}

	public GeneroJuego getGeneroJuego() {
		return generoJuego;
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
		return "Videojuego [generoJuego=" + generoJuego + ", fechaAlquiler=" + fechaAlquiler + ", isAlquilada="
				+ isAlquilada + ", formatter=" + formatter + "]";
	}
	
	
	

}
