package dawbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;

	
	
	public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	

	public String getNombre() {
		return nombre;
	}



	public String getDNI() {
		return dni;
	}



	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	
	
	
}
