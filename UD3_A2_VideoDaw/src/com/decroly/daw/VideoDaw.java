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




	
	public String mostrarInfoCliente(){
		String infoVideoDaw = String.format("CIF: %s, Direccion: %s, Numero de socio: %s, Direccion: %s, Fecha de nacimiento: %s, Fecha de baja: %s", 
				this.cif, this.direccion, this.fechaAlta);
		return infoVideoDaw;
	}
}
