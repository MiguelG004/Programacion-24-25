package decroly;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String op = "";

		Producto pr = new Producto();
		
		do {
			sc = new Scanner(System.in);
			System.out.println("**************************************************");
			System.out.println("Introduzca una opcion:");
			System.out.println("1. Crear producto");
			System.out.println("2. Mostrar productos existentes");
			System.out.println("3. Eliminar producto por codigo");
			System.out.println("4. Guardar productos en el fichero");
			System.out.println("5. Salir");
			op = sc.nextLine();
			
			switch(op) {
			
			case "1":
				System.out.println("Vamos a crear un producto: ");
				System.out.println("Introduce el nombre del producto");
				String nombre = sc.nextLine();
				int cantidad = 0;
			    boolean cantidadValida = false;
			    while (!cantidadValida) {
			        try {
			            System.out.println("A continuación, introduce la cantidad de productos");
			            cantidad = sc.nextInt();
			            cantidadValida = true; // Si la cantidad es válida, salimos del bucle
			        } catch (InputMismatchException e) {
			            System.out.println("Error: Debes introducir un número entero para la cantidad.");
			            sc.nextLine();
			        }
			    }
			    double precio = 0.0;
			    boolean precioValido = false;
			    while (!precioValido) {
			        try {
			            System.out.println("Introduce ahora el precio");
			            precio = sc.nextDouble();
			            precioValido = true; // Si el precio es válido, salimos del bucle
			        } catch (InputMismatchException e) {
			            System.out.println("Error: Debes introducir un dato válido para el precio.");
			            sc.nextLine();
			        }
			    }
				
				pr = new Producto(nombre, cantidad, precio);
				pr.añadeProducto(nombre, cantidad, precio); //añado el producto a la linked list
				
				
				System.out.println("Se añadio correctamente el siguiente producto: ");
				System.out.println("Producto " + nombre + ", " + cantidad + " unidades, " + precio + "€");
				break;
				
			case "2":
				System.out.println("*************************************");
				System.out.println("LISTA DE PRODUCTOS:");
				pr.listadoProductos();
				
				break;
				
			case "3":
				System.out.println("Elige el producto que quieras eliminar (escribe SOLO el codigo");
				pr.listadoProductos();
				int codigo = sc.nextInt();
				pr.eliminaContacto(codigo);
				System.out.println("El producto con el codigo: " + codigo + " ha sido eliminado");
				break;
				
			case "4":
				break;
				
			case "5":
				System.out.println("Saliendo del programa");
				break;
				
			default:
				System.out.println("Algo ha ocurrido mal, introduce una opción válida");
			break;
			
			}
			
		}while(!op.equals(5));
		
		
		
		
	}//nb

}//nb
