package com.decroly.daw;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class GestionVideoDaw {

	public static void main(String[] args) {

		String opcion ="";
	
		
		VideoDaw videoclub = null; 
		Pelicula pelicula = null; 
		Cliente cliente = null; 
		
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una opción");
			System.out.println("1.Crear y registrar videoclub\n2.Registrar pelicula en el videoclub\n"
					+ "3. Crear y registrar cliente\n4.Alquilar película\n5.Devolver pelicula\nDar de baja cliente"
					+ "\n7.Dar de baja pelicula\n8.Salir");
			sc = new Scanner(System.in);
			opcion = sc.nextLine();
			switch(opcion){
			
			case "1":
				if(videoclub == null) {
					String cif ="";
					String direccion ="";
					System.out.println("Creemos tu videoclub: ");
					System.out.println("Igresa un CIF");
					cif = sc.nextLine();
					System.out.println("Introduce la dirección del videoclub");
					direccion = sc.nextLine();
					videoclub = new VideoDaw(cif, direccion);
				}
				
				else {
				System.out.println(videoclub.mostrarInfoVideoClub());;
				}
				
				
				break;
				
			case "2":
				if(videoclub != null){
					sc = new Scanner(System.in);
					System.out.println("***************");
					System.out.println("Registra una nueva pelicula:");	
					System.out.print("Registra el titulo: ");
					String titulo = sc.nextLine();
					System.out.println("");
					int genero = 0;
					
					do {
						System.out.println("Genero de la pelicula (introduce una opción) " + 
								"\n1.-DRAMA" + "\n2.-SCIFI" + "\n3.-MUSICAL" + "\n4.-AVENTURA" + "\n5.-ACCION " + 
								"\n6.-COMEDIA" + "\n7.-AVENTURA" + "\n8.-FANTASIA" + "\n9.-DOCUMENTAL" + "\n10. Animado");
						sc = new Scanner(System.in);
						genero = sc.nextInt();

						if (genero == 1){
							pelicula = new Pelicula(titulo, Genero.DRAMA);	
						}
						if (genero == 2){
							pelicula = new Pelicula(titulo, Genero.SCIFI);
						}
						if (genero == 3){
							pelicula = new Pelicula(titulo, Genero.MUSICAL);
						}
						if (genero == 4){
							pelicula = new Pelicula(titulo, Genero.AVENTURA);
						}
						if (genero == 5){
							pelicula = new Pelicula(titulo, Genero.ACCION);
						}
						if (genero == 6){
							pelicula = new Pelicula(titulo, Genero.COMEDIA);
						}
						if (genero == 7){
							pelicula = new Pelicula(titulo, Genero.FANTASIA);
						}
						if (genero == 8){
							pelicula = new Pelicula(titulo, Genero.DOCUMENTAL);
						}
						if (genero == 9){
							pelicula = new Pelicula(titulo, Genero.ACCION);
						}
						if (genero == 10){
							pelicula = new Pelicula(titulo, Genero.ANIMADO);
						}
					}while(genero <= 1 && genero >= 10);
					
					System.out.println("Pelicula registrada correctamente");
					System.out.println(pelicula.mostrarInfoPelicula());
			
					}
				else{
					System.out.println("Sin videoclub no se pueden registrar peliculas");
				}			
				break;
				
			case "3":
				
				if (videoclub != null){
					sc = new Scanner(System.in);
					System.out.println("Registra un nuevo cliente");	
					String dni = "";
					String patronDNI = "[0-9]{8}[A-Z]";
			        Pattern pattern = Pattern.compile(patronDNI);
					do {
						System.out.println("Introduce el DNI:");
						dni = sc.nextLine();
						Matcher matcher = pattern.matcher(dni);
					}while(!pattern.matcher(dni).matches());
					System.out.println("DNI introducido correctamente");
					System.out.println("Introduce el nombre");
					String nombre = sc.nextLine();
					System.out.println("Introduce la direccion");
					String direccion = sc.nextLine();
					cliente = new Cliente(dni, nombre, direccion);
					System.out.println("Cliente creado correctamente");

				}
				else {
					System.out.println("Sin videoclub no se pueden registrar clientes");
				}
				
				break;
				
			case "4":
				sc = new Scanner(System.in);

				
				if(videoclub != null && pelicula != null && cliente != null){

					System.out.println("Cliente que vaya a alquilar:");
					videoclub.mostrarClientes();	 
					int ncliente = sc.nextInt();
				
					System.out.println("Pelicula a alquilar");
					videoclub.mostrarPeliculas();
					int npelicula = sc.nextInt();

					
					if(videoclub.obtenerNumPelicula(npelicula).isAlquilada() == false){

						
						videoclub.alquilarPelicula(ncliente, npelicula);
						videoclub.obtenerNumCliente(ncliente).addPelicula
						(videoclub.obtenerNumPelicula(npelicula));

						
						System.out.println(videoclub.obtenerNumCliente(ncliente).mostrarPeliculas());	
					} else if (videoclub.obtenerNumPelicula(npelicula).isAlquilada() == true){
						System.out.println("La pelicula seleccionada ya esta alquilada");
					}
				}else {
					System.out.println("Sin videoclub no se pueden alquilar peliculas");
					}
				break;
				
			case "5":
				
				if( videoclub != null && pelicula != null && cliente != null){

					
					System.out.println("Quien va a devolver la pelicula");
					videoclub.mostrarClientes();	 
					int bajacliente = sc.nextInt();

					System.out.println("Selecciona pelicula a devolver");
					System.out.println(videoclub.obtenerNumCliente(bajacliente).mostrarPeliculas());
					int bajapelicula = sc.nextInt();

					videoclub.devolverPelicula(bajacliente, bajapelicula);
					videoclub.obtenerNumCliente(bajacliente).eliminarPelicula(videoclub.obtenerNumPelicula(bajapelicula));
				} else {
					System.out.println("Sin videoclub no se pueden devolver peliculas");
				}
				break;
				
			case "6":
				sc = new Scanner(System.in);
				if(videoclub != null){
				System.out.println("Introduce el cliente a dar de baja");
				videoclub.mostrarClientes();
		    	int nCliente = sc.nextInt();
				videoclub.darBajaCliente(cliente, nCliente);
				} 
				else{
					System.out.println("No hay clientes registrados");
				}
				break;
				
			case "7":
				sc = new Scanner(System.in);
				if(videoclub != null){
				System.out.println("Introduce la posicion de la pelicula a dar de baja");
				videoclub.mostrarPeliculas();
				int cod = sc.nextInt();
				videoclub.darBajaPelicula(pelicula, cod);
				} 
				else {
					System.out.println("Sin videoclub no se pueden dar de baja peliculas");
				}
				break;
				
			case "8":
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Introduce una opcion correcta");
				break;
			}
		}while(!opcion.equals("8"));
		
	}

}


