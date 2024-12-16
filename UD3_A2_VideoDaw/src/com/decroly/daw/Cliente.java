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

	private int palquiladas;
    private int ptotales;
    private static int contador = 0;
	
	public Cliente(String dni, String nombre, String direccion){
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
	
	
	public String mostrarPeliculas(){ 
        String peliculasAlquiladas = "";
        for(int i = 0; i < ptotales; i++){
           peliculasAlquiladas = peliculasAlquiladas + peliculas[i].mostrarInfoPelicula();
           }
       return peliculasAlquiladas;
    }


    public boolean addPelicula(Pelicula p){
        boolean isAdd = false;
        if (p != null){
            this.peliculas[ptotales] = p;
            palquiladas++;
            ptotales++;
        }
        return isAdd;
    }

    public boolean eliminarPelicula(Pelicula p){
        boolean isEliminated = false;
        if (p != null){
            palquiladas--;
        }
        return isEliminated;
    }


}
