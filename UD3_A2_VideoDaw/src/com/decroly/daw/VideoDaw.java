package com.decroly.daw;

public class VideoDaw {

	private int cif;
	private String direccion;
	private String fechaAlta;
	Pelicula[] peliculasRegistradas;
	Cliente[] clientesRegistrados;
	
	
	
	
	public int getCif() {
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
}
