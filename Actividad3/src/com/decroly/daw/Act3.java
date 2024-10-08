package com.decroly.daw;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Realiza un programa que dada una cantidad de euros que el usuario introduce por
		//teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
		//alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
		//indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
		//programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
		//5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
		//número de billetes posible).

		System.out.println("Introduce por teclado una cantidad de euros que sea multiplo de 5 (EJ: 5,10,15,20...)");
		int dinero = sc.nextInt();
			
		if (dinero % 5 != 0){
			System.out.println("Debe ser multiplo de 5");
		}
		else {
			
			int billetes500 = 0;
			int billetes100 = 0;
			int billetes200 = 0;
			int billetes50 = 0;
			int billetes20 = 0;
			int billetes10 = 0;
			int billetes5 = 0;
			
			if(dinero % 500 >= 0) {
				billetes500 = dinero / 500; 
				dinero = dinero - (500 * billetes500);
			}
			if(dinero % 200 >= 0){
				billetes200 = dinero / 200;
				dinero = dinero - (200 * billetes200);
			}
			if (dinero % 100 >= 0) {
				billetes100 = dinero / 100;
				dinero = dinero - (100 * billetes100);
			}
			if (dinero % 50 >= 0) {
				billetes50 = dinero / 50;
				dinero = dinero - (50 * billetes50);
			}
			if (dinero % 20 >= 0) {
				billetes20 = dinero / 20;
				dinero = dinero - (20 * billetes20);
			}
			if (dinero % 10 >= 0) {
				billetes10 = dinero / 10;
				dinero = dinero - (10 * billetes10);
			}
			if (dinero % 5 >= 0) {
				billetes5 = dinero/5;
			}
	       
	          System.out.println("Necesito " + billetes500 + " billetes de 500€, " + billetes200 + " de 200€, " + billetes100 + 
	        	" de 100€, " + billetes50 + " de 50€, " + billetes20 + " de 20€, " + billetes10 + " de 10€ y " + billetes5 + " de 5€.");
			
		}
	
         System.out.println("FIN DE PROGRAMA\n");

         
         
        //2. Realiza un programa que muestre un menú de opciones como el siguiente:
         //1. Sumar
         //2. Restar
         //3. Multiplicar
         //4. Dividir (incluir manejo de división por 0)
         //5. Salir
         //El menú debe de repetirse hasta que se escoja la opción 5 (Salir).
          		
 		int calculadora = 0;
	  	System.out.println("Se va a realizar una operación matematica; ");
	  	double num1 = 0;
	  	double num2 = 0;
 		
 		do {
 			
 	 		System.out.println("Introduce el numero de la opcion que quieres realizar:");
 	 		System.out.println("1. Suma\n2. Resta\n3. Multiplicar\n4. Dividir\n5. Salir");
 			
 	 		calculadora = sc.nextInt();
 			
 			switch (calculadora) {
 		
 			case 1:
 				System.out.println("Introduce 1 numero para realizar una suma");
 	 	 		num1 = sc.nextDouble(); 
 	 	 		System.out.println("Introduce otro numero");
 	 	 		num2 = sc.nextDouble(); 
 				double suma = num1+num2;
 				System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
 				break;
 		
 			case 2:
 				System.out.println("Introduce 1 numero para realizar una resta");
 	 	 		num1 = sc.nextDouble(); 
 	 	 		System.out.println("Introduce otro numero");
 	 	 		num2 = sc.nextDouble(); 
 				double resta = num1-num2;
 				double resta2 = num2-num1;
 				System.out.println("la resta de " + num1 + " y " + num2 + " es: " + resta);
 				System.out.println("la resta de " + num2 + " y " + num1 + " es: " + resta2);
 				break;
 			
 			case 3:
 				System.out.println("Introduce 1 numero para realizar una multiplicacion");
 	 	 		num1 = sc.nextDouble(); 
 	 	 		System.out.println("Introduce otro");
 	 	 		num2 = sc.nextDouble(); 
 				double multip = num1 * num2;
 				System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es: " + multip);
 				break;
 			
 			case 4:
 				System.out.println("Introduce 1 numero para realizar una division");
 	 	 		num1 = sc.nextDouble(); 
 	 	 		System.out.println("Introduce otro numero");
 	 	 		num2 = sc.nextDouble(); 
 				double divi = num1 / num2;
 				double divi2 = num2 / num1;
 				System.out.println("la division entre " + num1 + " y " + num2 + " es: " + divi);
 				System.out.println("la division entre " + num2 + " y " + num1 + " es: " + divi2);
 				break;
 			
 			case 5:
 				System.out.println("Saliendo del programa...");
 				break;
 			}
 		
 		}while(calculadora!=5);
	}

}
