package dawbank;

import java.util.Scanner;
import java.time.LocalDate;

public class Dawbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
		 System.out.println("Ingresa nombre del titular:");
	        String nombre = sc.nextLine();

	        System.out.println("Ingresa DNI del titular:");
	        String dni = sc.nextLine();

	        System.out.println("Ingresa fecha de nacimiento (YYYY-MM-DD):");
	        LocalDate fechaNacimiento = null;
	        while (fechaNacimiento == null) {
	            try {
	                fechaNacimiento = LocalDate.parse(sc.nextLine());
	            } catch (Exception e) {
	                System.out.println("Fecha inválida. Inténtalo nuevamente (Formato: YYYY-MM-DD):");
	            }
	        }
	        System.out.println("Ingresa teléfono del titular:");
	        String tlf = sc.nextLine();

	        System.out.println("Ingresa email del titular:");
	        String email = sc.nextLine();

	        System.out.println("Ingresa dirección del titular:");
	        String direccion = sc.nextLine();
		

		Cliente cliente = new Cliente(nombre, dni, fechaNacimiento, tlf, email, direccion);
		CuentaBancaria cb = new CuentaBancaria(iban, cliente); //establece como iban y titular mediante el scanner
		String opcion = "";		
		
		//do while del menu, se repite hasta que se elige la opcion salir
		do {
			sc = new Scanner(System.in);
			System.out.println("Elige una opción:");
			System.out.println("1: Datos de la cuenta\n2: IBAN\n3: Titular\n4: Saldo\n5: Ingreso\n6: Retirada\n7: Movimientos\n8: Salir");
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			case "1":
				System.out.println(cb.toString()); //imprime el metodo mostrarInfoCuenta a traves de la variable que cree de la clase
				System.out.println("************************");
				break;
			
			case "2":
				System.out.println("Tu iban es:"); 
				System.out.println(cb.getIban()); //imprime el metodo getIban a traves de la variable que cree de la clase
				System.out.println("************************");
				break;
			
			case "3":
				System.out.println(cb.getCliente()); 
				System.out.println("************************");
				break;
			
			case "4":
				System.out.println(cb.getSaldo() + "€"); //imprime el saldo con la variable cb  de la clase cuenta bancaria
				System.out.println("************************");
				break;
			
			case "5":
				sc = new Scanner(System.in);
				double cantidad = 0.0; // creo la variable cantidad para poder utilizarla aqui
				try {
                     System.out.println("Escriba la cantidad que desee ingresar.");
                     sc = new Scanner(System.in);
                      cantidad = sc.nextDouble();
                     cb.ingresar(cantidad);
                 } catch (CuentaException e) {
                     System.out.println(e.getMessage());
                 }
			
				System.out.println("Tipo de movimiento: Ingreso");
				//llama al metodo ingresar y le inserta la cantidad pedida por teclado
			
				System.out.println("Saldo actual: " + cb.getSaldo());
				System.out.println("************************");
				break;
			
			case "6":
				sc = new Scanner(System.in);
				double saldo;
				 try {
                     System.out.println("Escriba la cantidad que desee retirar.");
                     sc = new Scanner(System.in);
                     cantidad = sc.nextDouble();
                     cb.retirar(cantidad);
                 } catch (CuentaException e) {
                     System.out.println(e.getMessage());
                 }
		     	System.out.println("Tipo de movimiento: Retirada");
		     	
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
