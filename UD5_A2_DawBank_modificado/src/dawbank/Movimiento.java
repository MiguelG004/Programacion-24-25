package dawbank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

	
	//atributos
	private static int contador = 0;
	private int id;
	private String fecha;
	private String tipo;
	private double cantidad;
	
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

	
	//constructores
	public Movimiento(String tipo, double cantidad){
		this.id = this.contador;
		this.contador++;
		this.fecha = fecha = LocalDateTime.now().format(formatter);
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	
	//obtener datos
	public int getId() {
		contador++;
		return this.id;
	}
		
	public String getFecha(){
		return this.fecha;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public double getCantidad() {
		return cantidad;
		
	}
	
	
	
	 @Override
	public String toString() {
		return "[id=" + id + ", fecha=" + fecha + ", tipo=" + tipo + ", cantidad=" + cantidad
				+ "]";
	}


	
}
