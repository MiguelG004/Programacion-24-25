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
	        		do {
	                    matricula = sc.nextLine().toUpperCase();
	                    if(!taller.comprobarMatricula(matricula)) {
	                    	System.out.print("Error, introduzca una matricula valida, por favor.");
	                    	System.out.println("(Ejemplo: 1234ABC): ");
	                    }
	                    if(taller.validarMatricula(matricula)) {
	                    	System.out.println("Error, se ha encontrado una matricula identica");
	                    	System.out.println("Introduce otra matricula nuevamente: ");
	                    }
	                } while (!taller.comprobarMatricula(matricula) || taller.validarMatricula(matricula));
	        		System.out.println("*********************************************");
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
	        		matricula = sc.nextLine().toUpperCase();
	        		if(!taller.validarMatricula(matricula)) {
                    	System.out.println("Error, no se ha encontrado ninguna matricula");
                    	System.out.println("No se ha eliminado ninguna matricula");
                    }
	        		else {
		        		taller.eliminarElemento(matricula);

	        		}
	        		taller.visualizaTaller();
	        		System.out.println("************");
	        		break;
	        	
	        	case "3":
	        		System.out.println("");
	        		System.out.println("Saliendo...");
	        	
	        		taller.visualizaMatricula();
	        		System.out.println("");
	        		taller.visualizaCoche();
	        		System.out.println("");
	        		taller.visualizaTaller();
	        		
	        		break;
	        	
	        	default:
	        		System.out.println("Opción no válida. Intenta otra opcion.");
	        		break;
	        }
	        
	        } while(!op.equals("3"));
	}

}
