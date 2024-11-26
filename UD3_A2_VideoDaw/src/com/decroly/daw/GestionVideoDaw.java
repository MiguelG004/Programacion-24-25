package com.decroly.daw;
import java.util.Scanner;
public class GestionVideoDaw {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}
	

	public static void menu() {
		
		String opcion ="";
		
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una opción");
			System.out.println("1.Crear y registrar videoclub\n2.Registrar pelicula en el videoclub\n"
					+ "3. Crear y registrar cliente\n4.Alquilar película\n5.Devolver pelicula\nDar de baja cliente"
					+ "\n7.Dar de baja pelicula\n8.Salir");
			
			opcion = sc.nextLine();
			switch(opcion){
			
			case "1":
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "4":
				break;
				
			case "5":
				break;
				
			case "6":
				break;
				
			case "7":
				break;
				
			case "8":
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Introduce una opcion correcta");
				break;
			}
		}while(!opcion.equals("8"));
		
	}
	
}
