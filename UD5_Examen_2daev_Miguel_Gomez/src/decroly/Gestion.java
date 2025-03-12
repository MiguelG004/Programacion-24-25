package decroly;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Gestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op ="";
		Director d = null;
		GerenteDep gd = null;
		Trabajador t = null;
		Empresa em = null;
		int numeroTra = 0;
		
		System.out.println("Bienvenido a la creación de tu empresa: ");
		System.out.println("Para poder acceder al menú de su empresa, antes debe de registrar su empresa");
	
		do {
			try {
				
				System.out.println("Introduce los siguientes datos: ");
				System.out.println("1. CIF de la empresa (Letra mayuscula + 10 digitos)");
				System.out.println("(EJ: A1234567890)");
				String cif;
				cif = sc.nextLine().toUpperCase(); //a mayuscula en caso de que se ponga en minuscula
				if(!validarCif(cif)){ //Añado esta parte vacia para que funcione el catch error, al igual que con todos los !validar
    			}
		    	System.out.println("2. Introduce el nombre de la empresa");
		    	String nombreEmpresa=sc.nextLine();
		    	
		    	System.out.println("3. Introduce la fecha de fundación");
		    	System.out.println("(Ej: 11/11/1111)");
		    	String fechaFund = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    	LocalDate fechaFundacion = LocalDate.parse(fechaFund, formatter);
		    	
		    	em = new Empresa (cif, nombreEmpresa, fechaFundacion);
	    	
			}catch(FormatoCifException e) {
				System.out.println("Error, CIF no valido");
				System.out.println("*********************");
			}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
				System.out.println("Hubo un error, formato de fecha incorrecto");
				System.out.println("******************************************");
			}
		}while(em == null);

		System.out.println("Enhorabuena, has creado tu empresa");
			do {
				sc = new Scanner(System.in);
				System.out.println("Elige una opción:");
				System.out.println("1. Registrar trabajador en empresa");
				System.out.println("2. Mostrar información general de la empresa");
				System.out.println("3. Mostrar numero de trabajadores actuales y el organigrama");
				System.out.println("4. Mostrar ingormacion de un departamento");
				System.out.println("5. Eliminar trabajador de empresa");
				System.out.println("6. Agenda del director");
				System.out.println("7. Salir del programa");
				op = sc.nextLine();
				
				switch(op) {
				
				case "1":
					String nombre, dni, direccion, emailEmpresa, numeroTlfDirector, numeroTlf, numeroSS;
					LocalDate fechaNacimiento;
					Double salario;
					
					sc = new Scanner(System.in);
					System.out.println("Seleccione que tipo de trabajador quiere registrar: ");
					System.out.println("1. Registrar director");
					System.out.println("2. Registrar GerenteDep;");
					System.out.println("3. Registrar trabajador normal");
					String registrar = sc.nextLine();
					
					switch(registrar) {
					
					case "1":
						sc = new Scanner(System.in);
						if (d == null){
							try {
								sc = new Scanner(System.in);
								System.out.println("Vamos a crear al director de la empresa:");
								
								System.out.println("Introduce el nombre del director: ");
								nombre = sc.nextLine();
								
								System.out.println("Introduce la fehca de nacimiento: dd/mm/yyyy");
			            		String fechaN = sc.nextLine();
			            		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			                	fechaNacimiento = LocalDate.parse(fechaN, formatter);
			                	
			                	System.out.println("Introduce el DNI a continuación: ");
			                	dni = sc.nextLine().toUpperCase();
			                	if(!validarDni(dni)){
			        			}
			                	
			                	System.out.println("Introduce el numero de la Seguridad Social");
			                	numeroSS = sc.nextLine();
			                	if(!validarNumeroSS(numeroSS)){
			        			}
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce la dirección: ");
			                	direccion = sc.nextLine();
			                	
			                	System.out.println("Introduce el email de la empresa: ");
			                	emailEmpresa = sc.nextLine();
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce el salario: ");
			                	salario = sc.nextDouble();
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce el telefono: ");
			                	numeroTlfDirector = sc.nextLine();
			                	
			                	boolean estaOficina = true;
			                	String oficina;
			                	do {
				                	sc = new Scanner(System.in);
				                	System.out.println("¿Esta en la oficina?");
				                	System.out.println("1. Si, 2. No");
				                	oficina = sc.nextLine();
				                	
				                	if(oficina == "1") {
				                		estaOficina = true;
				                	}
				                	if (oficina == "2") {
				                		estaOficina = false;
				                	}
			                	}while(oficina == "1" || oficina == "2");
			                	System.out.println("Introduce el departamento: ");
			                	
			                	System.out.println("Introduce el departamento: ");
			                	int departamento;
			                	do {
		    						System.out.println("Departamento del director (introduce una opcion) " + 
		    								"\n1.-Informatica" + "\n2.-Gestión" + "\n3.-Marketing");
		    						sc = new Scanner(System.in);
		    						departamento = sc.nextInt();
	
									if (departamento == 1){
										d = new Director(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.Informatica, estaOficina, numeroTlfDirector);
		    							em.registrarDirector(d);
		    							numeroTra++;
		    						}
		    						if (departamento == 2){
		    							d = new Director(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.gestión, estaOficina, numeroTlfDirector);
		    							em.registrarDirector(d);
		    							numeroTra++;
		    						}
		    						if (departamento == 3){
		    							d = new Director(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.marketing, estaOficina, numeroTlfDirector);
		    							em.registrarDirector(d);	
		    							numeroTra++;
		    						}
		    					}while(departamento <= 1 && departamento >= 3);
								
				            	System.out.println("Director registrado correctamente:");
				            	System.out.println(d.toString());
								System.out.println("**********************************************************");
							}catch(MismoDniException e) {
								System.out.println("Error, el DNI ya existe");
			        			System.out.println("******************************************");
							}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
			        			System.out.println("Hubo un error, formato de fecha incorrecto");
			        			System.out.println("******************************************");
							}catch(InputMismatchException e) {
								System.out.println("Error, se introdujo un dato erroneo");
								System.out.println("******************************************");
							}catch(FormatoDniException e) {
								System.out.println("Error, Formato de dni incorrecto");
								System.out.println("******************************************");
							}catch(FormatoNumeroSSException e) {
								System.out.println("Error, Formato del numero de la seguridad social incorrecto");
								System.out.println("******************************************");
							}
						}else {
							System.out.println("Ya existe un director");
						}
						break;
						
					case "2":
						sc = new Scanner(System.in);
						int contadorGerentes = 0;
						if (contadorGerentes <= 3){
							try {
								sc = new Scanner(System.in);
								System.out.println("Vamos a crear a un gerente de la empresa:");
								
								System.out.println("Introduce el nombre del gerente: ");
								nombre = sc.nextLine();
								
								sc = new Scanner(System.in);
								System.out.println("Introduce la fehca de nacimiento: dd/mm/yyyy");
			            		String fechaN = sc.nextLine();
			            		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			                	fechaNacimiento = LocalDate.parse(fechaN, formatter);
			                	
			                	System.out.println("Introduce el DNI a continuación: ");
			                	dni = sc.nextLine().toUpperCase();
			                	if(!validarDni(dni)){
			        			}
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce el numero de la Seguridad Social (10 digitos numericos");
			                	numeroSS = sc.nextLine();
			                	if(!validarNumeroSS(numeroSS)){
			        			}
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce la dirección: ");
			                	direccion = sc.nextLine();
			                	
			                	System.out.println("Introduce el email de la empresa: ");
			                	emailEmpresa = sc.nextLine();
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce el salario: ");
			                	salario = sc.nextDouble();
			                	
			                	System.out.println("Introduce el telefono: ");
			                	numeroTlf = sc.nextLine();
			                	
			                	boolean estaOficina = true;
			                	String oficina;
			                	do {
				                	sc = new Scanner(System.in);
				                	System.out.println("¿Esta en la oficina?");
				                	System.out.println("1. Si, 2. No");
				                	oficina = sc.nextLine();
				                	
				                	if(oficina == "1") {
				                		estaOficina = true;
				                	}
				                	if (oficina == "2") {
				                		estaOficina = false;
				                	}
			                	}while(oficina == "1" || oficina == "2");
			                	System.out.println("Introduce el departamento: ");
			                	
			                	System.out.println("Introduce el departamento: ");
			                	String departamento;
			                	do {
		    						System.out.println("Departamento del director (introduce una opcion) " + 
		    								"\n1.-Informatica" + "\n2.-Gestión" + "\n3.-Marketing");
		    						sc = new Scanner(System.in);
		    						departamento = sc.nextLine();
	
									if (departamento == "1"){
										gd = new GerenteDep(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.Informatica, estaOficina, numeroTlf);
										em.registrarGerente(gd);
										numeroTra++;
										contadorGerentes++;
		    						}
		    						if (departamento == "2"){
		    							gd = new GerenteDep(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.gestión, estaOficina, numeroTlf);
		    							em.registrarGerente(gd);
		    							numeroTra++;
		    							contadorGerentes++;
		    						}
		    						if (departamento == "3"){
		    							gd = new GerenteDep(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.marketing, estaOficina, numeroTlf);
		    							em.registrarGerente(gd);			
		    							numeroTra++;
		    							contadorGerentes++;
		    						}
		    					}while(departamento == "1" || departamento == "2" || departamento == "3");
								
				            	System.out.println("Gerente registrado correctamente:");
				            	System.out.println(gd.toString());
								System.out.println("**********************************************************");
							}catch(MismoDniException e) {
								System.out.println("Error, el DNI ya existe");
			        			System.out.println("******************************************");
							}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
			        			System.out.println("Hubo un error, formato de fecha incorrecto");
			        			System.out.println("******************************************");
							}catch(InputMismatchException e) {
								System.out.println("Error, se introdujo un dato erroneo");
								System.out.println("******************************************");
							}catch(FormatoDniException e) {
								System.out.println("Error, Formato de dni incorrecto");
								System.out.println("******************************************");
							}catch(FormatoNumeroSSException e) {
								System.out.println("Error, Formato del numero de la seguridad social incorrecto");
								System.out.println("******************************************");
							}
						}else {
							System.out.println("Limite de gerentes alcanzados");
						}
						
						break;
						
					case "3":
						sc = new Scanner(System.in);
							try {
								sc = new Scanner(System.in);
								System.out.println("Vamos a registar a un trabajador de la empresa:");
								
								System.out.println("Introduce el nombre del trabajador: ");
								nombre = sc.nextLine();
								
								System.out.println("Introduce la fecha de nacimiento (dd/mm/yyyy):");
			            		String fechaN = sc.nextLine();
			            		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			                	fechaNacimiento = LocalDate.parse(fechaN, formatter);
			                	
			                	System.out.println("Introduce el DNI a continuación: ");
			                	dni = sc.nextLine().toUpperCase();
			                	if(!validarDni(dni)){
			        			}
			                	
			                	System.out.println("Introduce el numero de la Seguridad Social");
			                	numeroSS = sc.nextLine();
			                	if(!validarNumeroSS(numeroSS)){
			        			}
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce la dirección: ");
			                	direccion = sc.nextLine();
			                	
			                	System.out.println("Introduce el email de la empresa: ");
			                	emailEmpresa = sc.nextLine();
			                	
			                	sc = new Scanner(System.in);
			                	System.out.println("Introduce el salario: ");
			                	salario = sc.nextDouble();
			                	
			                	boolean estaOficina = true;
			                	String oficina;
			                	do {
				                	sc = new Scanner(System.in);
				                	System.out.println("¿Esta en la oficina?");
				                	System.out.println("1. Si, 2. No");
				                	oficina = sc.nextLine();
				                	
				                	if(oficina == "1") {
				                		estaOficina = true;
				                	}
				                	if (oficina == "2") {
				                		estaOficina = false;
				                	}
			                	}while(oficina == "1" || oficina == "2");
			                	System.out.println("Introduce el departamento: ");
			                	
			                	int departamento;
			                	do {
		    						System.out.println("Genero del videojuego (introduce una opcion) " + 
		    								"\n1.-Informatica" + "\n2.-Gestión" + "\n3.-Marketing");
		    						sc = new Scanner(System.in);
		    						departamento = sc.nextInt();
	
									if (departamento == 1){
										t = new Trabajador(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.Informatica, estaOficina);
		    							em.registrarTrabajador(t);
		    							numeroTra++;
									}
		    						if (departamento == 2){
		    							t = new Trabajador(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.gestión, estaOficina);
		    							em.registrarTrabajador(t);
		    							numeroTra++;
		    						}
		    						if (departamento == 3){
		    							t = new Trabajador(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, Enumerado.marketing, estaOficina);
		    							em.registrarTrabajador(t);			
		    							numeroTra++;
		    						}
		    					}while(departamento <= 1 && departamento >= 3);
								
				            	System.out.println("Trabajador registrado correctamente:");
				            	System.out.println(t.toString());
								System.out.println("**********************************************************");
							}catch(MismoDniException e) {
								System.out.println("Error, el DNI ya existe");
			        			System.out.println("******************************************");
							}catch(DateTimeParseException e) { //excepcion al convertir la fecha de string a local date
			        			System.out.println("Hubo un error, formato de fecha incorrecto");
			        			System.out.println("******************************************");
							}catch(InputMismatchException e) {
								System.out.println("Error, se introdujo un dato erroneo");
								System.out.println("******************************************");
							}catch(FormatoDniException e) {
								System.out.println("Error, Formato de dni incorrecto");
								System.out.println("******************************************");
							}catch(FormatoNumeroSSException e) {
								System.out.println("Error, Formato del numero de la seguridad social incorrecto");
								System.out.println("******************************************");
							}
					
						break;
						
						default:
							System.out.println("Seleccione una opción correcta");
							System.out.println();
							break;
					}
					break;
					
				case "2":
					System.out.println("INFORMACIÓN GENERAL DE LA EMPRESA");
					System.out.println(em.toString());
					System.out.println("**********************");
					if(d == null){
						System.out.println("No hay director de empresa");
						System.out.println("**********************");
					}else {
						System.out.println("Director:");
						System.out.println(d.toString());
						System.out.println("**********************");
					}
					if(gd == null) {
						System.out.println("No hay gerentes");
						System.out.println("**********************");
					}else {
						System.out.println("Gerentes:");
						System.out.println(gd.toString());
						System.out.println("**********************");
					}
					if(t == null) {
						System.out.println("No hay trabajadores");
						System.out.println("**********************");
					}else {
						System.out.println("Trabajadores:");
						System.out.println(t.toString());
						System.out.println("**********************");
					}
					
					break;
					
				case "3":
					System.out.println("NUMERO ACTUAL DE TRABAJADORES (contando al director): ");
					System.out.println(numeroTra);
					System.out.println("ORGANIGRAMA DE LA EMPRESA:");
					System.out.println("**************************");
					System.out.println("DIRECTOR:");
					if(d == null){
						System.out.println("No hay director de empresa");
						System.out.println("**********************");
					}else {
						System.out.println(d.toString());
						System.out.println("**********************");
					}
					System.out.println("GERENTES:");
					if(gd == null) {
						System.out.println("No hay gerentes");
						System.out.println("**********************");
					}else {
						System.out.println(gd.toString());
						System.out.println("**********************");
					}
					break;
					
				case "4":
					System.out.println("INFORMACIÓN DE UN DEPARTAMENTO");
					System.out.println("Selecciona el gerente del departamento que quieres saber");
					System.out.println(em.mostrarInfoGerentes());
					break;
					
				case "5":
					sc = new Scanner(System.in);
					System.out.println("ELIMINAR UN TRABAJADOR");
					System.out.println("LISTA DE TRABAJADORES: ");
					System.out.println(em.mostrarInfoTrabajadores());
					System.out.println("Selecciona el dni del trabajador que quieras eliminar");
					dni = sc.nextLine().toUpperCase();
					em.eliminarTrabajador(dni);
					System.out.println("Trabajador con dni: " + dni + " eliminado");
					break;
					
				case "6":
					sc = new Scanner(System.in);
					System.out.println("AGENDA DEL DIRECTOR:");
					System.out.println("Selecciona que acción realizar");
					System.out.println("1. Reunion ");
					System.out.println("2. Fuera de la oficina");
					System.out.println("3. Convocar a toda la empresa");
					String accionDirector = sc.nextLine();
					
					switch(accionDirector) {
					
					case "1":
						break;
						
					case "2":
						sc = new Scanner(System.in);
						System.out.println("¿El director esta fuera o dentro de la oficina?");
						System.out.println("1. Fuera");
						System.out.println("2. Dentro");
						String fueraodentro = sc.nextLine();
						switch(fueraodentro) {
						
						case "1":
							d.setFueraOficina(true);
							System.out.println("El director está fuera de la oficina");
							break;
							
						case "2":
							d.setFueraOficina(false);
							System.out.println("El director está dentro de la oficina");
							break;
						}
						
						break;
						
					case "3":
						break;
						
					}
					
					
					break;
					
				case "7":
					System.out.println("Saliendo...");
					break;
				
				default:
					System.out.println("Error en la seleccion de opcion");
					break;
				}
				
			}while(!op.equals(7));
		
	
	}
	
	private static boolean validarCif(String cif)throws FormatoCifException{
		if(!cif.matches("[A-Z]{1}[0-9]{10}")) {
			throw new FormatoCifException();
		}
		return cif.matches("[A-Z]{1}[0-9]{10}");
    }
	
	private static boolean validarDni(String dni)throws FormatoDniException{
		if(!dni.matches("[0-9]{8}[A-Z]{1}")) {
			throw new FormatoDniException();
		}
		return dni.matches("[0-9]{8}[A-Z]{1}");
    }

	private static boolean validarNumeroSS(String numeroSS)throws FormatoNumeroSSException{
		if(!numeroSS.matches("[0-9]{10}")) {
			throw new FormatoNumeroSSException();
		}
		return numeroSS.matches("[0-9]{10}");
    }

}
