package decroly;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.decroly.daw.Genero;
import com.decroly.daw.Pelicula;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class GestionVideoDaw {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VideoDaw vc = null;
		Pelicula p = null;
	
		
		String op = "";
		do {
			sc = new Scanner(System.in);
			System.out.println("Elije una opción: ");
			System.out.println("1. Crear y registrar VideoClub");
            System.out.println("2. Registrar articulo");
            System.out.println("3. Crear y registrar cliente");
            System.out.println("4. Alquilar articulo");
            System.out.println("5. Devolver articulo");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja articulo");
            System.out.println("8. Salir");
            op = sc.nextLine();
            
            switch(op) {
            
            case "1":
            	if (vc == null) {
            	System.out.println("¡Empecemos a crear tu propia franquicia de videoclubs!");
            	String cif;
            	do {
        			System.out.print("Por favor, introduzca tu CIF (Ej: A12345678):");
        			cif = sc.nextLine().toUpperCase(); //a mayuscula en caso de que se ponga en minuscula
        			if(!validarCif(cif)){
        				System.out.println("CIF no valido, por favor, introduce un correcto");
        			}
        		}while(!validarCif(cif));
            	System.out.println("A continuación, introduce una dirección: ");
            	String direccion = sc.nextLine();
            	LocalDate fechaAlta = LocalDate.now();
            	vc = new VideoDaw (cif, direccion);
            	System.out.println("Enhorabuena, tu VideoClub ha sido creado existosamente");
            	System.out.println("******************************************************");
            	}
            	else {
            		System.out.println("Vaya, parece que ya ha creado su propio VideoClub");
            		System.out.println("*************************************************");
            	}
            	
            	break;
            
            case "2":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            		System.out.println("********************************************************");
            	}
            	else {
            		sc = new Scanner(System.in);
            		System.out.println("Elija que tipo de producto crear: ");
            		System.out.println("1. Videojuego");
            		System.out.println("2. Pelicula");
            		System.out.println("3. He cambiado de parecer");
            		String crearProducto = sc.nextLine();
            		String titulo;
            		switch(crearProducto) {
            		
            		case "1":
            			break;
            			
            		case "2":
            			System.out.println("Creemos una pelicula");
            			System.out.println("Introduzca el titulo:");
            			titulo = sc.nextLine();
            			System.out.println("Introduce el genero de la pelicula");
            			int genero = 0;
    					
    					do {
    						System.out.println("Genero de la pelicula (introduce una opci�n) " + 
    								"\n1.-DRAMA" + "\n2.-SCIFI" + "\n3.-MUSICAL" + "\n4.-AVENTURA" + "\n5.-ACCION " + 
    								"\n6.-COMEDIA" + "\n7.-AVENTURA" + "\n8.-FANTASIA" + "\n9.-DOCUMENTAL" + "\n10. Animado");
    						sc = new Scanner(System.in);
    						genero = sc.nextInt();

    						if (genero == 1){
    							p = new Pelicula(titulo, GeneroPelicula.DRAMA);	
    						}
    						if (genero == 2){
    							p = new Pelicula(titulo, GeneroPelicula.SCIFI);
    						}
    						if (genero == 3){
    							p = new Pelicula(titulo, GeneroPelicula.AVENTURA);
    						}
    						if (genero == 4){
    							p = new Pelicula(titulo, GeneroPelicula.COMEDIA);
    						}
    						if (genero == 5){
    							p = new Pelicula(titulo, GeneroPelicula.ACCION);
    						}
    						if (genero == 6){
    							p = new Pelicula(titulo, GeneroPelicula.COMEDIA);
    						}
    						if (genero == 7){
    							p = new Pelicula(titulo, Genero.FANTASIA);
    						}
    						if (genero == 8){
    							p = new Pelicula(titulo, Genero.DOCUMENTAL);
    						}
    						if (genero == 9){
    							p = new Pelicula(titulo, Genero.ACCION);
    						}
    						if (genero == 10){
    							p = new Pelicula(titulo, Genero.ANIMADO);
    						}
    					}while(genero <= 1 && genero >= 10);
            			
            			break;
            			
            		case "3":
            			System.out.println("Volviendo al menú principal...");
            			System.out.println("******************************");
            			break;
            		}
            		
            	}
            	break;
            	
            case "3":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else {
            		System.out.println("Vamos a crear y registrar un cliente en nuestra base de datos:");
            		
            		LocalDate fechaNacimiento;
            		LocalDate fechaMinimaEdad;
            		LocalDate fechaActual;
            		
            		System.out.print("Introduce tu fecha de nacimiento (dd/mm/yyyy)");
            		String fechaN = sc.nextLine();
            		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                	fechaNacimiento = LocalDate.parse(fechaN, formatter);
                	fechaActual = LocalDate.now();
                    fechaMinimaEdad = fechaNacimiento.plusYears(18);
                    
            		if(fechaMinimaEdad.isAfter(fechaActual)){
            			System.out.println("Fecha no valida, no se pueden crear menores de edad");
            			System.out.println("Procediendo a no crear el cliente");
            			System.out.println("***************************************************");
            		}
            		else {
            			System.out.println("Introduce el nombre: ");
                		String nombre = sc.nextLine();
                		
                		System.out.println("Ahora introduce el dni: ");
                		String dni;
                		do {
                			System.out.print("Por favor, introduzca tu DNI:");
                			dni = sc.nextLine().toUpperCase(); //a mayuscula en caso de que se ponga en minuscula
                			if(!validarDni(dni)){
                				System.out.println("CIF no valido, por favor, introduce un correcto");
                			}
                		}while(!validarDni(dni));
                		
                		System.out.println("Introduce una direccion: ");
                		String direccion = sc.nextLine();
                		
                		try {
                            Cliente c = new Cliente(dni, nombre, direccion, fechaNacimiento);
                            vc.registrarCliente(c);
                            System.out.println("El cliente " + c.getNombre() + " con dni " + c.getDni() + " ha sido creado existosamente");
                            System.out.println(c.toString());
                        } 
                		catch (ClienteRegistradoException e) {
                			System.out.println(e.getMessage());
                        }
            		}
            	}
            	
            	break;
            
            case "4":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else {
            		
            	}
            	break;
            	
            case "5":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else {
            		
            	}
            	break;
            	
            case "6":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else {
            		
            	}
            	break;
            	
            case "7":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else {
            		
            	}
            	break;
            	
            case "8":
            	System.out.println("Saliendo del programa...");
            	break;
            	
           default:
        	   System.out.println("Introduce una opción correcta");
        	   break;
            	
            }
            
		}while(!op.equals("8"));
		
		
		
	}

	
	private static boolean validarCif(String cif){
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return cif.matches("[A-Z]{1}[0-9]{8}");
    }
	
	private static boolean validarDni(String dni){
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return dni.matches("[0-9]{8}[A-Z]{1}");
    }
	
    
    public static GeneroPelicula menuGeneroPeliculas(){
        Scanner sc = new Scanner(System.in);

        GeneroPelicula generoP =  null;
        System.out.println("Seleccione el genero de la pelicula:");
        for (int i = 0; i < GeneroPelicula.values().length; i++) {
            System.out.println((i+1) + ". " + GeneroPelicula.values()[i]);
        }
        System.out.println("Introduce el numero relacionado con el nombre del genero");
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= GeneroPelicula.values().length){
            generoP = GeneroPelicula.values()[opcion - 1];
            System.out.println("El genero seleccionado es: " + generoP);
        }
        return generoP;
    }

    public static GeneroJuego menuGeneroVideojuegos(){
        Scanner sc = new Scanner(System.in);

        GeneroJuego generoV =  null;
        System.out.println("Seleccione el genero de la pelicula:");
        for (int i = 0; i < GeneroJuego.values().length; i++) {
            System.out.println((i+1) + ". " + GeneroJuego.values()[i]);
        }
        System.out.println("Introduce el numero relacionado con el nombre del genero");
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= GeneroJuego.values().length){
            generoV = GeneroJuego.values()[opcion - 1];
            System.out.println("El genero seleccionado es: " + generoV);
        }
        return generoV;
    }
}
