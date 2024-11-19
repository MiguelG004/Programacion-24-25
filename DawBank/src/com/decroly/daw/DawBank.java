package com.decroly.daw;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion = "";
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Elige una opción:");
			System.out.println("1: Datos de la cuenta\n2: IBAN\n3: Titular\n4: Saldo\n5: Ingreso\n6: Retirada\n7: Movimientos\n8: Salir");
			opcion = sc.nextLine();
			
			switch(opcion) {
			
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
        iban = sc.nextLine();
        Matcher mat = pat.matcher(iban);

       while(!mat.matches()){

           System.out.println("El IBAN introducido es incorrecto, por favor "
                   + "introduzca un IBAN válido.");
           System.out.print("Introduce un IBAN correcto:");
           iban = sc.nextLine();
           mat = pat.matcher(iban);

       }

        System.out.println("Bien, el IBAN " + iban + " es un IBAN válido");

    }


}
