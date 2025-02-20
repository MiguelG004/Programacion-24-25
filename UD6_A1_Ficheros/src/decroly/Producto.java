package decroly;

import java.util.LinkedList;



public class Producto {

	
	private int codigo;
	private String nombre;
	private int cantidad;
	private double precio;
	
	//constructor vacio
	public Producto() {
	}
	
	public Producto(String nombre, int cantidad, double precio) {
		this.codigo = 0;
		codigo++;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "[Codigo: " + codigo + ", nombre: " + nombre + ", cantidad: " + cantidad + ", precio: " + precio
				+ "]";
	}
	
	
}
