package com.decroly.daw;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Gestion {

	public static void main(String[] args) {

		//cif de ejemplo E1234567890
		
		Trabajador trabajadores = null; //establezco la variable trabajadores de la clase Trabajador para mas adelante
		
		String nombreE = ""; //Variable para el nombre de la empresa
		String cif = ""; //variable para el cif de la empresa
		String patronCIF = "[A-Z]{1}[0-9]{10}"; //El patron de cif solo puede llevar una letra mayuscula y lo siguen 10 digitos
        Pattern pattern = Pattern.compile(patronCIF);
        String patronDNI = "[0-9]{8}[A-Z]"; //DNI son 8 digitos + letra mayuscula
        Pattern patterndni = Pattern.compile(patronDNI);
        String opcion =""; //variable para elegir las opciones del menu
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a tu programa para gestionar tu empresa");
		System.out.println("Primero crea tu empresa:");
		System.out.println("Ingresa el nombre de tu empresa: ");
		nombreE = sc.nextLine();
		
		System.out.println("A continuación ingrese un CIF valido para tu empresa");
		do {
			cif = sc.nextLine().toUpperCase();
			if(!pattern.matcher(cif).matches()) {
				System.out.println("introduce un cif correcto por favor");
			}
		}while(!pattern.matcher(cif).matches()); //solo sale del ciclo while cuando el patron del cif coincida con el patron establecido
		
		Empresa empresa = new Empresa(nombreE, cif); //establece los datos de la variable empresa de la clase empresa
		System.out.println("Tu empresa ha sido creada con exito");
		
		//menu
		do {
			sc = new Scanner(System.in);
			System.out.println("*********************************");
			System.out.println("Introduzca una de las opciones");
			System.out.println("1. Crear persona");
			System.out.println("2. Registrar trabajador en empresa");
			System.out.println("3. Mostrar información general de la empresa");
			System.out.println("4. Mostrar el número de trabajadores actuales");
			System.out.println("5. Mostrar información de todos los trabajadores");
			System.out.println("6. Eliminar trabajador de la empresa");
			System.out.println("7. Eliminar persona del programa.");
			System.out.println("8. Salir de la aplicación");
			sc = new Scanner(System.in);
			opcion = sc.nextLine();
			
			switch (opcion) {
			
			case "1":
				System.out.println("Vamos a crear una persona en la base de datos");
				System.out.println("Escribe su nombre");
				String nombre = sc.nextLine();
				String dni ="";
				do {
					System.out.println("Introduce el DNI:");
					dni = sc.nextLine().toUpperCase();
				}while(!patterndni.matcher(dni).matches()); //lo mismo que el cif pero con el patron del dni
				System.out.println("Escribe su direccion");
				String direccion = sc.nextLine();
				System.out.println("¡Persona creada!");
				empresa.crearPersona(nombre, dni, direccion); //crea una persona y establece sus atributos
				break;
			
			case "2":
				System.out.println("Registra una de las personas existentes dentro de la empresa");
				empresa.mostrarInformacionPersonas();
				int nTrabajador = sc.nextInt();
				int numeroSS = 0;
				System.out.println("¡Trabajador registrado!");
				empresa.registrarTrabajador(numeroSS, nTrabajador); //elige una de las personas creadas para establecer su numero de la ss
				//se borra dni y nombre //MIRAR DESPUES*********************
				break;
			
			case "3":
				System.out.println("Información de tu empresa:");
				System.out.println(empresa.mostrarInformacionEmpresa()); //imprime el metodo de la clase empresa para mostrar la informacion
				break;
			
			case "4":
				System.out.println("Numero actual de trabajadores de la empresa:");
				System.out.println(empresa.getNumTrabajadores()); //imprime el getter de numero de trabajadores para ver el numero de trabajadores de la empresa
				break;
		
			case "5":
					System.out.println("Mostrando información de todos los trabajadores:");
					empresa.mostrarInformacionTrabajadores(); //utiliza el metodo de mostrar la informacion de trabajadores de la clase empresa
					//en este caso no tengo que usar un syso porque el metodo de mostrarInfoTrabajadores es  un metodo void
					
				break;
			
			case "6":
				System.out.println("Elige que trabajador quieres que sea eliminado (elige el numero)");
				empresa.mostrarInformacionTrabajadores();
				nTrabajador = sc.nextInt(); //elige la posicion del trabajador que se quiere eliminar
				empresa.eliminarTrabajadorEmpresa(trabajadores, nTrabajador); //llama al metodo de eliminar y busca la posicion segun el numero puesto por teclado
				break;
			
			case "7":
				System.out.println("Elige que persona quieres eliminar (elige el numero)");
				empresa.mostrarInformacionPersonas();
				int nPersona = sc.nextInt();
				empresa.eliminarTrabajadorEmpresa(trabajadores, nPersona);
				break;
			
			case "8":
				System.out.println("Saliendo...");
				break;
		
			default:
				System.out.println("Por favor, introduzca una opción correcta");
				break;
			}

		}while(!opcion.equals("8"));
	}

}
