package decroly;
import java.time.*;

public class Persona {

	private String dni;
	private String nombre;
	private String direccion;
	private LocalDate fechaNacimiento;

	
	 public Persona(String dni, String nombre, String direccion, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}
	 

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Override
	public String toString() {
		return ", dni = " + dni + ", nombre = " + nombre + ", direccion = " + direccion + ", fechaNacimiento = "
				+ fechaNacimiento + "";
	}
	
	public boolean esMayorDeEdad() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMinimaEdad = fechaNacimiento.plusYears(18);  // Fecha de nacimiento + 18 años

        // Verificamos si la fecha de nacimiento + 18 años es antes o igual a la fecha actual
        return !fechaMinimaEdad.isAfter(fechaActual);
 }
	
}