package decroly;

import java.time.LocalDate;

public class Trabajador extends Persona{

	private String numeroSS;
	private String emailEmpresa;
	private double salario;
	private Enumerado departamento;
	private boolean estaOficina;
	
	
	
	public Trabajador(String nombre, LocalDate fechaNacimiento, String dni, String direccion,
			String numeroSS, String emailEmpresa, double salario, Enumerado departamento, boolean estaOficina) {
		super(nombre, fechaNacimiento, dni, direccion);
		this.numeroSS = numeroSS;
		this.emailEmpresa = emailEmpresa;
		this.salario = salario;
		this.departamento = departamento;
		this.estaOficina = estaOficina;
	}



	public String getNumeroSS() {
		return numeroSS;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public double getSalario() {
		return salario;
	}

	public Enumerado getDepartamento() {
		return departamento;
	}

	public boolean isEstaOficina() {
		return estaOficina;
	}

	@Override
	public String toString() {
		return "Persona " + super.toString() + ", numeroSS=" + numeroSS + ", emailEmpresa=" + emailEmpresa + ", salario=" + salario
				+ ", departamento=" + departamento + ", estaOficina=" + estaOficina + "]";
	}
	
	
	
	
}
