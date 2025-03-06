package decroly;

import java.util.LinkedList;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		//inicializo variables
		Scanner sc = new Scanner(System.in);
		LinkedList <Libro> lista = new LinkedList<>();
		Libro l;
		String op;
		String isbn = null; 
		String titulo, autor;
		LocalDate fechaPublicacion = null; //fecha de publicacion null para que no de error por estar dentro del try catch
		
		//creo los ficheros
	
		
		System.out.println("BIENVENIDO A BIBLIODAW");
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Por favor, seleccione una opción:");
			System.out.println("1. Crear libro y registrarlo en Bibliodaw");
			System.out.println("2. Mostrar libros existentes");
			System.out.println("3. Eliminar libro por ISBN");
			System.out.println("4. Guardar libros en el fichero");
			System.out.println("5. Guardar y salir");
			op = sc.nextLine();
			
			switch(op) {
			
			case "1":
				
				System.out.println("Vamos a crear un libro: ");
				System.out.println("Introduce el ISBN");
				isbn = sc.nextLine();
				System.out.println("Introduce el titulo del libro: ");
				titulo = sc.nextLine();
				System.out.print("Introduce el nombre del autor");
				autor = sc.nextLine();
				try {
            		System.out.print("Introduce la fecha de publicacion (dd/mm/yyyy)");
            		String fechaN = sc.nextLine();
            		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                	fechaPublicacion = LocalDate.parse(fechaN, formatter);
        		}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
        			System.out.println("Hubo un error, formato de fecha incorrecto");
        			System.out.println("******************************************");
        		}
		
				l = new Libro(isbn, titulo, autor, fechaPublicacion);
				lista.add(l);
            	System.out.println("Libro creado correctamente:");
            	System.out.println(l.toString());
				System.out.println("**********************************************************");
				
				break;
				
			case "2":
				
				if(lista.isEmpty()) {
					System.out.println("Lista vacia");
					System.out.println("***********");
				}else {
					System.out.println("LISTA DE LIBROS: ");
					for (Libro lib : lista) {
						System.out.println(lib);
					}
					System.out.println("**********************************************************");
				}
				
				break;
				
			case "3":
				
				if(lista.isEmpty()) {
					System.out.println("La lista esta vacia");
					System.out.println("*******************");
				}else {
					System.out.println("Se va a eliminar un libro: ");
					for (Libro lib : lista) {
						System.out.println(lib);
					}
					System.out.println("Escribe el isbn del libro a eliminar:");
					isbn = sc.nextLine();
					for(Libro lib : lista){
			            if(lib.getIsbn().equals(isbn)){
			                l = lib;
			                lista.remove(l);
			            }
			        }
				}
				
				break;
				
			case "4":
				System.out.println("Guardando archivos en fichero...");
				
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

	private static boolean validarISBN(String isbn){
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return isbn.matches("[A-Z]{1}[0-9]{8}");
    }
	
}
