package com.decroly.daw;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1. Escribe un programa que dé los “buenos días”.
		
		System.out.println("Buenos Dias\n");  
		
		//2. Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.

		int lado = 5;
		int area = lado*lado;
		
		System.out.println("el lado del cuadrado mide: "+ lado + "cm\nEl area del cuadrado es lado por lado.\n" + "Area = " + area+"cm^2\n");
		
		//3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado
		
		System.out.println("Dame el lado de un cuadrado en cm: ");
		double ladoteclado = sc.nextDouble();
		double areateclado = ladoteclado*ladoteclado;
		System.out.println("El area del cuadrado es: " + areateclado + "cm^2" + "\n");
		
		//4. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y division

		System.out.println("Dame un numero: ");
		double num1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double num2 = sc.nextDouble();
		
		double suma = num1+num2;
		double resta = num1-num2;
		double multi = num1*num2;
		double div = num1/num2;
		System.out.println("La suma de los dos numeros es: " + suma +"\nLa resta es: " + resta + 
				"\nLa multiplicacion es: " + multi + "\nLa division es: " + div + "\n");
		
		//5.  Escribe un programa que toma como dato de entrada un número que corresponde a la longitud 
		//de un radio y nos escribe la longitud de la circunferencia, el área del círculo 
		//y el volumen de la esfera que corresponden con dicho radio 
		
		System.out.println("Dame la longitud del radio de una circunfencia en cm: ");
		double radio = sc.nextDouble();
		double longitud = radio*2*Math.PI;
		double areacir = Math.PI*radio*radio;
		double volu = (4/3)*Math.PI*Math.pow(radio, 3);
		System.out.println("El radio de la circunferencia es: " + radio + "cm" + "\nLa longitud es: " + longitud+"cm" +
					"\nEl area es: " + areacir +"cm^2" + "\nEl volumen es: " + volu + "cm^3"+"\n");
		
		//6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.
	
		System.out.println("Dame el precio original");
		double precioo = sc.nextDouble();
		System.out.println("Dame el precio con el descuento");
		double descu = sc.nextDouble();
		double porcpagado = (descu*100)/precioo;
		double porcentaje = 100-porcpagado;
		System.out.println("Se ha hecho un descuento del " + porcentaje + "%");
		
		
		//7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
		
		System.out.println("Dame una distancia en millas marinas (NOTA: 1 milla marina = 1852 metros): ");
		double millas = sc.nextDouble();
		double metros = millas*1852;
		System.out.println(millas+"millas equivalen a: " +metros+ " metros");
		
		//8. Escribe un programa que lee dos números y los visualiza en orden ascendente.
		
		System.out.println("Dame un numero: ");
		double numero1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double numero2 = sc.nextDouble();
		System.out.println("El numero mas grande es: "+ Math.max(numero1, numero2));
		System.out.println("El numero mas pequeño es: "+ Math.min(numero1, numero2)+"\n");
		
		
		//9. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
		
		System.out.println("Dame un numero: ");
		double n1= sc.nextDouble();
		System.out.println("Dame otro: ");
		double n2= sc.nextDouble();
	
		if (n1>n2) {
			System.out.println(n1+" es mayor que "+n2);
		}
		else if (n2>n1) {
			System.out.println(n2+" es mayor que "+n1);
		}
		else {
			System.out.println(n1+" es igual a "+n2);
		}
		
		
		//10. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
		
		System.out.println("Dame un numero: ");
		double numer1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double numer2 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double numer3 = sc.nextDouble();
		System.out.println("El numero mas grande es: "+ Math.max(Math.max(numer3, numer2), numer1)+"\n");
		
		

		//11. . Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división. (Ten en cuenta la división por cero).
		
		System.out.println("Dame un numero: ");
		double nume1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double nume2 = sc.nextDouble();
		double sumar= nume1+nume2;
		double res=nume1-nume2;
		double mul=nume1*nume2;
		double divi=nume1/nume2;
		
		System.out.println("La suma es: "+sumar);
		System.out.println("La resta es: "+res);
		System.out.println("El producto es: "+mul);
		if (nume2==0) {
			System.out.println("No se puede dividir entre 0");
		}
		else {
			System.out.println("El cociente es: "+divi);

		}
		
		//12. Escribe un programa que lee 2 números y muestra el mayor
		
		System.out.println("Dame un numero: ");
		double number1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double number2 = sc.nextDouble();
		System.out.println("El numero mas grande es: "+ Math.max(number1, number2));
	
		
		//13. Escribe un programa que lee un número y me dice si es positivo o negativo (consideraremos el cero como positivo.)
		
		System.out.println("Dame un numero:");
		int posneg = sc.nextInt();
		if (posneg<=0){
			System.out.println("El numero es positivo");
		}
		else {
			System.out.println("El numero es negativo");
		}
		
		
	}

}
