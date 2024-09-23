package com.decroly.daw;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//ej 1
		System.out.println("Buenos Dias\n");  
		
		/// ej 2
		int lado = 5;
		int area = lado*lado;
		
		System.out.println("el lado del cuadrado mide: "+ lado + "cm\nEl area del cuadrado es lado por lado.\n" + "Area = " + area+"cm^2\n");
		
		///Ej 3
		System.out.println("Dame el lado de un cuadrado en cm: ");
		double ladoteclado = sc.nextDouble();
		double areateclado = ladoteclado*ladoteclado;
		System.out.println("El area del cuadrado es: " + areateclado + "cm^2" + "\n");
		
		//ej 4
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
		
		//Ej 5
		
		System.out.println("Dame la longitud del radio de una circunfencia en cm: ");
		double radio = sc.nextDouble();
		double longitud = radio*2*Math.PI;
		double areacir = Math.PI*radio*radio;
		double volu = (4/3)*Math.PI*Math.pow(radio, 3);
		System.out.println("El radio de la circunferencia es: " + radio + "cm" + "\nLa longitud es: " + longitud+"cm" +
					"\nEl area es: " + areacir +"cm^2" + "\nEl volumen es: " + volu + "cm^3"+"\n");
		
		
		//EJ 6
	
		System.out.println("Dame el precio original");
		double precioo = sc.nextDouble();
		System.out.println("Dame el precio con el descuento");
		double descu = sc.nextDouble();
		double porcpagado = (descu*100)/precioo;
		double porcentaje = 100-porcpagado;
		System.out.println("Se ha hecho un descuento del " + porcentaje + "%");
		
		
		//Ej 7
		
		System.out.println("Dame una distancia en millas marinas (NOTA: 1 milla marina = 1852 metros): ");
		double millas = sc.nextDouble();
		double metros = millas*1852;
		System.out.println(millas+"millas equivalen a: " +metros+ " metros");
		
		//Ej 8
		
		System.out.println("Dame un numero: ");
		double numero1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double numero2 = sc.nextDouble();
		System.out.println("El numero mas grande es: "+ Math.max(numero1, numero2));
		System.out.println("El numero mas pequeño es: "+ Math.min(numero1, numero2)+"\n");
		
		

		//Ej 9
		
		System.out.println("Dame un numero: ");
		double numer1 = sc.nextDouble();
		System.out.println("Dame otro numero: ");
		double numer2 = sc.nextDouble();
		
		
		
		
	}

}
