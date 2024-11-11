package com.decroly.daw;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String opcion = ""; //creo la variable para el menú principal
		int n = 0; //variable para el numero inicial de valores del array
		
		System.out.println("Este programa te va a pedir un array y mediante un menú, ver sus valores o modificarlos");
		System.out.println("¿Cuántos valores quieres que tenga tu array?: ");
		n = sc.nextInt();
		int menu[] = new int[n]; //creo el array de tamaño "n", con la n pedida antes
		
		sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
		
		//do while para hacer el menu principal y que se repita hasta que se quiera
		do {
			sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("Elige una opción: ");
			System.out.println("A: Modificar colección\nB: Estadisticas de la colección\n"
					+ "C: Ampliar valor de la colección\nD: Ver colección\nS: Salir");
			opcion = sc.nextLine().toUpperCase(); //Comando toUpperCase para que no salga error si pones una letra minuscula
			
			switch(opcion) {
			//Escribes A en el teclado y salta a esta opción
			case "A":
				String aopcion ="";
				int v = 0;
				int p = 0;
				//creo un submenú dentro de la opción A para poder modificar a elección, repitiendo el bucle para que se modifique cuanto se quiera
				do {
					sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
					System.out.println("OPCIÓN A");
					System.out.println("¿Que quieres modificar?: ");
					System.out.println("1: Rellenar array\n2: Insertar un numero\n3: Borrar numero de posicion especifica\n"
							+ "5: Modificar numero de posicion especifica");
					System.out.println("4: Volver al menú principal");
					aopcion = sc.nextLine();

					switch(aopcion) {
					
					case "1":
						System.out.println("Vas a añadir un numero a la array: ");
						
						System.out.println("Valor: "); 
						//muestro el array con sus valores en pantalla para tener referencia de que vas a modificar
						for(int i = 0; i < menu.length; i++){
		                    System.out.print(menu[i] + ", ");
		                    if(i >= 10) {
		                    	System.out.print(" "); //si un numero es mayor de 10, hace espacio para que sea mas facil visualizar
		                    }
						 }
						
						//creo un bucle for que señala que posicion del array que estás cambiando, debajo de cada valor, para hacerlo mas facil de ver
						System.out.println("\nPosición: ");
						for(int i = 0; i < menu.length; i++){
		                    System.out.print(i + ", ");
						 }
						
						 System.out.println("Vas a rellenar los datos");
						for(int i = 0; i < menu.length; i++) {
							System.out.println("Posición: " + i);
							System.out.println("Dale un valor:");
							v = sc.nextInt();
							menu[i] = v;
						}
						break;
					
					case "2":
						System.out.println("Vas a añadir un numero a la array: ");
						
						System.out.println("Valor: "); 
						//muestro el array con sus valores en pantalla para tener referencia de que vas a modificar
						for(int i = 0; i < menu.length; i++){
		                       System.out.print(menu[i] + ", ");
		                       if(i >= 10) {
		                    	   System.out.print(" "); //si un numero es mayor de 10, hace espacio para que sea mas facil visualizar
		                       }
						 }
						
						//creo un bucle for que señala que posicion del array estás cambiando, debajo de cada valor, para hacerlo mas facil de ver
						System.out.println("\nPosición: ");
						for(int i = 0; i < menu.length; i++){
		                       System.out.print(i + ", ");
						 }
						 
						System.out.println("\n");
						System.out.println("Introduce el valor que quieres añadir: ");
						v = sc.nextInt();
						System.out.println("Selecciona que posicion de la array quieres modificar "
								+ "(ten en cuenta que la poscicion 0 es donde se encuentra el primer valor): ");
						p = sc.nextInt();
						
						//si la posicion p no coincide con las posiciones del array, salta el error
						if (p < 0 || p >= menu.length) {
							System.out.println("Dato no valido, te has pasado del recorrido de la araray\n");
						}
						else {
							//la posicion "p" del menu se cambia al valor "v"
							menu[p] = v;
							System.out.println("Valor " + v + " añadido en la posisción " + (p) + "\n");
						}
						break;
						
					case "3":
						System.out.println("¿Qué posición quieres borrar?");
						
						System.out.println("Valor: "); 
						//Lo mismo que en el caso 1
						for(int i = 0; i < menu.length; i++){
		                       System.out.print(menu[i] + ", ");
		                       if(i >= 10) {
		                    	   System.out.print(" ");
		                       }
						 }
						
						System.out.println("\nPosición: "); //Lo mismo que en el caso 1
						 for(int i = 0; i < menu.length; i++){
		                       System.out.print(i + ", ");
						 }
						
						 System.out.println();
						 System.out.println("Elige la posición del valor a borrar: ");
						 p = sc.nextInt();
						 menu[p] = 0; //La posicion elegida se "borra" al cambiarla por cero automaticamente
						 System.out.println("La array ahora se ve de esta forma: "); //muestra el array para ver los cambios
						 for(int i = 0; i < menu.length; i++){
		                       System.out.print(menu[i] + ", ");
						 }
						 System.out.println("\n");
						break;
						
					case "4":
						System.out.println("¿Qué valor quieres modificar?");
						System.out.println("Valor: "); 
						for(int i = 0; i < menu.length; i++){
		                       System.out.print(menu[i] + ", ");
		                       if(i >= 10) {
		                    	   System.out.print(" ");
		                       }
						 }
						 System.out.println("\nPosición: ");
						 for(int i = 0; i < menu.length; i++){
		                       System.out.print(i + ", ");
						 }
						 System.out.println();
						 System.out.println("Elige el nuevo valor que quieres darle");
						 v = sc.nextInt();
						 System.out.println("Elige la posición del valor a modificar: ");
						 p = sc.nextInt();
						//si la posicion p no coincide con las posiciones del array, salta el error
							if (p < 0 || p >= menu.length) {
								System.out.println("Dato no valido, te has pasado del recorrido de la araray\n");
							}
							else {
								
								menu[p] = v;  //el valor de la posicion p se cambia especificamente por el nuevo valor v
								System.out.println("Valor " + v + " añadido en la posisción " + (p) + "\n");
							}
						break;
						
					case "5":
						System.out.println("volviendo al menú principal...");
						System.out.println();
						break;
					
					//si has cometido algun error al meter el valor del programa, salta el error
					default:
						System.out.println("Has introducido una opción incorrecta");
						System.out.println("Asegurate de que has introducido bien los valores para usar el programa");
						System.out.println();
						break;
					}
					
				}while(!aopcion.equals("5")); //al ser variable String, no se puede utilizar !=, entonces se usa este comando
				System.out.println("");  		//al escribir 4, se cierra este menu y vuelves al menu principal
				break;
				
				
			case "B":
				String bopcion = "";
				do {
					sc = new Scanner(System.in); //para reiniciar el escaner por si acaso
					System.out.println("OPCIÓN B: ESTADISTICAS");
					System.out.println("¿Qué estadistica quieres ver?: ");
					System.out.println("1: Media de valores insertados\n2: Suma de los valores\n3: Valor máximo\n4: Valor minimo");
					System.out.println("5: Volver al menú principal");
					bopcion = sc.nextLine();
					
					switch(bopcion) {
					case "1":
						double media = 0; //creo la variable media
						System.out.println("Mostrando la MEDIA de los valores: ");
						System.out.println("Valores: "); 
						for(int i = 0; i < menu.length; i++){
								System.out.print(menu[i] + ", ");
								media = media + menu[i]; //cada vez que recorre el array, suma el valor actual a la variable media
						 }
						media = media/menu.length; //el nuevo valor de media es la suma de todo entre el total de valores
						System.out.println();
						System.out.println("media: " + media);
						break;
						
					case "2":
						double suma = 0;
						System.out.println("Mostrando la SUMA de los valores: ");
						System.out.println("Valores: "); 
						for(int i = 0; i < menu.length; i++){
								System.out.print(menu[i] + ", ");
								suma = suma + menu[i]; //igual que con media, pero sin dividirlo por el total de valores
						 }
						System.out.println();
						System.out.println("Suma total de los valores: " + suma);
						break;
						
					case "3":
						int max = 0;
						System.out.println("Valor maximo es: ");
						System.out.println("Valores: "); 
						for(int i = 0; i < menu.length; i++){
							System.out.print(menu[i] + ", ");
							if(i == 0) {
								max = menu[i]; //Establece como el valor maximo el primer valor de la array
							}
							if(max < menu[i]) {
								max = menu[i]; //Ahora, si mientras recorre la array, el valor de dentro de la array es mayor que
							}					//el maximo anterior, se actualiza
						}
						System.out.println("\nValor maximo: " + max);
						break;
						
					case "4":
						int min = 0;
						System.out.println("Valor minimo es: ");
						System.out.println("Valores: "); 
						for(int i = 0; i < menu.length; i++){
							System.out.print(menu[i] + ", ");
							if(i == 0) {
								min = menu[i]; //Establece como el valor minimo el primer valor de la array
							}
							if(min > menu[i]) {
								min = menu[i]; //Ahora, si mientras recorre la array, el valor de dentro de la array es menor que
							}					//el maximo anterior, se actualiza
						}
						System.out.println("\nValor minimo: " + min);
						break;
						
					case "5":
						System.out.println("volviendo al menú principal...");
						System.out.println();
						break;
						
					default:
						System.out.println("Has introducido una opción incorrecta");
						System.out.println("Asegurate de que has introducido bien los valores para usar el programa");
						System.out.println();
						break;
					}
					
				}while(!bopcion.equals("5")); //al escribir 5, se cierra el submenu y vuelves al principal
				System.out.println("");
				break;
				
				
			case "C":
				String copcion = "";
				do {
					sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
				System.out.println("¿Estás seguro que quieres actualizar la array? Se borraran todos los valores introducidos");
				System.out.println("Si/No");
				copcion = sc.nextLine().toUpperCase();
				switch(copcion) {
					case "SI":
						sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
						System.out.println("¿Cuanto quieres ampliar el valor de la colección?: ");
						System.out.println("Introduce el tamaño que quieres que sea la array: ");
						n = sc.nextInt();
						menu = new int[n]; //igual que el paso del principio de saber el tamaño de la array, pero para modificarlo
						System.out.println("El nuevo tamaño de la array es de " + n + " valores");
						
						//esto lo creo para que al escribir "NO" de no querer seguir, vuelva al menu principal
						System.out.println("¿Seguir en este menú?");
						System.out.println("Si (volver a cambiar el tamaño)\nNo (volver al menu principal");
						sc = new Scanner(System.in); //para reiniciar el escaner por si acaso no funciona bien
						copcion = sc.nextLine().toUpperCase();
						break;
					case "NO":
						System.out.println("Volviendo al menú principal");
						break;
					default:
						System.out.println("No lo has escrito bien");
						System.out.println("Por favor, introduce 'Si' o 'No'");
						break;
					}
				}while(!copcion.equals("NO"));
				System.out.println();
				break;
				
				
			case "D": //me invento este caso para poder ver todos los valores y tener una ayuda sin tener que entrar a otra opcion
				System.out.println("Valores de la array: ");
                for(int i = 0; i < menu.length; i++){
                       System.out.print(menu[i] + ", ");
                }
                System.out.println("\n");
				break;
				
				
			case "S":
				System.out.println("Saliendo de programa...");
				break;
				
			
			default: //si se comete alguna falta al intentar meter la opcion, salta el error
				System.out.println("Has introducido una opción incorrecta");
				System.out.println("Asegurate de que has introducido bien los valores para usar el programa");
				System.out.println();
				break;
				
			}
			
		}while(!opcion.equals("S"));
		
		sc.close();
		
	}

}
