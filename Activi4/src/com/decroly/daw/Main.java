package com.decroly.daw;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

		double reales[] = new double[10];
		System.out.println("Dame 10 valores: ");
		for (int i = 0; i < 10; i++) {
			reales[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < reales.length; i++) {
			System.out.println(reales[i]);
		}
		
		
		//2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores
		
		double realessum[] = new double[10];
		System.out.println("Dame 10 valores: ");
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
		System.out.println("Dame 10 valores: ");
		double max = 0;
		double min = 0;
		for (int i = 0; i < 10; i++) {
			maxmin[i] = sc.nextDouble();
			if(maxmin[i]>=max){
				max=maxmin[i];
			}
			else if(maxmin[i]<=min) {
				min=maxmin[i];
			}
		}
		System.out.println("El numero maximo es: " + max);
		System.out.println("El numero minimo es: " + min);
		
		//4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
		//array y luego muestre por separado la suma de todos los valores positivos y negativos.
		
		System.out.println("Introduce 20 valores: ");
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
		
		System.out.println("Introduce 20 valores: ");
		double reals[] = new double[20];
		double sumamedia= 0;
		double media = 0;
		for(int i = 0; i < reals.length; i++) {
			reals[i] = sc.nextDouble();
		}
		for (int i = 0; i < 20; i++){
			sumamedia= sumamedia + reals[i];
		}
		media = sumamedia/20;
		System.out.println("La media de la suma es " + media);

		//6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
		//N, escriba M en todas sus posiciones y lo muestre por pantalla.
		
		
		
	}

}
