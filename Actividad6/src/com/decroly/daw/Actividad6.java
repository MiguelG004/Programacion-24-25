package com.decroly.daw;
import java.util.Scanner;
import java.util.Arrays;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
//		1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
//		y luego muestre la matriz por pantalla.
		
		
		
		System.out.println("(EJ1)\nMatriz de 5x5");
		int suma = 1;
		int matriz[][] = new int [5][5];
		
		System.out.println("Columna:  1  2  3  4  5");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Fila: "+ (i + 1) + " |");
			for (int j = 0; j < matriz.length; j++) {
                if(suma < 10) {
                	System.out.print(" ");
                }
				matriz[i][j] = suma++;
                System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println("|");
		}
		
		System.out.println("\n");
		
//		2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
//		multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
		
		System.out.println("(Ej2)\nMatriz de 10x10");
		
		int tabla10[][] = new int [10][10];
		
		for (int i = 0; i < tabla10.length; i++) {
			System.out.print("Fila: "+ (i + 1) + "  |");
			for (int j = 0; j < tabla10.length; j++) {
				tabla10[i][j] = (j+1) * (i+1);
                System.out.print(tabla10[i][j] + " ");
			}
			
			System.out.println("|");
		}
		
		System.out.println("\n");
		
		
//		3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
//		introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
//		matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
//		menores que cero y cuántos son igual a cero.
		

		int mayorcero = 0;
		int igualcero = 0;
		System.out.println("(Ej3)\nMe vas a dar dos valores para hacer una matriz del tamaño que quieras, y luego vas a rellenarla");
		System.out.println("Dime cuantas filas quieres para tu matriz");
		int filas = sc.nextInt();
		System.out.println("Dime cuantas columnas quieres");
		int columnas = sc.nextInt();
		int nm[][] = new int [filas][columnas];
		
		System.out.println("Dame " + columnas + " valores para las filas:" );
		for (int i = 0; i < nm.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Fila " + (i+1));
			
			for (int j = 0; j < nm[i].length; j++) {
				
                nm[i][j] = sc.nextInt();
                if(nm[i][j] > 0) {
                	mayorcero++;
                }
                if(nm[i][j] == 0) {
                	igualcero++;
                }
			}
	
		}
		
		
		for (int i = 0; i < nm.length; i++) {
			System.out.print("Fila " + (i + 1) +" | ");
			
			for (int j = 0; j < nm[i].length; j++) {
				System.out.print(nm[i][j] + " ");
			}
		
			System.out.println("|");
		}
		
		System.out.println("Se han encontrado " + mayorcero + " numeros mayores a cero");
		System.out.println("Se han encontrado " + igualcero + " numeros iguales a cero");
		
		
//		4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
//		1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
//		programa mostrará la nota mínima, máxima y media de cada alumno.
		
		
		sc = new Scanner(System.in);        
        double notas[][]= new double[4][5];
        double minima = 0, maxima = 0, sum = 0;
        System.out.println("(Ej4)\nDame 5 notas para 4 alumnos");
        for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < notas[0].length; j++) {
        System.out.print("Para el alumno " + (i+1) + " dime su nota " + (j+1) + ": ");
        notas[i][j] = sc.nextDouble();
            }
        }
     
        System.out.println("");

        for (int i = 0; i < notas.length; i++) {
        System.out.print("Alumno " + (i+1) + " | ");
       
        for (int j = 0; j < notas[0].length; j++) {
                 System.out.print(notas[i][j] + " ");
                 sum += notas[i][j];
                 if (j == 0) {
                     minima = notas[i][j];	//establece como primera posicion el minimo, por si no se introduce ninguna nota mas, esa será el minimo
                     maxima = notas[i][j]; //lo mismo con el maximo, para que por lo menos la primera sea maximo
                 }
                 if(minima > notas[i][j]){
                     minima = notas[i][j]; //si la posicion de las notas en ese momento, es menor que la minima anterior establecida, se establece ese valor como minimo
                 }
                 if(maxima < notas[i][j]){
                     maxima = notas[i][j]; //lo mismo pero con el maximo, si el valor es mas grande, se actualiza el maximo
                 }
             }
                 
        	System.out.print(" | ");
        	System.out.println(" La nota mínima del alumno " + (i+1) + " es: " + minima + ", la nota máxima es: " + maxima +
        						", la nota media es: " + (sum/5));
        	sum=0;
        	System.out.print("");
        }
        System.out.println("\n");
        
		
//		5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
//		y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
//		de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
//		género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
//		matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
//		
	
        System.out.println("(Ej5)\nTe voy a pedir que me des el numero de personas que trabajan en una empresa, su genero y su salario, luego se mostrara el salario medio de cada genero");
        System.out.print("Dime el número de personas ");
            int n = sc.nextInt();
            int numhombres = 0, nummujeres = 0, sumahombres = 0, sumamujeres = 0;

            int sueldos[][] = new int[n][2];
           
            System.out.println("A continuación señalame el genero; 0 para hombre, 1 para mujer");
            for (int i = 0; i < sueldos.length; i++) {
                for (int j = 0; j < sueldos.length; j++) {
                    if (j == 0) { //para la posicion 0 de "j", guarda en el array el genero
                        System.out.print("¿La persona " + (i + 1) + " es hombre o mujer? (0 hombre, 1 mujer): ");
                        sueldos[i][j] = sc.nextInt();
                    }
                    if (j == 1) { //para la posicion 1 de "j" guarda el salario
                        System.out.print("Dame el salario de esta persona: ");
                        sueldos[i][j] = sc.nextInt();
                    }
                }
            }

            for (int i = 0; i < sueldos.length; i++) {
                for (int j = 0; j < sueldos[0].length; j++) {
                    System.out.print(sueldos[i][j] + "");
                    if(sueldos[i][j] == 0) { //si el valor de la columna es 0, imprime que es un hombre
                    System.out.print(" Hombre ");
                    }
                    if(sueldos[i][j] == 1) { //lo mismo pero con mujer
                    System.out.print(" Mujer  ");
                    }
                    if(sueldos[i][j] < 2) {
                    System.out.print("");
                    }
                    else {
                    System.out.print("€ ");
                    }
                }
                System.out.println("");
            }

            for (int i = 0; i < sueldos.length; i++) {
                if (sueldos[i][0] == 0.0) { //si la segunda posicion de la fila es cero:
                    numhombres++;			//suma 1 el contador de los hombres totales para saber la media
                    sumahombres += sueldos[i][1];	//guarda la posicion del sueldo y los va sumando si son hombres
                }
                if (sueldos[i][0] == 1.0) {
                    nummujeres++;
                    sumamujeres += sueldos[i][1];
                }
            }
            System.out.println("El salario medio de los hombre es: " + (sumahombres / numhombres) + "€");
            System.out.println("El salario medio de las mujeres es: " + (sumamujeres / nummujeres) + "€");
        
	}

}
