package com.decroly.daw;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Escribe un programa que pide la edad por teclado y nos muestra el mensaje
		// de “Eres mayor de edad” solo si lo somos.

		System.out.println("Dame tu edad: ");
		int edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

		// 2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje
		// de “eres mayor de edad” o el mensaje de “eres menor de edad”.

		System.out.println("Dame tu edad: ");
		int edad1 = sc.nextInt();
		if (edad1 >= 18) {
			System.out.println("Eres mayor de edad");
		} 
		else {
			System.out.println("Eres menor de edad");
		}

		// 3. Realiza un programa que muestre por pantalla los 20 primeros números
		// naturales (1, 2, 3,..., 20.)
		
		System.out.println("Se van a mostrar los primeros 20 numeros naturales: ");
		for (int i = 1; i <= 20; i++) { // el contador empieza en el 1, y termina en el 20. se va sumando de uno en uno
			System.out.println(i);
		}

		// 4. Realiza un programa que muestre los números pares comprendidos entre el 1
		// y el 200. Para ello utiliza un contador y suma de 2 en 2.

		System.out.println("los pares son del 1 al 200 :");

		for (int i = 2; i <= 200; i = i + 2) { // el contador empieza en el 2, termina en el 200 y se suma de 2 en 2
			System.out.println(i);
		}

		// 5. Realiza un programa que muestre los números pares comprendidos entre el 1
		// y el 200. Esta vez utiliza un contador sumando de 1 en 1.

		System.out.println("los pares son:");
		for (int i = 2; i <= 200; i = i + 1) { // el contador empieza en el 2, termina en el 200 y se suma de 2 en 2
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 6. Realiza un programa que muestre los números desde el 1 hasta un número N
		// que se introducirá por teclado.

		System.out.println("introduce el numero que quieres que cuente:");
		int cont = sc.nextInt();
		for (int i = 0; i <= cont; i++) {
			System.out.println(i);
		}

		// 7. Escribe un programa que lea una calificación numérica entre 0 y 10 y la
		// transforma en calificación alfabética, escribiendo el resultado.
		// de 0 a <3 Muy Deficiente, de 3 a <5 Insuficiente, de 5 a <6 Bien, de 6 a <9
		// Notable de 9 a 10 Sobresaliente

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

		// 8. Realiza un programa que lea un número positivo N y calcule y visualice su
		// factorial N! Siendo el factorial:
		// 0! = 1, 1! = 1, 2! = 2 * 1, 3! = 3 * 2* 1, N! = N * (N-1) * (N-2)........*
		// 3*2*1

		System.out.println("Dame un numero para multiplicar por su factorial: ");
		int n = sc.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("el factorial: " + factorial);

		// 9. Escribe un programa que recibe como datos de entrada una hora expresada en
		// horas, minutos y segundos que nos calcula
		// y escribe la hora, minutos y segundos que serán, transcurrido un segundo.

		System.out.println("Dame un valor en horas: ");
		int h = sc.nextInt();
		
		System.out.println("Dame un valor en minutos:");
		int m = sc.nextInt();
		
		System.out.println("Dame un valor en segundos: ");
		int s = sc.nextInt();
		
		if (s < 0 || s > 59) {
			System.out.println("Valor no valido");
		}
		if (m < 0 || m > 59) {
			System.out.println("Valor no valido");
		}
		if (h > 24 || h < 0) {
			System.out.println("Valor no valido");
		}

		s = s + 1;
		if (s > 59) {
			m = m + 1;
			s = 0;
		}
		if (m > 59) {
			m = 0;
			h++;
		}
		if (h > 23) {
			h = 0;
		}

		System.out.println("La hora es " + h + "h " + m + "m " + s + "s");

		// 10. Realiza un programa que lea 10 números no nulos y luego muestre un
		// mensaje de si ha leído algún número negativo o no.

		int neg = 0;

		System.out.println("Dame dies valores: ");
		for (int i = 1; i <= 10; i++) {
			int val = sc.nextInt();
			
			if (val < 0) {
				neg++;
			}
		}
		
		if (neg > 0) {
			System.out.println("Ha leido un negativo");
		} 
		else {
			System.out.println("No ha leido ningun numero negativo");
		}

		// 11. Realiza un programa que lea 10 números no nulos y luego muestre un
		// mensaje indicando cuántos son positivos y cuantos negativos.

		int cneg = 0;
		int cpos = 0;

		System.out.println("Dame dies valores: ");
		for (int i = 1; i <= 10; i++) {
			int val = sc.nextInt();
			if (val < 0) {
				cneg++;
			} 
			else {
				cpos++; // !!!!!!CUENTO EL 0 COMO POSITIVO
			}
		}

		System.out.println("Ha leido " + cpos + " numeros positivos y " + cneg + " numeros negativos");

		// 12. Realiza un programa que lea una secuencia de números no nulos hasta que
		// se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos

		int contneg = 0;
		int contpos = 0;

		System.out.println("Dame valores (0 = para salir): ");
		double val1 = -1;
		while (val1 != 0) { // mientras el valor sea distinto de 0, el programa se ejecuta
			val1 = sc.nextDouble();

			if (val1 > 0) {
				contpos++;
			}

			else if (val1 < 0) {
				contneg++;
			}
		}

		System.out.println("Ha leido " + contpos + " numeros positivos y " + contneg + " numeros negativos");

		// 13. Realiza un programa que calcule y escriba la suma y el producto de los 10
		// primeros números naturales.

		System.out.println("Te voy a calcular la suma y el producto de los primeros diez numeros naturales");
		int suma = 0;
		int mult = 1;
		
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			mult = mult * i;
		}
		System.out.println("la suma es: " + suma);
		System.out.println("el producto es: " + mult);

//14. Escribe un programa que calcula el salario neto semanal de un trabajador en función del
//número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
//Las primeras 35 horas se pagan a tarifa normal.
//Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
//Las tasas de impuestos son:
//Los primeros 500 euros son libres de impuestos.
//Los siguientes 400 tienen un 25% de impuestos.
//Los restantes un 45% de impuestos.
//Escribir nombre, salario bruto, tasas y salario neto.

		sc = new Scanner(System.in); //reinicio el scanner
		System.out.println("Nombre del trabajador: ");
		String nomb = sc.nextLine();
		System.out.println("Horas trabajadas: ");
		double horastr = sc.nextDouble();
		System.out.print("Cuanto se paga por horas: ");
		double tarifa = sc.nextDouble();

		double salariobr = 1;
		
		if (horastr <= 35) {
			salariobr = horastr * tarifa;
		} 
		
		else {
			salariobr = (35 * tarifa) + ((horastr - 35) * 1.5); // logica = si empieza a cobrar 35 mas a partir de la hora 35, 
						//primero tiene que hacer las 35 horas, y despues empieza a contar 1,5 mas a partir de la 36
		}
		
		double impuestos = 1;
		
		if (salariobr <= 500) {
			impuestos = 0;
		} 
		
		else if (salariobr <= 900) {
			impuestos = (salariobr - 500) * 0.25;
		} 
		
		else {
			impuestos = (400 * 0.25) + ((salariobr - 900) * 0.45);
		}

		double salarioneto = salariobr - impuestos;

		System.out.println("Nombre del trabajador: " + nomb);
		System.out.println("Salario bruto: " + salariobr);
		System.out.println("Impuestos: " + impuestos);
		System.out.println("Salario Neto: " + salarioneto);

	}

}
