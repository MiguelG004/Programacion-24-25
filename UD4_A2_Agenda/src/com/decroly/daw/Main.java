package com.decroly.daw;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		String op = "";
		
		System.out.println("********************************");
		System.out.println("BIENVENIDO A TU AGENDA PERSONAL");
		System.out.println("********************************");
		System.out.println("");
		
		do {
			System.out.println("************************************");
			System.out.println("Elija que opción desea utilizar: ");
			System.out.println("1. Añadir un contacto");
			System.out.println("2. Buscar un contacto");
			System.out.println("3. Eliminar un contacto");
			System.out.println("4. Visualizar la agenda");
			System.out.println("5. Numero de contactos de mi agenda");
			System.out.println("************************************");
			op = sc.nextLine();
			
			switch(op) {
			
			case "1":
				sc = new Scanner(System.in);
				System.out.println("Vamos a añadir un contacto");
        		System.out.println("Introduce su nombre, por favor: ");
        		String nombre = "";
        		do {
                    nombre = sc.nextLine();
                    if(agenda.comprobarContacto(nombre)) {
                    	System.out.println("Error, se ha encontrado un contacto con un nombre identico");
                    	System.out.println("Introduce otro nombre nuevamente: ");
                    }
                } while (agenda.comprobarContacto(nombre));
                    
        		System.out.println("*********************************************");
        		System.out.println("A continuación, introduce el telefono: ");
        		
        		String telefono = "";
        		do {
                    telefono = sc.nextLine().toUpperCase();
                    if(!agenda.validarTelefono(telefono)) {
                    	System.out.println("Error, formate de telefono incorrecto");
                    	System.out.println("Intente que empiece por 6, 7 o 9 (ej: 612345672): ");
                    }
                } while (!agenda.validarTelefono(telefono));
        		
        		System.out.println("A continuación, introduce el correo: ");
        		String correo = "";
        		do {
                    correo = sc.nextLine().toUpperCase();
                    if(!agenda.validarCorreo(correo)) {
                    	System.out.println("Error, formato de correo incorrecto");
                    	System.out.println("Ejemplo: correo@gmail.com ");
                    }
                } while (!agenda.validarCorreo(correo));
        		
        		Contacto contacto = new Contacto(nombre, telefono, correo);
        		agenda.añadeContacto(nombre, telefono, correo);
				break;
				
			case "2":
				sc = new Scanner(System.in);
				System.out.println("Intoduce el nombre del contacto que quieras buscar: ");
				nombre = sc.nextLine();
				if(agenda.buscaContacto(nombre)){
                    System.out.println(agenda.buscaContacto(nombre) + " ha sido encontrado");
                }else{
                    System.out.println("El contacto no existe en tu agenda");
                }
				break;
				
			case "3":
				sc = new Scanner(System.in);
				System.out.println("Introduce el nombre del contacto que quieras eliminar");
				nombre = sc.nextLine();
				agenda.eliminaContacto(nombre);
				System.out.println("El contacto fue eliminado");
				break;
				
			case "4":
				System.out.println(agenda.visualizaAgenda());
				break;
				
			case "5": 
				System.out.println("Su agenda tiene un total de: " + agenda.getContador() + " contactos");
				break;
				
			case "6":
				System.out.println("Saliendo...");
				break;
			}
			
		}while(op != "6");
	}

}
