package com.decroly.daw;

public class Producto implements Comparable<Producto>  {
	int cantidad;
	String nombre;

	    public Producto(String nombre, int cantidad) {
	        this.cantidad = cantidad;
	        this.nombre = nombre;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	    
	    @Override
	    public int compareTo(Producto p) {
	        return Integer.compare(this.cantidad, p.getCantidad());
	    }

		@Override
		public String toString() {
			return "Producto --> nombre = " + nombre + ", cantidad = " + cantidad;
		}
	    
	    

}
