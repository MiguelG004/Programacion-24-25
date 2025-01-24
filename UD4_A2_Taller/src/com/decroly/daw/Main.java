package com.decroly.daw;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {

		
		Taller taller = new Taller();
	    Scanner sc = new Scanner(System.in);
	    String op = "";
	    String matricula = "";
	    Coche coche = new Coche("sda","dads");

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
	        		taller.añadeElemento(matricula, coche );
	        		break;
	        	
	        	case "2":
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
