package decroly;

import java.time.LocalDate;

public class Director extends Trabajador{

	private String numeroTlfDirector;
	private boolean estaReunido;
	private boolean fueraOficina;
	
	
	
	public Director(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS,
			String emailEmpresa, double salario, Enumerado departamento, boolean estaOficina,
			String numeroTlfDirector) {
		super(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, departamento, estaOficina);
		this.numeroTlfDirector = numeroTlfDirector;
		this.estaReunido = estaReunido;
		this.fueraOficina = fueraOficina;
	}

	
	public String getNumeroTlfDirector() {
		return numeroTlfDirector;
	}
	public boolean isEstaReunido() {
		return estaReunido;
	}
	public boolean isFueraOficina() {
		return fueraOficina;
	}

	

	public void setFueraOficina(boolean fueraOficina) {
		this.fueraOficina = fueraOficina;
	}


	@Override
	public String toString() {
		return "DIRECTOR " + super.toString() + ", numero Tlf Director=" + numeroTlfDirector + ", esta Reunido = " + estaReunido + ", fuera Oficina = "
				+ fueraOficina + "]";
	}
	
	
	
	
}
