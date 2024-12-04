package com.decroly.daw;
import java.util.Scanner;
public class GestionVideoDaw {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}
	

	public static void menu() {
		
		String opcion ="";
		String cif= "";
	
		
		String direccion = "";
		VideoDaw vd = new VideoDaw(cif, direccion);
		Pelicula pel = new Pelicula();
		Cliente cli = new Cliente();
		
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una opción");
			System.out.println("1.Crear y registrar videoclub\n2.Registrar pelicula en el videoclub\n"
					+ "3. Crear y registrar cliente\n4.Alquilar película\n5.Devolver pelicula\nDar de baja cliente"
					+ "\n7.Dar de baja pelicula\n8.Salir");
			 sc = new Scanner(System.in);
			opcion = sc.nextLine();
			switch(opcion){
			
			case "1":
				boolean isCreada = false;
				
					System.out.println("Creemos tu videoclub: ");
					cif = sc.nextLine();
					direccion = sc.nextLine();
					vd = new VideoDaw(cif, direccion);
					isCreada = true;
				
				
				break;
				
			case "2":
				String titulo = "";
				String genero ="";
                System.out.println("Introduce el titulo de la pelicula a registrar: ");
                titulo = sc.nextLine();
                System.out.println("Elige el genero de la pelicula");
                pel.elegirGenero();
                genero = sc.nextLine();
                Pelicula peli = new Pelicula(titulo, genero);
				break;
				
			case "3":
				break;
				
			case "4":
				cli.mostrarPeliculasAlquiladas();
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
