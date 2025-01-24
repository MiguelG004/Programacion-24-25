package com.decroly.daw;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		Taller taller = new Taller();
	    Scanner sc = new Scanner(System.in);
	    String op = "";
	    String matricula = "asdsadsa";

	    do {
	    	sc = new Scanner(System.in);
	    	System.out.println("\n*** Menú ***");
	    	System.out.println("1. Añadir coche");
	    	System.out.println("2. Eliminar coche");
	    	System.out.println("3. Salir");
	    	System.out.print("Elige una opción: ");
	        op = sc.nextLine();

	        switch (op) {
	        	case "1":
	        		System.out.println("Vamos a añadir un coche");
	        		System.out.println("Introduce su matricula, por favor: ");
	        		matricula = sc.nextLine();
	        		System.out.println("A continuación, introduce los datos del coche");
	        		System.out.println("Introduzca la marca del coche: ");
	        		String marca = sc.nextLine();
	        		System.out.println("Introduzca el color del coche: ");
	        		String color = sc.nextLine();
	        		Coche coche = new Coche(color, marca);
	        		taller.añadeElemento(matricula, coche);
	        		break;
	        	
	        	case "2":
	        		System.out.println("Elimina un coche por su matricula");
	        		System.out.println("Escribe la matricula del coche que quieras eliminar: ");
	        		matricula = sc.nextLine();
	        		taller.eliminarElemento(matricula);
	        		break;
	        	
	        	case "3":
	        		System.out.println("");
	        		System.out.println("Saliendo...");
	        	
	        		taller.visualizaTaller();
	        		taller.visualizaCoche();
	        		taller.visualizaMatricula();
	        		break;
	        	
	        	default:
	        		System.out.println("Opción no válida. Intenta otra opcion.");
	        		break;
	        }
	        
	        } while(!op.equals("3"));
	}

}
