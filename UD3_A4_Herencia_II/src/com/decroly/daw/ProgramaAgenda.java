package com.decroly.daw;
import java.util.Scanner;
public class ProgramaAgenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op = "";
		Agenda[] agenda = new Agenda[10];
		Contacto[] contactos = new Contacto[10];
			
		System.out.println("Bienvenido a tu agenda personal: ");
		System.out.println("*********************************");
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Selecciona una opción: ");
			System.out.println("1. Añadir contacto\n2. Eliminar contacto\n3. Listar contactos\n4. Buscar contacto\n5. Salir");
			switch(op) {
			
			case "1":
				System.out.println("Introduce el nombre del contacto:");
                String nombre = sc.nextLine();
                System.out.println("Introduce el teléfono del contacto:");
                String telefono = sc.nextLine();
                Contacto nuevoContacto = new Contacto(nombre, telefono);
                boolean contactoAñadido = agenda.añadirContacto(nuevoContacto);
				break;
			
			case "2":
				break;
			
			case "3":
				System.out.println("Lista de contactos:");
                agenda.listarContactos();
				break;
			
			case "4":
				break;
			
			case "5":
				System.out.println("Saliendo...");
				break;
			
			default:
				System.out.println("Por favor, escoge una opcion correcta");
				break;
			}
		}while(op != "5");
	}
	
}
