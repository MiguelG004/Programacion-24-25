package com.decroly.daw;

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
		this.fechaRegistro = fechaRegistro = LocalDate.now().toString();
		this.fechaBaja = fechaBaja = LocalDate.now().toString();
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
				this.titulo, this.genero, this.fechaRegistro, this.fechaBaja, this.fechaAlquiler, this.isAlquilada);
		return infopeli;
	}
	
	public void elegirGenero() { 
		do {
			switch (genero) {
			case DRAMA:
				Genero genero = Genero.DRAMA;
				genero = Genero.DRAMA;
				break;
			case SCIFI:
				break;
			case MUSICAL: 
				break;
			case AVENTURA:
				break;
			case ACCION: 
				break;
			case COMEDIA:
				break;
			case DOCUMENTAL:
				break;
			case FANTASIA:
				break;
			case ANIMADO:
				break;
			case CRIMINAL:
				break;
			default:
				System.out.println("Por favor, introduzca alguno de los generos que se le ofrecen");
				break;
			}
		}while(genero.equals(genero));
	}

}
