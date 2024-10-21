package com.decroly.daw;
import java.util.Scanner;
import java.util.Arrays;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double med1, max1, min1 = 0;
		double med2, max2, min2 = 0;
		double med3, max3, min3 = 0;
		double med4, max4, min4 = 0;
		double notas[][] = new double[4][5];
		
		for (int i = 0; i < notas.length; i++) {
		System.out.println("Notas del alumno" + (i+1) + ": ");
		
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = sc.nextInt();
			}
		}
	
	
		for (int i = 0; i < notas.length; i++) {
		System.out.print("Alumno " + (i+1) + " | ");
		
			for (int j = 0; j < notas[i].length; j++) {
				
				System.out.print(notas[i][j] + " ");
			}
			System.out.println("| " + " Media = " + 0 + ", maxima = " + 0 + ", minima = " + 0);
		}

		System.out.println("");
		
		
		
//		1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
//		y luego muestre la matriz por pantalla.
		
		
		
		System.out.println("(EJ1)\nMatriz de 5x5");
		int sum = 1;
		int matriz[][] = new int [5][5];
		
		System.out.println("Columna:  1  2  3  4  5");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Fila: "+ (i + 1) + " |");
			for (int j = 0; j < matriz.length; j++) {
                if(sum < 10) {
                	System.out.print(" ");
                }
				matriz[i][j] = sum++;
                System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println("|");
		}
		
		System.out.println("\n");
		
//		2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
//		multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
		
		System.out.println("(Ej2)\nMatriz de 10x10");
		
		int tabla10[][] = new int [10][10];
		
		for (int i = 0; i < tabla10.length; i++) {
			System.out.print("Fila: "+ (i + 1) + "  |");
			for (int j = 0; j < tabla10.length; j++) {
				tabla10[i][j] = (j+1) * (i+1);
                System.out.print(tabla10[i][j] + " ");
			}
			
			System.out.println("|");
		}
		
		System.out.println("\n");
		
		
//		3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
//		introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
//		matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
//		menores que cero y cuántos son igual a cero.
		

		int mayorcero = 0;
		int igualcero = 0;
		System.out.println("(Ej3)\nMe vas a dar dos valores para hacer una matriz del tamaño que quieras, y luego vas a rellenarla");
		System.out.println("Dime cuantas filas quieres para tu matriz");
		int filas = sc.nextInt();
		System.out.println("Dime cuantas columnas quieres");
		int columnas = sc.nextInt();
		int nm[][] = new int [filas][columnas];
		
		System.out.println("Dame " + columnas + " valores para las filas:" );
		for (int i = 0; i < nm.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Fila " + (i+1));
			
			for (int j = 0; j < nm[i].length; j++) {
				
                nm[i][j] = sc.nextInt();
                if(nm[i][j] > 0) {
                	mayorcero++;
                }
                if(nm[i][j] == 0) {
                	igualcero++;
                }
			}
	
		}
		
		
		for (int i = 0; i < nm.length; i++) {
			System.out.print("Fila " + (i + 1) +" | ");
			
			for (int j = 0; j < nm[i].length; j++) {
				System.out.print(nm[i][j] + " ");
			}
		
			System.out.println("|");
		}
		
		System.out.println("Se han encontrado " + mayorcero + " numeros mayores a cero");
		System.out.println("Se han encontrado " + igualcero + " numeros iguales a cero");
		
		
//		4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
//		1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
//		programa mostrará la nota mínima, máxima y media de cada alumno.
		
		
	
		
//		5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
//		y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
//		de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
//		género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
//		matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
//		
	
	}

}
