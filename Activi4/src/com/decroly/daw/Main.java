package com.decroly.daw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu[] = new int[10];
		String opcion = "";
		do {
			System.out.println("Elige una de las siguientes opciones");
			System.out.println("a) Mostrar valores\nb) Introducir valor\nc) Salir");
			opcion = sc.nextLine();
			switch (opcion) {
			case "a":
				System.out.println("Ver todos los clientes");
                for(int i =0; i < menu.length; i++){
                       System.out.println(menu[i]);
                }
				break;
				
			case "b":
				
				break;
			
			case "c":
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Introduzca una opcion correcta");
			}
		}while(!opcion.equals("c"));
		
		
		//1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

		double reales[] = new double[10];
		System.out.println("(Ej 1)Dame 10 valores y te seran devueltos: ");
		for (int i = 0; i < 10; i++) {
			reales[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < reales.length; i++) {
			System.out.println(reales[i] + "\n");
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
		array = new int[tamaño];  //El tamaño de la array se hace del valor dado anteriormente
		System.out.println("Dame un valor para 'M' para definir los valores de la array ");
		int posicion = sc.nextInt();
		
		Arrays.fill(array, posicion);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
		//todos los valores desde P hasta Q, y lo muestre por pantalla.
		
		int p = 0;
		int q = 0;
		
		do {
			System.out.println("El programa va a hacer un array que vaya desde P hasta Q");
			System.out.println("Introduce el valor P");
			p = sc.nextInt();
			System.out.println("Introduce el valor Q");
			q = sc.nextInt();
			
			if(q < p) {
				System.out.println("Q debe ser mayor que P");
			}
		
		}while(q < p);

		int restapq = q - p;
		int pq [] = new int [restapq + 1];
		System.out.println("Array: ");
		for (int i = 0; i < pq.length; i++) {
			pq[i] = p+i;
			System.out.print(pq[i] + "\n");
		}
		
		
		//8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
		//utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
		//cuántos valores del array son igual o superiores a R.
		
		System.out.println("Se va a crear una array de 100 valores");
		double cien[] = new double [100];
		for (int i = 0; i < cien.length; i++) {
			cien [i] = Math.random();
		}
		
		double valor = 0;
		do {
			System.out.println("Introduzca un valor entre 0 y 1 (Ejemplo: 0,2 o 0,54)");
			valor = sc.nextDouble();
			if(valor>1 || valor<0) {
				System.out.println("El numero debe estar entre el 0 y 1");
			}
		}while(valor <0 || valor >1);
		
		int mayor = 0;
		
		for (int i = 0; i < cien.length; i++) {
			if (cien[i] >= valor) {
				mayor++;
			}
		}
		
		System.out.println("Ha leido " + mayor + " numeros mayores o iguales a " + valor);
		
		//9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
		//enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
		//y mostrará en qué posiciones del array aparece N.
		
		System.out.println("Se va a crear una array de 100 valores");
		int vector1[] = new int [100];
		for (int i = 0; i < vector1.length; i++) {
			vector1 [i] = (int) (1+Math.random()*10);
		}
		
		int valor1 = 0;
		do {
			System.out.println("Introduce un valor entre N 0 y 10");
			valor1 = sc.nextInt();
			if (valor1 < 0 || valor1 > 10) {
				System.out.println("Debe estar comprendido N entre 0 y 10");
			}
		}while(valor1 < 0 || valor1 > 10);
		
		System.out.println("Posiciones donde aparece N: ");
		for (int i = 0; i < vector1.length; i++) {
			if (vector1[i] == valor1) {
				System.out.println("Tu numero " + valor1 + " se encuentra en la posición " + i);
				
			}
		}
		
		//10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
		//personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. 
		//Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y por debajo de la media.
		
		double medialtura = 0;
		int nmayor = 0;
		int nmenor = 0;
		System.out.println("Dime cuantas alturas quieres introducir (se creara una array de dicho tamaño): ");
		int n = sc.nextInt();
		double altura[] = new double [n];
		for (int i = 0; i < altura.length; i++) {
			System.out.print("Introduzca una altura en metros: ");
			altura[i] = sc.nextDouble();
			medialtura = medialtura + altura[i];
		}
		Arrays.sort(altura); 
		medialtura = medialtura / n;
		
		for (int i = 0; i < altura.length; i++) {
			if (medialtura < altura[i]){
				nmayor++;
			}
			if (medialtura > altura [i]) {
				nmenor++;
			}
		}
		
		System.out.println("La altura media es de " + medialtura + "m");
		System.out.println("La altura minima es de " + altura[0] + "m");
		System.out.println("La altura maxima es de " + altura[altura.length-1] + "m");
		System.out.println("Nº de alturas mayores a la media: " + nmayor);
		System.out.println("Nº de alturas menores a la media: " + nmenor);
		
		
		//11.Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
		//el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
		//del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
		
		int Vector1[] = new int[100];
		int Vector2[] = new int[100];
		System.out.println("Primer Array (1-100)");
		for (int i = 0; i < Vector1.length; i++) {
			Vector1[i] = i + 1;
			System.out.println(Vector1[i]);
		}
		System.out.println("Segundo Array (100-1)");
		for(int i = 0; i < Vector2.length; i++){
			Vector2[i] = Vector1[Vector1.length -1 - i];
			System.out.println(Vector2[i]);
        }
		
		
		//12. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
		//con distintas opciones:
		//	a. Mostrar valores.
		//	b. Introducir valor.
		//	c. Salir.
		//La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
		//posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
		//que el usuario elija la opción ‘c’ que terminará el programa.
		
		
		
		
		
		
	}//No borrar esta linea

}//Ni esta
