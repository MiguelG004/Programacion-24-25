package com.decroly.daw;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
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
		   System.out.println("Dame un numero para multiplicar por su factorial: ");
		   int n=sc.nextInt();
		   int factorial=1;
	for(int i = 1; i <=n; i++) {
		factorial = factorial*i;  
				  }
	System.out.println("el factorial: "+ factorial);

	
//9
	System.out.println("Dame un valor en horas: ");
	int h = sc.nextInt();
	System.out.println("Dame un valor en minutos:");
	int m = sc.nextInt();
	System.out.println("Dame un valor en segundos: ");
	int s = sc.nextInt();
	   if (s<0 || s>59) {
		   System.out.println("Valor no valido");
		   }
	   if (m<0 || m>59) {
		   System.out.println("Valor no valido");
		   }
	   if (h>24 || h<0) {
		   System.out.println("Valor no valido");
		   }

	  s=s+1;
	  if (s>59) {
		  m=m+1; s=0;
		  }
	  if (m>59) {
		  m=0; h++;
		  }
	  if (h>24) {
		  h=0;
		  }
	  	
	  System.out.println("La hora es "+h+"h "+m+"m "+s+"s");
		
	  //10
	  int neg=0;
		
		 System.out.println("Dame dies valores: ");
		  for (int i=1; i<=10; i++) {
			  int val=sc.nextInt();
			  if (val<0) {
			  		neg++;
			  		
			  	}
			  
		  }
		  if (neg>0) {
	  			System.out.println("Ha leido un negativo");
	  		}
	  		else {
				  System.out.println("No ha leido ningun numero negativo");
			  }
		  
	//11
		  int cneg=0;
		  int cpos=0;
			
			 System.out.println("Dame dies valores: ");
			  for (int i=1; i<=10; i++) {
				  int val=sc.nextInt();
				  if (val<0) {
				  		cneg++;
				  		
				  	}
				  else {
					  cpos++; //!!!!!!CUENTO EL 0 COMO POSITIVO
				  }
			  }
			  
			  System.out.println("Ha leido "+cpos+" numeros positivos y "+cneg+" numeros negativos");
//12
				System.out.println("Te voy a calcular la suma y el producto de los primeros diez numeros naturales");
				int suma=0;
				int mult=1;
				for (int i=1; i<=10; i++) {
					suma = suma+i;
					mult = mult*i;
				}
				System.out.println("la suma es: "+suma);
				System.out.println("el producto es: "+mult);
				
//13
				System.out.println("Nombre del trabajador: ");
				String nomb = sc.nextLine();
				System.out.println("Horas trabajadas");
				double horastr = sc.nextDouble();
				System.out.print("Cuanto se paga por horas: ");
				double tarifa = sc.nextDouble();
				
				double salariobr =1;
				if (horastr<=35) {
					salariobr = horastr*tarifa;
				}
				else {
					salariobr=(35*tarifa)+((horastr-35)*1.5);
				}
				
				double impuestos=1;
				if(salariobr<=500) {
				 impuestos=0;
				}
				else if(salariobr<=900) {
					impuestos=(salariobr-500)*0.25;
				}
				else {
		            impuestos = (400 * 0.25) + ((salariobr - 900) * 0.45);
		        }
				
				double salarioneto= salariobr-impuestos;
				
				System.out.println("Nombre del trabajador: "+nomb);
				System.out.println("Salario bruto: "+salariobr);
				System.out.println("Impuestos: "+impuestos);
				System.out.println("Salario Neto: "+salarioneto);
	 
		
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
