package com.decroly.daw;
import java.lang.ProcessHandle.Info;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		menu();
		
	}
	

		//creo el metodo constructor del menú
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el IBAN: ");
		String iban = sc.nextLine();
		System.out.print("Introduzca el titular: "); 
		String titular = sc.nextLine();
		Double saldo = 0.0;
		CuentaBancaria cb = new CuentaBancaria(iban, titular, saldo);
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
				System.out.println(cb.getSaldo());
				break;
			
			case "5":
				sc = new Scanner(System.in);
				String tipo ="ingreso";
				Double cantidad = 0.0;
				
				if(tipo == "ingreso") {
					System.out.println("Tipo de movimiento: Ingreso");
					do {
						 sc = new Scanner(System.in);
						System.out.println("Introduzca que cantidad quieres ingresar");
						cantidad = sc.nextDouble();
						if(cantidad < 0) {
							saldo = saldo + cantidad;
						}
						else {
							System.out.println("No puedes ingresar una cantidad negativa o nada");
						}
					
					}while(cantidad > 0);
					
				}
				
				
				System.out.println(cb.movimiento(tipo, saldo));
				break;
			
			case "6":
				
				sc = new Scanner(System.in);
				tipo ="retirada";
				cantidad = 0.0;
				if(tipo == "retirada") {
					System.out.println("Tipo de movimiento: Ingreso");
					do {
						sc = new Scanner(System.in);
						System.out.println("Introduzca que cantidad quieres ingresar");
						cantidad = sc.nextDouble();
						if(cantidad < 0) {
							saldo = saldo - cantidad;
							}
						else {
							System.out.println("No puedes retirar una cantidad negativa");
						}
						
					}while(cantidad < 0);				
				}
				break;
			
			case "7":
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

	
	public String comprobarIban() {
		
		Scanner sc = new Scanner(System.in);
        Pattern pat = Pattern.compile("[A-Z a-z][0-9]{7,8}");
        System.out.print("Introduce un IBAN correcto: ");
        String iban = sc.nextLine();
        Matcher mat = pat.matcher(iban);

       while(!mat.matches()){

           System.out.println("El IBAN introducido es incorrecto, por favor "
                   + "introduzca un IBAN válido.");
           System.out.print("Introduce un IBAN correcto:");
           iban = sc.nextLine();
           mat = pat.matcher(iban);

       }

        System.out.println("Bien, el IBAN " + iban + " es un IBAN válido");

        return iban;
    }


}
