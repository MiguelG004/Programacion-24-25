package com.decroly.daw;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
	
	
	private String dni;
	private String nombre;
	private int numSocio;
	private String direccion;
	private String fechaNacimiento;
	private String fechaBaja;
	private Pelicula[] peliculas;

    private static int contador = 0;
	
	public Cliente(){
		this.dni = dni;
		this.nombre = nombre;
		this.numSocio = numSocio;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento = LocalDate.now().toString();
		this.fechaBaja = fechaBaja = LocalDate.now().toString();
		this.peliculas = new Pelicula[50];
		this.contador = 0;
	}
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getNumSocio() {
		return this.numSocio;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public String getFechaBaja() {
		return this.fechaBaja;
	}
	public Pelicula[] getPeliculas() {
		return this.peliculas;
	}
	public int getContador() {
		return this.contador;
	}
	
	
	public String mostrarInfoCliente(){
		String infocliente = String.format("DNI: %s, Nombre: %s, Numero de socio: %s, Direccion: %s, Fecha de nacimiento: %s, Fecha de baja: %s", 
				this.dni, this.nombre, this.numSocio, this.direccion, this.fechaNacimiento, this.fechaNacimiento, this.fechaBaja);
		return infocliente;
	}
	
	
	public void registrarPelicula(String titulo, Genero genero) {
		peliculas[contador] = new Pelicula(titulo, genero); // Crea un nuevo movimiento y lo agrega al array de movimientos
        contador++;
	}
	
	public void mostrarPeliculasAlquiladas(){
		if(contador==0){
            System.out.println("No se han realizado movimientos.");
        }
		else {
			for (int i = 0; i < contador; i++) {
				System.out.println(peliculas[i].mostrarInfoPelicula()); //imprime los movimiento con el metodo de la clase movimiento: mostrarInfoMovimiento
				}
			}
		}
	

}
