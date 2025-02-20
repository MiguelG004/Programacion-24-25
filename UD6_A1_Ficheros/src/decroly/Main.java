package decroly;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String op = "";

		Producto pr = new Producto();

		try(FileReader ficheroProductos = new FileReader("./resources/listado.csv");
	            BufferedReader lector = new BufferedReader(ficheroProductos);){
	            String linea = lector.readLine();
	            while(linea != null){
	                String[] datos = linea.split(",");
	                pr = new Producto(datos[0],datos[1],Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
	                pr.añadeProducto(op, 0, 0);
	                linea = lector.readLine();
	            }
	        }catch(IOException e){
	            System.out.println("Error al leer el fichero de productos");
	            System.out.println(e.getMessage());
	        }catch(IndexOutOfBoundsException e){
	            System.out.println("El formato de los datos no está bien guardado");
	        }
		
		
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
			            cantidadValida = true; // Si la cantidad es válida, termina el bucle
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
			            precioValido = true;
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
				
				 System.out.println("Opción de guardado de listado");
                 try(FileWriter ficheroProductos = new FileWriter("./resources/listado.csv",false);
                     BufferedWriter escritor = new BufferedWriter(ficheroProductos)){
                     escritor.write(stringToFile(pr));
                     escritor.newLine();
                 }catch(IOException e){
                     System.out.println("Error al escribir el fichero de productos");
                     e.getMessage();
                 }
				
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
