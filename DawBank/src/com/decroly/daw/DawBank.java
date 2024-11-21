package com.decroly.daw;
import java.lang.ProcessHandle.Info;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {

	public static void main(String[] args) {

	
		System.out.println("Crea tu cuenta de DawBank");

		//se inicializa el metodo de menu
		menu();
		
	}
	

	//creo el metodo del menú
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		String iban ="";
		
		do {
			//Utilizar ES7921000813610123456789 para comprobar que funciona
			System.out.print("Introduzca el IBAN: ");
			iban = sc.nextLine();
			if(!validarIban(iban)){
				System.out.println("Iban no valido, por favor, introduce un correcto");
			}
		}while(!validarIban(iban));
		
		System.out.print("Introduzca el titular: "); 
		String titular = sc.nextLine();
		CuentaBancaria cb = new CuentaBancaria(iban, titular);
		String opcion = "";		
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Elige una opción:");
			System.out.println("1: Datos de la cuenta\n2: IBAN\n3: Titular\n4: Saldo\n5: Ingreso\n6: Retirada\n7: Movimientos\n8: Salir");
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			case "1":
				System.out.println(cb.mostrarInfoCuenta());
				break;
			
			case "2":
				System.out.println(cb.getIban());
				break;
			
			case "3":
				System.out.println(cb.getTitular());
				break;
			
			case "4":
				System.out.println(cb.getSaldo() + "€");
				break;
			
			case "5":
				sc = new Scanner(System.in);
				String tipo = "ingreso";
				double cantidad = 0.0;
				do {
					System.out.println("Introduzca que cantidad quieres ingresar");
					cantidad = sc.nextDouble();
					if(cantidad > 0) {
						System.out.println("Se ha ingresado correctamente " + cantidad + "€");
					}
					else {
						System.out.println("No puedes ingresar una cantidad negativa o nada");
					}
				
				}while(cantidad < 0);	
				
				cb.ingresar(cantidad);
			
				break;
			
			case "6":
				
				sc = new Scanner(System.in);
				tipo = "ingreso";
				cantidad = 0.0;
				do {
					System.out.println("Introduzca que cantidad quieres ingresar");
					cantidad = sc.nextDouble();
					if(cantidad > 0) {
						System.out.println("Se ha retirado correctamente " + cantidad + "€");
					}
					else {
						System.out.println("No puedes ingresar una cantidad negativa o nada");
					}
				
				}while(cantidad < 0);	
				
				cb.retirar(cantidad);
				
				break;
			
			case "7":
				cb.mostrarMovimiento();
				break;
			
			case "8":
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.out.println("Elige una opcion correcta");
				System.out.println();
				
				
			}
			
		}while(!opcion.equals("8"));
		
	}

	
	private static boolean validarIban(String iban){
        
		return iban.matches("[A-Z]{2}[0-9]{2}[A-Z0-9]{20}");
    }


}
