package com.decroly.daw;
import java.util.Scanner;
public class ProgramaAgenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op = "";
		Agenda agenda = new Agenda();
		Contacto[] contactos = new Contacto[10];
		Contacto c;
		
		System.out.println("Bienvenido a tu agenda personal: ");
		System.out.println("*********************************");
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Selecciona una opción: ");
			System.out.println("1. Añadir contacto\n2. Eliminar contacto\n3. Listar contactos\n4. Buscar contacto\n5. Salir");
			op = sc.nextLine();
			switch(op) {
			
			case "1":
				System.out.println("Vas a agregar un contacto: ");
				System.out.println("Escoja el nombre: ");
				String nombre = sc.nextLine();
				System.out.println("Escriba el telefono: ");
				String telefono = sc.nextLine();
				
				c = new Contacto(nombre, telefono);
				agenda.añadirContacto(c);
				
				if(agenda.existeContacto(c.getNombre())) {
					System.out.println("El contacto no ha podido agregarse, compruebe que no exista uno con el mismo nombre.");
				}else {
					System.out.println("El contacto " + nombre + " con telefono: " + telefono + " ha sido añadido correctamente");
				}
				System.out.println("********************");
				break;
			
			case "2":
				//pido el nombre
                System.out.println("Escribe un nombre");
                nombre = sc.nextLine();

                agenda.eliminarContacto(nombre);
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