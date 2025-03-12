package decroly;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.time.*;

public class GerenteDep extends Trabajador{

	private int numeroTrabajadores;
	private String numeroTlf;
	private LinkedList <Trabajador> listaTrabajadoresDep = new LinkedList<>();
	
	private static int contador;
	


	public GerenteDep(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS,
			String emailEmpresa, double salario, Enumerado departamento,boolean estaOficina,  String numeroTlf) {
		super(nombre, fechaNacimiento, dni, direccion, numeroSS, emailEmpresa, salario, departamento, estaOficina);
		this.numeroTlf = numeroTlf;
		this.numeroTrabajadores = contador;
		contador++;
	}



	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public String getNumeroTlf() {
		return numeroTlf;
	}

	public LinkedList<Trabajador> getListaTrabajadoresDep() {
		return listaTrabajadoresDep;
	}

	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Gerente " + super.toString() + ", numero de Trabajadores=" + numeroTrabajadores + ", numero de Tlf=" + numeroTlf + "]";
	}
	
	//metodos
	
	
	public LocalDateTime convocarReunionDepartamento(LocalDateTime fReunion){
		
		return fReunion;
	}
	
	
	
	public String mostrarInfoDepartamento(){
		String infoGer = "";
		for (Trabajador trab : listaTrabajadoresDep) {
			infoGer = infoGer + trab;
		}
		return infoGer;
		
	}
	
}
