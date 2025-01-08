package com.decroly.daw;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Astros[] astro = new Astros[10];
		String op = "";
		int contAstro = 0;
		
		astro[0] = new Planetas(5, 5, 5, 5, 5, 5, 5, 5, true);
		//masa, diametro, pRotacion, pTraslacion, temperatura, distancia, distSol, orbitaSol, tieneSatelites
		
		
		
		do {
			System.out.println("Seleccione que tipo de Astro quiere añadir: ");
			System.out.println("1. Planeta\n2. Satelite\n3. Mostrar astros\n4. Salir del programa\n");
			op = sc.nextLine();
	
			switch(op) {
			case "1":
				if(contAstro < 10) {
					System.out.println("Has llegado al limite");
				}
				else {
					astro[contAstro] = new Planetas(5, 5, 5, 5, 5, 5, 5, 5, true);
					contAstro++;
				}
				break;
				
			case "2":
				break;
				
			case "3":
				for (int i = 0; i < astro.length; i++) {
					if(astro[i] != null){
						if (astro[i] instanceof Planetas){
							Planetas p1 = (Planetas)astro[i];
							System.out.println(p1);
							System.out.println(p1.getClass().getName());
		    
						}else if(astro[i] instanceof Satelites){
							Satelites p1 = (Satelites)astro[i];
							System.out.println(p1);
							System.out.println(p1.getClass().getName());
						}
						else{
							System.out.println(astro[i]);
						}
					}
				}
				break;
				
			case "4":
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Por favor, seleccione una de las opciones");
				break;
			}
		}while(op != "4");
		
	}	
}