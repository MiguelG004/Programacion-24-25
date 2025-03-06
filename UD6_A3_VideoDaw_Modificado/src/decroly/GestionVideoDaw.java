package decroly;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeParseException; //para try catch al introducir fecha
import java.time.*;
import java.time.format.DateTimeFormatter;
public class GestionVideoDaw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoDaw vc = null;
		Pelicula p = null;
		Videojuego v = null;
		Cliente c = null;
	
		
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
            System.out.println("8. Mostrar lista de clientes");
            System.out.println("9. Mostrar lista de articulos");
            System.out.println("10. Salir");
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
            		String crearProducto;
            		System.out.println("Elija que tipo de producto crear: ");
            		System.out.println("1. Videojuego");
            		System.out.println("2. Pelicula");
            		System.out.println("3. He cambiado de parecer");
            		crearProducto = sc.nextLine();
            		String titulo;
            		switch(crearProducto) {
            		
            		case "1":
            			System.out.println("Creemos un un videojuego");
            			System.out.println("Introduzca el titulo:");
            			titulo = sc.nextLine();
            			System.out.println("Introduce el genero de la pelicula");
            			int genero = 0;
    					
    					do {
    						System.out.println("Genero del videojuego (introduce una opcion) " + 
    								"\n1.-PLATAFORMA" + "\n2.-ACCION" + "\n3.-FPS" + "\n4.-SOULSLIKE" + "\n5.-METROIDVANIA");
    						sc = new Scanner(System.in);
    						genero = sc.nextInt();

    						if (genero == 1){
    							v = new Videojuego(titulo, GeneroJuego.PLATAFORMA);
    							vc.registrarVideojuego(v);
    						}
    						if (genero == 2){
    							v = new Videojuego(titulo, GeneroJuego.ACCION);
    							vc.registrarVideojuego(v);
    						}
    						if (genero == 3){
    							v = new Videojuego(titulo, GeneroJuego.FPS);
    							vc.registrarVideojuego(v);
    						}
    						if (genero == 4){
    							v = new Videojuego(titulo, GeneroJuego.SOULSLIKE);
    							vc.registrarVideojuego(v);
    						}
    						if (genero == 5){
    							v = new Videojuego(titulo, GeneroJuego.METROIDVANIA);
    							vc.registrarVideojuego(v);
    						}
    					
    					}while(genero <= 1 && genero >= 5);
    					
    					System.out.println("Videojuego: '" + titulo + "' creada correctamente");
    					System.out.println("*************************************************");
            			break;
            			
            		case "2":
            			System.out.println("Creemos una pelicula");
            			System.out.println("Introduzca el titulo:");
            			titulo = sc.nextLine();
            			System.out.println("Introduce el genero de la pelicula");
            			genero = 0;
    					
    					do {
    						System.out.println("Genero de la pelicula (introduce una opcion) " + 
    								"\n1.-DRAMA" + "\n2.-SCIFI" + "\n3.-AVENTURA" + "\n4.-COMEDIA" + "\n5.-ANIMACIÓN ");
    						sc = new Scanner(System.in);
    						genero = sc.nextInt();

    						if (genero == 1){
    							p = new Pelicula(titulo, GeneroPelicula.DRAMA);	
    							vc.registrarPelicula(p);
    						}
    						if (genero == 2){
    							p = new Pelicula(titulo, GeneroPelicula.SCIFI);
    							vc.registrarPelicula(p);
    						}
    						if (genero == 3){
    							p = new Pelicula(titulo, GeneroPelicula.AVENTURA);
    							vc.registrarPelicula(p);
    						}
    						if (genero == 4){
    							p = new Pelicula(titulo, GeneroPelicula.COMEDIA);
    							vc.registrarPelicula(p);
    						}
    						if (genero == 5){
    							p = new Pelicula(titulo, GeneroPelicula.ANIMACION);
    							vc.registrarPelicula(p);
    						}
    					
    					}while(genero <= 1 && genero >= 5);
    					
    					System.out.println("Pelicula: '" + titulo + "' creada correctamente");
    					System.out.println("************************************************");
            			
            			break;
            			
            		case "3":
            			System.out.println("Volviendo al menú principal...");
            			System.out.println("******************************");
            			break;
            			
            		default:
            			System.out.println("Ha ocurrido un error, volviendo al menú principal");
            			System.out.println("*************************************************");
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
            		try {
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
	                            c = new Cliente(dni, nombre, direccion, fechaNacimiento);
	                            vc.registrarCliente(c);
	                            System.out.println("El cliente " + c.getNombre() + " con dni " + c.getDni() + " ha sido creado existosamente");
	                            System.out.println(c.toString());
	                            System.out.println("**************************************");
	                        } 
	                		catch (ClienteRegistradoException e) {
	                			System.out.println(e.getMessage());
	                        }
	            		}
            		
            		}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
            			System.out.println("Hubo un error, formato de fecha incorrecto");
            			System.out.println("******************************************");
            		}
            	}
            	
            	break;
            
            case "4":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else if(c == null){
            		System.out.println("No hay clientes registrados");
            	}
            	else {
            		System.out.println("Un cliente va a alquilar un articulo");
            		System.out.println("¿Cuál es el afortunado? Introduce el codigo del cliente");
            		System.out.println(vc.mostrarClientesRegistrados());
            		int numSocio = sc.nextInt();
            		System.out.println("Seleccione el articulo que desea alquilar: ");
            		System.out.println(vc.mostrarArticulosNoAlquilados(vc));
            		int codigo = sc.nextInt();
            		try {
            			vc.alquilarArticulo(codigo, numSocio);
            			System.out.println("El articulo con codigo " + codigo + " ha sido añadido correctamente al cliente " + numSocio);
            		}catch(ArticuloAlquiladoException e) {
            			System.out.println(e.getMessage());
            		}  		
            	}
            	break;
            	
            case "5":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else if(c == null){
            		System.out.println("No hay clientes registrados");
            	}
            	else {
            		System.out.println("Se va a devolver un articulo: ");
            		System.out.println("¿Qué cliente va a devolverlo?");
            		System.out.println(vc.mostrarClientesRegistrados());
            		int numSocio = sc.nextInt();
            		System.out.println("Que articulo quiere devolver: ");
            		System.out.println(c.mostrarArticulosAlquilados());
            		int codigo = sc.nextInt();
            		try{
            		vc.devolverArticulo(codigo, numSocio);
            		System.out.println("El articulo con codigo " + codigo + " ha sido devuelto correctamente por parte del cliente " + numSocio);
            		}catch(TiempoExcedidoException e) {
            			System.out.println(e.getMessage());
            		}
            	}
            	break;
            	
            case "6":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else if(c == null){
            		System.out.println("No hay clientes para darlos de baja");
            	}
            	else {
            		System.out.println("Seleccione el cliente a dar de baja (por numero de socio): ");
            		System.out.println(vc.mostrarClientesRegistrados());
            		int numSocio = sc.nextInt();
            		vc.darBajaCliente(numSocio);
            	}
            	break;
            	
            case "7":
            	if (vc == null){
            		System.out.println("Antes será necesario crear un videoclub en la franquicia");
            	}
            	else if(v == null && p == null){
            		System.out.println("No hay articulos registrados");
            	}
            	else {
            		System.out.println("Selecciona el articulo a dar de baja.");
                    System.out.println(vc.mostrarArticulosNoAlquilados(vc));
                    int codigo = sc.nextInt();
                    vc.darBajaArticulo(codigo);
            	}
            	break;
            	
            case "8":
            	if(c == null) {
            		System.out.println("Lista vacia");
            		System.out.println("****************");
            	}
            	else {
            	System.out.println("Lista de clientes: ");
            	System.out.println(vc.mostrarClientesRegistrados());
            	System.out.println("*********************************");
            	}
            	
            	break;
            	
            case "9":
            	if(v == null && p == null) {
            		System.out.println("Lista vacia");
            		System.out.println("****************");
            	}else {
            	System.out.println("Lista de articulos: ");
            	System.out.println(vc.mostrarArticulosRegistrados());
            	System.out.println("*********************************");
            	}
            	break;
            	
            case "10":
            	System.out.println("Saliendo del programa...");
            	break;
            	
           default:
        	   System.out.println("Introduce una opción correcta");
        	   break;
            	
            }
            
		}while(!op.equals("10"));
		
		
		
	}

	
	private static boolean validarCif(String cif){
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return cif.matches("[A-Z]{1}[0-9]{8}");
    }
	
	private static boolean validarDni(String dni){
        //valida cualquier letra de la A a la Z, solo pueden ponerse 2 letras, despues buscas dos numeros, y por ultimo combinacion letras y numeros hasta 20
		return dni.matches("[0-9]{8}[A-Z]{1}");
    }
	
    
    
}
