package com.decroly.daw;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Miguel Gómez Gutiérrez
		Scanner sc = new Scanner(System.in);
		
		String opcion = "";
		//creo la estructura de tal forma que al elegir una de las opciones con letras(P, L, T), se te asigne un numero para que
		//sea comparado con el de la maquina; el cual su numero será elegido a través de math.Random
		//1 = piedra, 2 = papel, 3 = tijeras
		int rival = 0; //creo la variable para que la consola pueda elegir su opción
		int jugador = 0; //creo la variable para el jugador
		int g = 0, p = 0, e = 0, pj = 0; //creo las variables de ganadas, perdidas, empates y partidas jugadas
		double pg = 1, pp = 1, pe = 1; //creo el double para el porcentaje de las partidas
		System.out.println("Vamos a jugar al piedra, papel, tijera");
		System.out.println("REGLAS: Papel gana a piedra, piedra gana a tijera, tijera gana a papel.");
		System.out.println("Si se sacan dos papeles, dos piedras o dos tijeras, será empate");
		System.out.println();
		
		//do while que se repite hasta que se elija la opcion de salir del juego
		do {
			sc = new Scanner(System.in); //reinicio el escaner
			rival = (int)(Math.random()*3)+1; //cada vez que se repite el bucle, el rival elige su opcion para sacar. Va del 1 al 3
			System.out.println("¡El rival ya ha escogido que usar...! ");
			System.out.println("Elige una opción para sacar (escribe en el teclado la tecla): ");
			System.out.println("P (piedra)\nL (papel)\nT (tijeras)\nR (recuento)\nS para salir ");
			opcion = sc.nextLine().toUpperCase(); //para que da igual escribir en mayuscula o minuscula
			sc = new Scanner(System.in);
			
			switch (opcion) {
				
				case "P":
					jugador = 1; //establezco el numero 1 como piedra para compararlo con el numero generado aleatorio con ifs
					System.out.println("Has sacado piedra");
					if(jugador == rival) {
						if(rival == 1) {
							System.out.println("El rival ha sacado piedra");
						}
						System.out.print("!Empate!");
						e++; //ha sacado lo mismo, por lo que al contador de empates le suma 1
						pj++; //1 partida jugada = suma el contador de partidas jugadas
						System.out.println(" " + g + " - " + p); //marcador que se muestra mientras se juega
						System.out.println();
					}
					if(rival == 2) {
						System.out.println("El rival ha sacado papel");
						System.out.print("¡Has perdido!");
						p++; //ha perdido, por lo que al contador de perdidas le suma 1
						pj++; //1 partida jugada = suma el contador de partidas jugadas
						System.out.println(" " + g + " - " + p); //marcador que se muestra mientras se juega
						System.out.println();
					}
					if(rival == 3) {
						System.out.println("El rival ha sacado tijeras");
						System.out.print("¡Has ganado!");
						g++; //ha ganado, por lo que al contador de ganadas le suma 1
						pj++;
						System.out.println(" " + g + " - " + p); //marcador que se muestra mientras se juega
						System.out.println();
					}
					
					//repito la misma estructura con el resto de opciones de juego
					break;
				
				case "L":
					jugador = 2;
					System.out.println("Has sacado papel");
					if(rival == 1) {
						System.out.println("El rival ha sacado piedra");
						System.out.print("¡Has ganado!");
						g++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					if(rival == jugador) {
						System.out.println("El rival ha sacado papel");
						System.out.print("¡Has empatado!");
						e++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					if(rival == 3) {
						System.out.println("El rival ha sacado tijeras");
						System.out.print("¡Has perdido!");
						p++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					
					break;
				
				case "T":
					jugador = 3;
					System.out.println("Has sacado tijeras");
					if(rival == 1) {
						System.out.println("El rival ha sacado piedra");
						System.out.print("¡Has perdido!");
						p++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					
					if(rival == 2) {
						System.out.println("El rival ha sacado papel");
						System.out.print("¡Has ganado!");
						g++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					if(rival == jugador) {
						System.out.println("El rival ha sacado tijeras");
						System.out.print("¡Has empatado!");
						e++;
						pj++;
						System.out.println(" " + g + " - " + p);
						System.out.println();
					}
					break;
					
				//me invento el caso R(recuentos) para que el jugador pueda ver sus estadisticas entre partidas
				case "R":
					if(pj > 0) { //este if sirve para que si no has jugado una partida, no divida entre 0 y rompa el programa
						 pg = ((double) g / pj) * 100; //tengo que convertir las variables de los resultados para que
						 pp = ((double) p / pj) * 100; 		// no de error al dividir int/double
						 pe = ((double) e / pj) * 100;
						System.out.println("Se han jugado " + pj + " partidas; has ganado " + g + "; has perdido " + p + "; y has empatado " + e);
						System.out.println("Porcentaje de partidas ganadas: " + pg + "%; porcentaje de perdidas: " + pp + "%; porcentaje empates: " + pe + "%");
					}
					else {
						System.out.println("¡No has jugado ninguna partida!");
					}
					System.out.println();
					break;
					
				case "S":
					System.out.println("El juego ha terminado");
					if(pj > 0) {
						System.out.println("Recuento final: ");
						//repito la estructura de recuentos al finalizar
						pg = ((double) g / pj) * 100; 
						pp = ((double) p / pj) * 100; 
						pe = ((double) e / pj) * 100;
						System.out.println("Se han jugado " + pj + " partidas; has ganado " + g + "; has perdido " + p + "; y has empatado " + e);
						System.out.println("Porcentaje de partidas ganadas: " + pg + "%; porcentaje de perdidas: " + pp + "%; porcentaje empates: " + pe + "%");
						System.out.println("Gracias por jugar"); //gracias por jugar unicamente si juega
					}
					System.out.println();
					break;
				
				//por si escribes mal la opción, te sale este mensaje
				default:
					System.out.println("Error al elegir la opción.");
					System.out.println("Asegurate de escribir bien la letra que te pide");
					System.out.println();
					break;
			}
			
		//cuando se elige la opción "S", el bucle deja de repetirse
		}while(!opcion.equals("S"));

	}

}
