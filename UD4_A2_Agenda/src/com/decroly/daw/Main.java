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
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "4":
				break;
				
			case "5": 
				break;
				
			default:
				System.out.println("Vaya, algo ha salido mal");
				System.out.println("Por favor, vuelva a elegir otra opción");
				break;
			}
			
		}while(op != "6");
	}

}
