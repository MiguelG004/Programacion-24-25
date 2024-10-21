package com.decroly.daw;
import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		String palindromo ="";
		System.out.println("Introduce una frase, y se te devolvera del revés y te dirá si es o no un palindromo (sin importar mayusculas ni espacios)");
		palindromo = sc.nextLine();
		palindromo = palindromo.replace(" ", "");
		palindromo = palindromo.toLowerCase();
		char palindromooriginal[] = palindromo.toCharArray();
		char pal[] = palindromo.toCharArray();
		
		System.out.println("Frase original = " + palindromo);
		System.out.print("Frase del revés = ");
		
		
		for(int i = 0; i < pal.length; i++) {
			System.out.print(pal[pal.length - 1- i]);
			
			if(pal[i] == palindromooriginal[i]) {
				System.out.println("Es palindromo");
			}
			else {
				System.out.println("No es palindromo");
			}
		}
		System.out.println("");
		
		
		
		System.out.println("\n");
		
		
		
		//1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
		//palabra de la cadena en una línea distinta.

		System.out.println("(EJ 1)\nEscribeme una cadena de texto");
		String cadena = new String();
		cadena = sc.nextLine();
		System.out.println(cadena.replace(" ", "\n"));
		
		
		//2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
		//iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
		
		System.out.println("(EJ 2) Escribeme dos cadenas de texto y se dira si son iguales o no");
		System.out.println("1era cadena: ");
		String cadena1 = new String();
		cadena1 = sc.nextLine();
		System.out.println("2da cadena");
		String cadena2 = new String();
		cadena2=sc.nextLine();
		if(cadena1.equalsIgnoreCase(cadena2)) {
			if (cadena1.equals(cadena2)){
				System.out.println("Son iguales las dos cadenas");
			}
			else {
				System.out.println("Las dos cadenas son iguales sin tener en cuenta las mayusculas");
			}
		}
		
		else {
			System.out.println("Las dos cadenas son diferentes");
		}
		
		
		//3.Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
		//Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
		//las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
		//“Tarazón” y “Alcocer” mostrará “LIOTARALC”.
		
		String nombre;
		String apellido1;
		String apellido2;
		
		System.out.println("\n(EJ3) Se te pedira tu nombre y apellidos y se te creara en mayusculas tu nombre de usurio con las 3 primeras letras de cada");
		System.out.println("Escribeme tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Escribeme tu primer apellido: ");
		apellido1 = sc.nextLine();
		System.out.println("Escribeme tu tercer apellido: ");
		apellido2 = sc.nextLine();
		
		nombre = nombre.substring(0,3);
		apellido1 = apellido1.substring(0,3);
		apellido2 = apellido2.substring(0,3);
	
		System.out.println("Tu nombre de usurario es: " + nombre.toUpperCase() + apellido1.toUpperCase() + apellido2.toUpperCase());
		
		
		//4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
		//‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
		//mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
		//Nº de A's: 3
		//Nº de E's: 1
		//Nº de I's: 2
		//Nº de O's: 0
		//Nº de U's: 0
		

		int a = 0;
		int e = 0;
		int ni = 0;
		int o = 0;
		int u = 0;
	
		String frase;
		System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        char c[] = frase.toCharArray();
        
		for (int i = 0; i < c.length; i++) {
			if(c[i] == 'a'){
				a++;
			}
			if(c[i] == 'e'){
				e++;
			}
			if(c[i] == 'i'){
				ni++;
			}
			if(c[i] == 'o'){
				o++;
			}
			if(c[i] == 'u'){
				u++;
			}
				
		}
		System.out.println("El progama ha encontrado " + a + " a(aes), " + e + " e(es), " + ni + " i(ies), " + o + " o(oes), " + u + " u(ues)");
		
		
		//5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
		//o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
		//Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
		//acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
		//derecha a izquierda.
		
		
		
		
		
	}//no borrar

} //no borrar
