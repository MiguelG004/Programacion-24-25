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
		
		//do while que se repite hasta que se valide el iban mediante el metodo de validar iban
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
		//Creo una variable de la clase CuentaBancaria, para poder utilizar los metodos de esta
		CuentaBancaria cb = new CuentaBancaria(iban, titular); //establece como iban y titular mediante el scanner
		String opcion = "";		
		
		//do while del menu, se repite hasta que se elige la opcion salir
		do {
			sc = new Scanner(System.in);
			System.out.println("Elige una opción:");
			System.out.println("1: Datos de la cuenta\n2: IBAN\n3: Titular\n4: Saldo\n5: Ingreso\n6: Retirada\n7: Movimientos\n8: Salir");
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			case "1":
				System.out.println(cb.mostrarInfoCuenta()); //imprime el metodo mostrarInfoCuenta a traves de la variable que cree de la clase
				System.out.println("************************");
				break;
			
			case "2":
				System.out.println("Tu iban es:"); 
				System.out.println(cb.getIban()); //imprime el metodo getIban a traves de la variable que cree de la clase
				System.out.println("************************");
				break;
			
			case "3":
				System.out.println(cb.getTitular()); //imprime el metodo para obtener el titular con la clase cb
				System.out.println("************************");
				break;
			
			case "4":
				System.out.println(cb.getSaldo() + "€"); //imprime el saldo con la variable cb  de la clase cuenta bancaria
				System.out.println("************************");
				break;
			
			case "5":
				sc = new Scanner(System.in);
				String tipo = "ingreso";
				double cantidad = 0.0; // creo la variable cantidad para poder utilizarla aqui
				
				do {
					System.out.println("Introduzca que cantidad quieres INGRESAR");
					cantidad = sc.nextDouble();
					if(cantidad <= 0){
				        System.out.println("La cantidad debe ser mayor que 0.");
				    }
				    if(cantidad >= 3000){
				        System.out.println("IMPORTANTE: Notificar a hacienda.");
				    }
					if(cantidad > 0) {
						System.out.println("Se ha ingresado correctamente " + cantidad + "€");
					}
				
				}while(cantidad < 0);	
				System.out.println("Tipo de movimiento: Ingreso");
				//llama al metodo ingresar y le inserta la cantidad pedida por teclado
				cb.ingresar(cantidad);
				System.out.println("Saldo actual: " + cb.getSaldo());
				System.out.println("************************");
				break;
			
			case "6":
				sc = new Scanner(System.in);
				tipo = "retirar";
				cantidad = 0.0;
				double saldo;
				do {
					System.out.println("Introduzca que cantidad quieres RETIRAR");
					cantidad = sc.nextDouble();
					//me creo una variable saldo, que obtiene el saldo de la clase cuenta bancaria, y hace una resta para saber si se ha pasado de 50 euros negativos
					saldo = cb.getSaldo()-cantidad;
					
					if(cantidad <= 0){
			            System.out.println("La cantidad debe ser mayor que 0.");
			        }
			        if(cantidad >= 3000){
			            System.out.println("IMPORTANTE: Notificar a hacienda.");
			        }
			        if(saldo <= -50){
			            System.out.println("AVISO: no se puede tener la cuenta en -50");
			            System.out.println("Saldo actual " + (cb.getSaldo()+cantidad));
			        }
					if(saldo >= -50) {
						System.out.println("Se ha retirado correctamente " + cantidad + "€");
					}
				
				}while(saldo <= -50);	
		     	System.out.println("Tipo de movimiento: Retirada");
		     	//cb.retirar hace lo mismo que cb.ingresar
				cb.retirar(cantidad);
				System.out.println("Saldo actual: " + cb.getSaldo());
				System.out.println("************************");
				break;
			
			case "7":
				//llama al metodo mostrar infoMovimiento de la clase Cuenta bancaria
				cb.mostrarMovimiento();
				System.out.println("*********************************************************************************");
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
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return iban.matches("[A-Z]{2}[0-9]{2}[A-Z0-9]{20}");
    }


}
