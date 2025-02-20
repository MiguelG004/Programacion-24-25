package decroly;

import java.util.LinkedList;



public class Producto {

	public static LinkedList<Producto> lista = new LinkedList<>();
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
		
	
	public boolean añadeProducto(String nombre, int cantidad, double precio){
		if(nombre != null) {
			lista.add(new Producto(nombre, cantidad, precio));
			this.codigo++;
			return true;
		}
		return false;	
	}
	
	
	public static void listadoProductos(){
        for(Producto pr : lista){
            System.out.println(pr);
        }
	}
	
	public boolean eliminaContacto(int codigo) {
		boolean eliminado = false;
		for (Producto pr : lista) {
            if (pr.getCodigo() == (codigo)) {
                lista.remove(pr);
                eliminado = true;
                return eliminado;
            }
        }
        return eliminado;
	}
	

	 public static String stringToFile(LinkedList<Producto> productos){
	        String listado ="";
	        for(Producto p : productos){
	            listado += p.getCodigo() + "," + p.getNombre() + "," + p.getCantidad() + "," + p.getPrecio();
	        }
	        return listado;
	    }
	
	
}
