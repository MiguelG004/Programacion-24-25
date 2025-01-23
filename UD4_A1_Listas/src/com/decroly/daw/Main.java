package com.decroly.daw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {


		
		//Creo el arrayList
		ArrayList<Producto> productos = new ArrayList<>(5);
		
		Producto p1 = new Producto ("Producto 1", 1);
		Producto p2 = new Producto("Producto 2", 2);
		Producto p3 = new Producto("Producto 3", 3);
		Producto p4 = new Producto("Producto 4", 4);
		Producto p5 = new Producto("Producto 5", 5);
		
		//añado los productos a la lista
		productos.add(p1); 
		productos.add(p2); 
		productos.add(p3); 
		productos.add(p4); 
		productos.add(p5);
		
		//iterator
		
		Iterator<Producto> itera = productos.iterator();
		Producto p;
		System.out.println("Productos iniciales:");
		while (itera.hasNext()) {
			p = itera.next(); 
			System.out.println(p.getNombre() + ", " + p.getCantidad() + "u");	
		}
		System.out.println("");
		
		
		//elimino dos objetos de la lista
		productos.remove(p2);
		productos.remove(p3);
		//imprimir producto eliminando 2 objetos
		System.out.println("Lista de roductos despues de eliminar dos objetos:");
		for (Producto producto : productos) {
		    System.out.println(producto.getNombre() + ", " + producto.getCantidad() + "u");
		}
		System.out.println("");
		
		  //añadir objeto en medio
		Producto p6 = new Producto("Producto 6", 6);
		productos.add(2, p6);

		//imprimir producto despues de añadir objeto 
		System.out.println("Lista de productos despues de anadir un producto en la mitad:");
		Iterator<Producto> itera1 = productos.iterator();
		Producto producto = null;
		while (itera1.hasNext()) {
		    producto = itera1.next(); 
		    System.out.println(producto.getNombre() + ", " + producto.getCantidad() + "u");
		}
		System.out.println("");
		
		// Ordenar la lista por nombre
		Collections.sort(productos);
		// Imprimir productos después de ordenar
		System.out.println("Lista de roductos despues de ordenarla:");
		for (Producto a : productos) {
				System.out.println(a.getNombre() + ", " + a.getCantidad() + "u");
		 }
		System.out.println("");
		
		
		//Elimina toda la lista
		productos.clear();
		System.out.println("Productos despues de eliminar:");
		for (Producto pro : productos) {
		    System.out.println(pro.getNombre() + ", " + pro.getCantidad() + "u");
		}
		if (productos.isEmpty()) {
		  System.out.println("No hay productos");
		}
		System.out.println("");
	}
		
}
