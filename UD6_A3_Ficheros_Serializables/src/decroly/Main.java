package decroly;

import java.util.LinkedList;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		String op;
		LinkedList <Libro> lista = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String isbn, titulo, autor;
		LocalDate fechaPublicacion;
		
		System.out.println("BIENVENIDO A BIBLIODAW");
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Por favor, seleccione una opción");
			System.out.println("1. Crear libro y registrarlo en Bibliodaw");
			System.out.println("2. Mostrar libros existentes");
			System.out.println("3. Guardar libros en el fichero");
			System.out.println("5. Guardar y salir");
			op = sc.nextLine();
			
			switch(op) {
			
			case "1":
				System.out.println("Vamos a crear un libro: ");
				
				
				System.out.print("Introduce la fehca de publicación (dd/mm/yyyy)");
        		String fechaN = sc.nextLine();
        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            	fechaPublicacion = LocalDate.parse(fechaN, formatter);
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "4":
				break;
				
			case "5":
				System.out.println( );
				break;
				
			default:
				System.out.println("Ha ocurrido un error");
				System.out.println("********************");
				break;
			}
			
		}while(!op.equals("5"));
	}

}
