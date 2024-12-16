package com.decroly.daw;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
	private static int contador = 0;
	private int cod;
	private String titulo;
	private Genero genero;
	private String fechaRegistro;
	private String fechaBaja;
	private String fechaAlquiler;
	private boolean isAlquilada;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

	
    public Pelicula() {
    	
    }
	//constructores
	public Pelicula(String titulo, Genero genero){
		this.cod = this.contador;
		this.contador++;
		this.titulo = titulo;
		this.genero = genero;
		this.fechaRegistro = fechaRegistro = LocalDateTime.now().format(formatter);
		this.fechaBaja = fechaBaja = LocalDateTime.now().format(formatter);
		this.fechaAlquiler = fechaAlquiler = LocalDateTime.now().format(formatter);
		this.isAlquilada = isAlquilada;
	}
	
	
	public int getCod() {
		return this.cod;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public Genero getGenero() {
		return this.genero;
	}
	public String getFechaRegistro() {
		return this.fechaRegistro;
	}
	public String getFechaBaja() {
		return this.fechaBaja;
	}
	public String getFechaAlquiler() {
		return this.fechaAlquiler;
	}
	public boolean isAlquilada() {
		return this.isAlquilada;
	}
	
	
	public String mostrarInfoPelicula(){
		String infopeli = String.format("Titulo: %s, Genero: %s, Fecha de registro: %s, Fecha de baja: %s, Fecha de alquiler: %s, ¿Alquilada?: %s, Cod: %s", 
				this.titulo, this.genero, this.fechaRegistro, this.fechaBaja, this.fechaAlquiler, this.isAlquilada, this.cod);
		return infopeli;
	}
	
	public boolean alquilarPelicula(){ 
	       this.isAlquilada = true;
	       this.fechaAlquiler = LocalDateTime.now().format(formatter);
	       return isAlquilada;
	}

	 public boolean devolverPelicula(){
	       this.isAlquilada = false;
	       fechaBaja = LocalDateTime.now().format(formatter);
	       return isAlquilada;
	    }
	
}
