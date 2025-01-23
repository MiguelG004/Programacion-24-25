package com.decroly.daw;

public class Producto implements Comparable<Producto> {

	String nombre;
	int cantidad;
	
	
	public Producto(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	  @Override
	  public int compareTo(Producto p) {
	      return Integer.compare(this.cantidad, p.getCantidad());
	  }
	
	
	
}
