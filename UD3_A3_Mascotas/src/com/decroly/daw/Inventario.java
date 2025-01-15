package com.decroly.daw;
import java.time.LocalDate;
import java.util.Scanner;

public class Inventario {

	public static void main(String[] args) {

		
		Mascotas[] mascotas = new Mascotas[10];
	    int contadorMascotas = 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Inventario de mascotas: ");
		
		do {
			sc = new Scanner(System.in);
			System.out.println("Elige una opción del menú: ");
			System.out.println("1. Mostrar lista de animales");
			System.out.println("2. Mostrar datos de un animal concreto");
			System.out.println("3. Mostrar todos los animales");
			System.out.println("4. Insertar animales");
			System.out.println("5. Eliminar animales");
			System.out.println("6. Vaciar inventario");
			System.out.println("7. Salir del programa");
			op = sc.nextLine();
			
			switch(op) {
			
			case "1":
				if(contadorMascotas > 0){
					String lista = "";
			        for(int i = 0; i < contadorMascotas; i++){
			            lista += (i+1) + " " + mascotas[i].getClass().toString() + " " + mascotas[i].getNombre() + "\n";
			        }
                 }else{
                     System.out.println("No hay animales registrados en el inventario");
                 }
				break;
			
			case "2":
				int elec = 0;
				if(contadorMascotas > 0){
                    do {
                    	String lista = "";
                        for(int i = 0; i < contadorMascotas; i++){
                            lista += (i+1) + " " + mascotas[i].getClass().toString() + " " + mascotas[i].getNombre() + "\n";
                        }
                        System.out.println("Selecciona un animal");
                        elec = sc.nextInt();
                    } while (elec < 1 || elec > mascotas.length);
                    System.out.println(mascotas[(elec)-1].toString());
				}
				else{
                    System.out.println("No hay animales registrados en el inventario");
                }
				break;
			
			case "3":
				
				if(contadorMascotas > 0){
					String listaEntera = "";
			        for(int i = 0; i < contadorMascotas; i++){
			        	listaEntera += (i+1) + " " + mascotas[i].toString() + "\n";
			        }
                }
				else{
                    System.out.println("No hay animales registrados en el inventario");
                }
				
				break;
			
			case "4":
				
				String mascota;
                if(contadorMascotas == mascotas.length){
                    System.out.println("Inventario lleno");
                }
                else{
                    System.out.println("Elige que mascota quieres elegir");
                   
                    System.out.println("1. Perro \n2. Gato\n3. Canario\n4. Loro");
                    mascota = sc.nextLine();
                    
                    switch (mascota){
                        case "1":
                        	System.out.println("Has seleccionado perro");
                        	System.out.println("Inserta el nombre del animal");
                            String nombre = sc.nextLine();
                        	System.out.println("Inserta una raza para el perro");
                            String raza = sc.nextLine();
                            System.out.println("Inserta la edad del perro");
                            int edad = sc.nextInt();
                        	System.out.println("estado del perro (1 = vivo, 2 = muerto");
                        	String estado =sc.nextLine();
                        	if(estado == "1") {
                        		estado = "vivo";
                        	}
                        	else {
                        		estado = "muerto";
                        	}
                        	System.out.println("¿tiene pulgas? (1 = si, 2 = no");
                        	String tienepulgas = sc.nextLine();
                        	boolean pulgas = false;
                        	
                        	if(tienepulgas == "1") {
                        		pulgas = true;
                        	}
                        	else {
                        		pulgas = false;
                        	}
                            mascotas [contadorMascotas] = new Perro(nombre, edad, estado, raza, pulgas);
                            contadorMascotas++;

                            break;
                        case "2":
                        	System.out.println("Has seleccionado Gato");
                        	System.out.println("Inserta el nombre del animal");
                            nombre = sc.nextLine();
                        	System.out.println("Inserta una raza para el gato");
                            String color = sc.nextLine();
                            System.out.println("Inserta la edad del gato");
                            edad = sc.nextInt();
                        	System.out.println("estado del gato (1 = vivo, 2 = muerto");
                        	estado =sc.nextLine();
                        	if(estado == "1") {
                        		estado = "vivo";
                        	}
                        	else {
                        		estado = "muerto";
                        	}
                        	System.out.println("¿tiene pulgas? (1 = si, 2 = no");
                        	String tieneLargo = sc.nextLine();
                        	boolean peloLargo = false;
                        	
                        	if(tieneLargo == "1") {
                        		peloLargo = true;
                        	}
                        	else {
                        		peloLargo = false;
                        	}
                            mascotas [contadorMascotas] = new Gato(nombre, edad, estado, color, peloLargo);
                            contadorMascotas++;
                            break;
                        case "3":
                        	System.out.println("Has seleccionado Canario");
                        	System.out.println("Inserta el nombre del animal");
                            nombre = sc.nextLine();
                        	System.out.println("Inserta un color para el canario");
                            color = sc.nextLine();
                            System.out.println("Inserta un tipo de pico para el canario");
                            String pico = sc.nextLine();
                            System.out.println("Inserta la edad del canario");
                            edad = sc.nextInt();
                        	System.out.println("estado del canario (1 = vivo, 2 = muerto");
                        	estado =sc.nextLine();
                        	if(estado == "1") {
                        		estado = "vivo";
                        	}
                        	else {
                        		estado = "muerto";
                        	}
                        	System.out.println("¿vuela? (1 = si, 2 = no");
                        	String isVuela = sc.nextLine();
                        	boolean vuela = false;
                        	
                        	if(isVuela == "1") {
                        		vuela = true;
                        	}
                        	else {
                        		vuela = false;
                        	}
                        	System.out.println("¿canta? (1 = si, 2 = no");
                        	String isCanta = sc.nextLine();
                        	boolean canta = false;
                        	
                        	if(isCanta == "1") {
                        		canta = true;
                        	}
                        	else {
                        		canta = false;
                        	}
                            mascotas [contadorMascotas] = new Canario(nombre, edad, estado, pico, vuela, color, canta);
                            contadorMascotas++;
                            break;
                            
                        case "4":
                        	System.out.println("Has seleccionado Canario");
                        	System.out.println("Inserta el nombre del animal");
                            nombre = sc.nextLine();
                        	System.out.println("Inserta el origen del canario");
                            String origen = sc.nextLine();
                            System.out.println("Inserta un tipo de pico para el canario");
                            pico = sc.nextLine();
                            System.out.println("Inserta la edad del canario");
                            edad = sc.nextInt();
                        	System.out.println("estado del canario (1 = vivo, 2 = muerto");
                        	estado =sc.nextLine();
                        	if(estado == "1") {
                        		estado = "vivo";
                        	}
                        	else {
                        		estado = "muerto";
                        	}
                        	System.out.println("¿vuela? (1 = si, 2 = no");
                        	isVuela = sc.nextLine();
                        	vuela = false;
                        	
                        	if(isVuela == "1") {
                        		vuela = true;
                        	}
                        	else {
                        		vuela = false;
                        	}
                        	System.out.println("¿habla? (1 = si, 2 = no");
                        	String isHabla = sc.nextLine();
                        	boolean habla = false;
                        	
                        	if(isHabla == "1") {
                        		habla = true;
                        	}
                        	else {
                        		habla = false;
                        	}
                            mascotas [contadorMascotas] = new Canario(nombre, edad, estado, pico, vuela, origen, habla);
                            contadorMascotas++;
                            break;
			
			case "5":
				if(contadorMascotas > 0){
                    do {
                    	String lista = "";
                        for(int i = 0; i < contadorMascotas; i++){
                            lista += (i+1) + " " + mascotas[i].getClass().toString() + " " + mascotas[i].getNombre() + "\n";
                        }
                        System.out.println("Elige un animal a borrar");
                        elec = sc.nextInt();
                    } while ((elec) < 1 || (elec) > mascotas.length);
                    mascotas[(elec)-1] = null;
                    contadorMascotas--;
                }else{
                    System.out.println("No hay animales en el inventario");
                }
				break;
			
			case "6":
				break;
			
			case "7":
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Elija una opcion correcta");
				break;
			}
                    }
                    }
		}while(op != "7");
	}


		
		
	
		}
	