package decroly;
import java.time.*;
public class Articulo {

	private int codigo;
	private String titulo;
	private LocalDate fechaRegistro;
	private LocalDate fechaBaja;
	private static int contador;
	
	public Articulo(int codigo, String titulo, LocalDate fechaRegistro, LocalDate fechaBaja) {
		this.codigo = this.contador;
		this.contador++;
		this.titulo = titulo;
		this.fechaRegistro = fechaRegistro;
		this.fechaBaja = fechaBaja;
	}
	//constructor solo con titulo, ya que será lo unico que use para crear un objeto de clase articulo
	public Articulo(String titulo) {
		this.codigo = this.contador;
		this.contador++;
		this.titulo = titulo;
		this.fechaRegistro = fechaRegistro;
		this.fechaBaja = fechaBaja;
	}

	public int getCodigo() {
		return codigo;
	}
	
	private int getContador() {
		return contador;
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", titulo=" + titulo + ", fechaRegistro=" + fechaRegistro + ", fechaBaja="
				+ fechaBaja + "]";
	}
	
	
	
	
}
