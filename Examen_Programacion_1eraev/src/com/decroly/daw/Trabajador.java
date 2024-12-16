package com.decroly.daw;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Trabajador {
	
	private String nombre;
	private String fechaNacimineto;
	private String dni;
	private String direccion;
	private int numeroSS;
	private static int contador = 1000000000; //establezo el primer numero de ss
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	//constructor para persona
	public Trabajador(String nombre, String dni, String direccion) {
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto = LocalDateTime.now().format(formatter).toString();
		this.dni = dni;
		this.direccion = direccion;
	}

	
	//constructor para trabajador
	public Trabajador(String nombre, String dni, String direccion, int numeroSS) {
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto = LocalDateTime.now().format(formatter).toString();
		this.dni = dni;
		this.direccion = direccion;
		this.numeroSS = this.contador;
		this.contador++; //con esto, hago que el cada persona tenga un numero distinto ss, ya que se van sumando y de esta forma el siguiente tendra un digito mayor al anterior
	}

	//getters

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimineto() {
		return fechaNacimineto;
	}

	public String getDni() {
		return dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getNumeroSS() {
		return numeroSS;
	}
	
	
	//metodo para ver la informacion del trabajador
	public String mostrarInfoTrabajador() {
		String infoT = String.format("Nombre: %s, Fecha de Nacimiento: %s, DNI: %s, Direccion: %s, Numero de SS: %s",
				this.nombre, this.fechaNacimineto, this.dni, this.direccion, this.numeroSS);
		return infoT;
	}
	
	//metodo para ver la informacion de las personas
	public String mostrarInfoPersonas() {
		String infoP = String.format("Nombre: %s, Fecha de Nacimiento: %s, DNI: %s, Direccion: %s",
				this.nombre, this.fechaNacimineto, this.dni, this.direccion);
		return infoP;
	}
	
	
	
	
}
