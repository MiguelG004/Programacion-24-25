package com.decroly.daw;

import java.time.LocalDate;

public class VideoDaw {

	private String cif;
	private String direccion;
	private String fechaAlta;
	Pelicula[] peliculasRegistradas;
	Cliente[] clientesRegistrados;
	private int peliculasTotales = 0, clientesTotales = 0;
	
	
	public VideoDaw(String cif, String direccion) {
		this.cif = cif;
		this.direccion = direccion;
		this.fechaAlta = fechaAlta = LocalDate.now().toString();
		this.peliculasRegistradas = new Pelicula[100];
		this.clientesRegistrados = new Cliente [100];
	}
	
	
	
	public String getCif() {
		return cif;
	}




	public String getDireccion() {
		return direccion;
	}


       

	public String getFechaAlta() {
		return fechaAlta;
	}




	public Pelicula[] getPeliculasRegistradas() {
		return peliculasRegistradas;
	}




	public Cliente[] getClientesRegistrados() {
		return clientesRegistrados;
	}

	public String mostrarInfoVideoClub(){
		String infoVideoDaw = String.format("CIF: %s, Direccion: %s, Fecha de alta: %s, Peliculas registradas: %s, Clientes registrados: %s", 
				this.cif, this.direccion, this.fechaAlta, this.peliculasRegistradas, this.clientesRegistrados);
		return infoVideoDaw;
	}
	

	public void mostrarPeliculasRegistradas() {
		
	}
	
	public void mostrarClientesRegistrados() {
		
	}
	
	
	public void alquilarPelicula() {
		
	}
	
	public void devolverPelicula() {
		
	}
	
	public void registrarCliente() {
		
	}
	
	public void darBajaCliente() {
		
	}
	
	
	
}
