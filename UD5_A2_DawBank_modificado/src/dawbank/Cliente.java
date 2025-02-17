package dawbank;
import java.time.LocalDate;
public class Cliente extends Persona{

	private String tlf;
	private String email;
	private String direccion;
	
	public Cliente(String nombre, String dni, LocalDate fechaNacimiento, String tlf, String email, String direccion) {
		super(nombre, dni, fechaNacimiento);
		this.tlf = tlf;
		this.email = email;
		this.direccion = direccion;
	}

	public String getTlf() {
		return tlf;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return super.toString() + ", Telefono: " + tlf + ", email:" + email + ", direccion:" + direccion + "]";
	}
	
	
	
	
	
}
