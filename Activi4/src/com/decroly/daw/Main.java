package com.decroly.daw;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

		double reales[] = new double[10];
		System.out.println("Dame 10 valores y te seran devueltos: ");
		for (int i = 0; i < 10; i++) {
			reales[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < reales.length; i++) {
			System.out.println(reales[i]);
		}
		
		
		//2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores
		
		double realessum[] = new double[10];
		System.out.println("(Ej2)\nDame 10 valores y te los sumará: ");
		for (int i = 0; i < 10; i++) {
			realessum[i] = sc.nextDouble();
		}
		double suma = 0;
		for (int i = 0; i < realessum.length; i++) {
			suma = suma + realessum[i];
		}
		System.out.println(suma);
		
		
		//3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
		//y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
		
		double maxmin[] = new double[10];
		System.out.println("(Ej3)\nDame 10 valores y te dira que numero es mas grande y cual mas pequeño: ");
		for (int i = 0; i < 10; i++) {
			maxmin[i] = sc.nextDouble();
			
		}
		Arrays.sort(maxmin); //este comando ordena de menor a mayor una array
		System.out.println("El numero maximo es: "+ maxmin[(maxmin.length-1)]); //se que el ultimo valor sera el mayor de todos
		System.out.println("El numero minimo es: " + maxmin[0]); //se que el primer valor es el mas pequeño
		
		//4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
		//array y luego muestre por separado la suma de todos los valores positivos y negativos.
		
		System.out.println("(Ej4)\nIntroduce 20 valores: ");
		int ent[] = new int[20];
		int pos = 0;
		int neg = 0;
		for(int i = 0; i < ent.length; i++) {
			ent[i] = sc.nextInt();
		}
		for (int i = 0; i < 20; i++){
			if(ent[i]<0) {
				neg = neg + ent[i];
			}
			else {
				pos = pos + ent[i];
			}
		}
		System.out.println("La suma de todos los numeros positivos es: " + pos + "\nLa suma de los negativos es: " + neg);
		
		
		//5. Crea un programa que pida veinte números reales por teclado, los almacene en un array
		//y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
		
		System.out.println("(Ej5)\nIntroduce 20 valores para hacer su media: ");
		double reals[] = new double[20];
		double sumamedia = 0;
		double media = 0;
		for(int i = 0; i < reals.length; i++) {
			reals[i] = sc.nextDouble();
		}
		for (int i = 0; i < 20; i++){
			sumamedia = sumamedia + reals[i];
		}
		media = sumamedia/20;
		System.out.println("La media de la suma es " + media);

		//6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
		//N, escriba M en todas sus posiciones y lo muestre por pantalla.
		
		int array [];
		System.out.println("(Ej6)\nDame un valor 'N' para definir el tamaño de una array: ");
		int tamaño = sc.nextInt();
		array = new int[tamaño];
		System.out.println("Dame un valor para 'M' para definir ");
		int posicion = sc.nextInt();
		int [tamaño] = posición;
		
	}

}
