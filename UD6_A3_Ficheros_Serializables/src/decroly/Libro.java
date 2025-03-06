package decroly;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.io.Serializable;
public class Libro implements Serializable{
	
	private String isbn;
	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Libro(String isbn, String titulo, String autor, LocalDate fechaPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + "]";
	}
	

}
