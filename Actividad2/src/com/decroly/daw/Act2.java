package com.decroly.daw;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero para multiplicar su factorial: ");
		   int n=sc.nextInt();
	for(int i = 1; i <=n; i++) {
		n = i*n;
		System.out.println("el factorial: "+ n);
		}
//1
		System.out.println("Dame tu edad: ");
		int edad = sc.nextInt();
		if (edad>=18) {System.out.println("Eres mayor de edad");}
		else {}
		
	
//2
		System.out.println("Dame tu edad: ");
		int edad1 = sc.nextInt();
		if (edad1>=18) {System.out.println("Eres mayor de edad");}
		else { System.out.println("Eres menor de edad");}
	
//3
		
		for(int i = 1; i<=20; i++) { 	// el contador empieza en el 1, y termina en el 20. se va sumando de uno en uno
			System.out.println(i);;}
		
//4
	
	System.out.println("los pares son:");
		
		for(int i = 2; i <=200; i=i+2) {   	//el contador empieza en el 2, termina en el 200 y se suma de 2 en 2
			System.out.println(i);
										}
		
//5
		System.out.println("los pares son:");
		for(int i = 2; i <=200; i=i+2) {   	//el contador empieza en el 2, termina en el 200 y se suma de 2 en 2
			if(i%2==0) {System.out.println(i);}
			else {}
			}
		
		
//6
		System.out.println("introduce el numero que quieres que cuente:");
		int cont = sc.nextInt();
		for(int i = 0; i<=cont; i++) { 
			System.out.println(i);
			}
		
///7
		System.out.println("introduce tu nota:");
		int nota = sc.nextInt();
		   switch (nota) {
           case 10:
               System.out.println("Sobresaliente");
               break;
           case 9:
               System.out.println("Sobresaliente");
               break;
           case 7:
               System.out.println("Notable");
               break;
           case 8:
               System.out.println("Notable");
               break;
           case 6:
               System.out.println("Bien");
               break;
           case 5:
               System.out.println("Suficiente");
               break;
           case 4:
               System.out.println("Insuficiente");
               break;
           case 3:
               System.out.println("Insuficiente");
               break;
           case 2:
               System.out.println("Muy Insuficiente");
               break;
           case 1:
               System.out.println("Muy Insuficiente");
               break;
           case 0:
               System.out.println("Muy Insuficiente");
               break;
           default:
               System.out.println("Nota no válida. Debe estar entre 1 y 10.");
               break;
       }
		
//8
		   
		
		
//		 System.out.print("Introduce un número positivo: ");
//	        int N = scanner.nextInt();
//	        
//	        // Verificamos que el número sea positivo
//	        if (N < 0) {
//	            System.out.println("Por favor, introduce un número.");
//	        } else {
//	            long factorial = 1; // Usamos long para evitar desbordamientos en números grandes
//	            
//	            for (int i = 1; i <= N; i++) {
//	                factorial *= i; // Multiplicamos el factorial por cada número
//	            }
//	            
//	            System.out.println("El factorial de " + N + " es: " + factorial);
//	        }
		

//		for(int i=1;i<=10;i++){
//		System.out.println(i+" hola");
//		}

		
//		double suma=0;
//		for(int i = 1; i <=1000; i++) {
//			suma = suma + (1/Math.pow(i, 2));
//		}
//		System.out.println("la suma es: "+ suma);
	}

}
