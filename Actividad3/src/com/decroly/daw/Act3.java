package com.decroly.daw;
import java.util.Scanner;
public class Act3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Realiza un programa que dada una cantidad de euros que el usuario introduce por
		//teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
		//alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
		//indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
		//programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
		//5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
		//número de billetes posible).

		System.out.println("Introduce por teclado una cantidad de euros que sea multiplo de 5 (EJ: 5,10,15,20...)");
		int dinero = sc.nextInt();
		int cinco = 0;
		int diez = 0;
		int veint = 0;
		int cinq = 0;
		int cien = 0;
		int doscien = 0;
		int quinientos = 0;
		
		if (dinero%5!=0){
			System.out.println("Debe ser multiplo de 5"); 
		}
		
		if(dinero%500==0) {
			int billetes=dinero/500;
		}
		else if (dinero%100==0) {
			int billetes=dinero/100;
		}
		else if (dinero%50==0) {
			int billetes =dinero/50;
		}
		else if (dinero%20==0) {
			int billetes = dinero/20;
		}
		else if (dinero%10==0) {
			int billetes = dinero/10;
		}
       
       
          
		
		
	}

}
