package com.decroly.daw;
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
		
		 //Metodo para realizar interpolacion en los strings en java
		public String mostrarInfoMovimiento() {
			String infomov = String.format("Tipo de movimiento: %s, Cantidad: %s, Fecha: %s, ID: %s", 
					this.tipo, this.cantidad, this.fecha, this.id);
			return infomov;
		}
		
	}

