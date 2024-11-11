package com.decroly.daw;
import java.time.LocalDateTime;

public class Movimiento {

		
		
		//atributos
		private static int contador = 0;
		private int id;
		private String fecha;
		private String tipo;
		private int cantidad;
		
		//constructores
		public Movimiento(int id, String fecha, String tipo, int cantidad){
			this.id = this.contador;
			this.contador++;
			this.fecha = fecha = LocalDateTime.now().toString();
			this.tipo = tipo;
			this.cantidad = 0;
		}
		
		
		//obtener datos
		public int getId() {
			return this.id;
		}
			
		public String getFecha(){
			return this.fecha;
		}
		
		public String getTipo(){
			return this.tipo;
		}
		
		public int getCantidad() {
			return cantidad;
			
		}
		
		public String infoMovimiento() {
			String info = String.format("Tipo de movimiento: %s, Cantidad: %s, Fecha: %s, ID: %s", 
					this.tipo, this.cantidad, this.fecha, this.id);
			return info;
		}
		
	}

