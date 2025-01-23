package com.decroly.daw;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<Producto> linkedList = new LinkedList<>();  
		  
		//anadir 5 objetos producto
		 Producto p1 = new Producto("Producto 1", 1);
		 Producto p2 = new Producto("Producto 2", 2);
		 Producto p3 = new Producto("Producto 3", 3);
		 Producto p4 = new Producto("Producto 4", 4);
		 Producto p5 = new Producto("Producto 5", 5);

		 linkedList.add(p1); 
		 linkedList.add(p2); 
		 linkedList.add(p3); 
		 linkedList.add(p4); 
		 linkedList.add(p5);
		  
		 
		//iterator
		 Iterator<Producto> itera = linkedList.iterator();
		 System.out.println("Lista de productos iniciales:");
		 while (itera.hasNext()) {
			 System.out.println(itera.next());
		 }
		 System.out.println("");
		 
		 
		 //eliminar 2 productos
		 linkedList.remove(p1);
		 linkedList.remove(p2);
		 //imprimir producto eliminando 2 objetos
		 Iterator<Producto> itera0 = linkedList.iterator();
		 System.out.println("Lista de productos despues de eliminar 2 objetos:");  
		 while (itera0.hasNext()) {
			System.out.println(itera0.next());
		 }
		
		//añadir objeto en medio
		Producto p6 = new Producto("Producto 6", 6);
		linkedList.add(1, p6);
		System.out.println("");
		System.out.println("Lista de productos despues de añadir un producto:");
		Iterator<Producto> itera1 = linkedList.iterator();
		Producto linked1 = null;
		while (itera1.hasNext()) {   
			System.out.println(itera1.next());
		}
		System.out.println("");
			 
			  
		// Ordenar la lista por nombre
		Collections.sort(linkedList);
		// Imprimir productos después de ordenar
		System.out.println("Lista de productos despues de ordenarla:");
		for (Producto a : linkedList) {
			System.out.println(linkedList);
		    break;
		      }
		System.out.println("");

		//vaciar lista
		linkedList.clear();
		System.out.println("Lista de roductos despues de eliminarla:");
		if (linkedList.isEmpty()) {
			System.out.println("No hay productos");
		} else {
			linkedList.clear();
			System.out.println("Se eliminaron los productos");
		      }
		}
	}


