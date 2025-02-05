import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       	//EJERCICIO 1
		//ejercicio1();
		System.out.println("**************************************");
		//EJERCICIO 2
		//ejercicio2();
		System.out.println("**************************************");
		//EJERCICIO 3
		ejercicio3();
		System.out.println("**************************************");
		//EJERCICIO 4
		ejercicio4();
		System.out.println("**************************************");
		//EJERCICIO 5
		ejercicio5();
		System.out.println("**************************************");
		//EJERCICIO 6
		ejercicio6();
	}

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce un numero entero valido: ");
			int a = sc.nextInt();
			System.out.println("El valor introducido es: " + a);
		}
		catch(InputMismatchException e) {
			System.out.println("Valor introducido no valido");
			System.out.println(e.getClass().toString());
		}	
		
	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Se va a realizar una division A/B");
			System.out.println("Dame el valor A: ");
			int a = sc.nextInt();
			System.out.println("Dame el valor B: ");
			int b = sc.nextInt();
			System.out.println("El resultado es: " + a/b);
		}
		catch(InputMismatchException e) {
			System.out.println("Valor introducido no valido");
			System.out.println(e.getClass().toString());
		}	
		catch(ArithmeticException e){
			System.out.println("Al parecer ha ocurrido un error durante la operación");
			System.out.println(e.getClass().toString());
		}
		
	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		double[] vector = new double[5];
		int limiteVector = 0;
		System.out.println("Introduce numeros para llenar un vector de longitud 5");
			
			do { 
				try {
					System.out.println("Introduce un numero: ");
					vector[limiteVector] = sc.nextDouble();
					
				}
				catch(InputMismatchException e){
					System.out.println("Vaya, has introducido un valor no valido");
				
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Te has pasado del limite del vector");
				}
				
				limiteVector++;
				
			} while (limiteVector <= 5);
		
		
	}
	
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
	
		try {
			
		}
		catch(Exception e) {
			
		}	
		
	}
	
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
	
		try {
			
		}
		catch(Exception e) {
			
		}	
		
	}
	
	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
	
		try {
			
		}
		catch(Exception e) {
			
		}	
		
	}
}
