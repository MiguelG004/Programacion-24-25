package com.decroly.daw;

import java.util.Scanner;

public class ActPPT {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String opcion = "";
		//1 = piedra, 2 = papel, 3 = tijeras
		int rival = 0;
		int jugador = 0;
		int g = 0, p = 0, e = 0, pj = 0;
		int pg = 1, pp = 1, pe = 1;
		System.out.println("Vamos a jugar al piedra, papel, tijera");
		System.out.println("REGLAS: Papel gana a piedra, piedra gana a tijera, tijera gana a papel.");
		System.out.println("Si se sacan dos papeles, dos piedras o dos tijeras, será empate");

		do {
		sc = new Scanner(System.in);
		rival = (int)(Math.random()*3)+1;
		System.out.println("El rival ya ha escogido que usar " + rival);
		System.out.println("Elige una opción para sacar (escribe en el teclado la tecla): ");
		System.out.println("P (piedra)\nL (papel)\nT (tijeras)\nR (recuento)\nS para salir ");
		opcion = sc.nextLine().toUpperCase();
		sc = new Scanner(System.in);

		switch (opcion) {

		case "P":
		jugador = 1;
		System.out.println("Has sacado piedra");
		if(jugador == rival) {
		if(rival == 1) {
		System.out.println("El rival ha sacado piedra");
		}
		System.out.println("Empate");
		e++;
		pj++;
		System.out.println();
		}
		if(rival == 2) {
		System.out.println("El rival ha sacado papel");
		System.out.println("Has perdido");
		p++;
		pj++;
		System.out.println();
		}
		if(rival == 3) {
		System.out.println("El rival ha sacado tijeras");
		System.out.println("Has ganado");
		g++;
		pj++;
		System.out.println();
		}
		break;

		case "L":
		jugador = 2;
		System.out.println("Has sacado papel");
		if(rival == 1) {
		System.out.println("El rival ha sacado piedra");
		System.out.println("Has ganado");
		g++;
		pj++;
		System.out.println();
		}
		if(rival == 2) {
		System.out.println("El rival ha sacado papel");
		System.out.println("Has empatado");
		e++;
		pj++;
		System.out.println();
		}
		if(rival == 3) {
		System.out.println("El rival ha sacado tijeras");
		System.out.println("Has perdido");
		p++;
		pj++;
		System.out.println();
		}

		break;

		case "T":
		jugador = 3;
		if(rival == 1) {
		System.out.println("El rival ha sacado piedra");
		System.out.println("Has perdido");
		p++;
		pj++;
		System.out.println();
		}

		if(rival == 2) {
		System.out.println("El rival ha sacado papel");
		System.out.println("Has ganado");
		g++;
		pj++;
		System.out.println();
		}
		if(rival == 3) {
		System.out.println("El rival ha sacado tijeras");
		System.out.println("Has empatado");
		e++;
		pj++;
		System.out.println();
		}
		break;

		case "R":
		pg = ((g/pj)*100);
		pp = ((p/pj)*100);
		pe = ((e/pj)*100);
		System.out.println("Se han jugado " + pj + " partidas; has ganado " + g + "; has perdido " + p + "; y has empatado " + e);
		System.out.println("Porcentaje de partidas ganadas: " + pg + "%; porcentaje de perdidas: " + pp + "%; porcentaje empates: " + pe + "%");
		System.out.println();
		break;

		case "S":
		System.out.println("El juego ha terminado, gracias por jugar");
		System.out.println("Recuento final: ");
		pg = ((g/pj)*100);
		pp = ((p/pj)*100);
		pe = ((e/pj)*100);
		System.out.println("Se han jugado " + pj + " partidas; has ganado " + g + "; has perdido " + p + "; y has empatado " + e);
		System.out.println("Porcentaje de partidas ganadas: " + pg + "%; porcentaje de perdidas: " + pp + "%; porcentaje empates: " + pe + "%");
		System.out.println();
		break;

		default:
		System.out.println("Error al elegir la opción.");
		System.out.println("Asegurate de escribir bien la letra que te pide");
		System.out.println();
		break;
		}

		}while(!opcion.equals("S"));

		
		

	}

}
