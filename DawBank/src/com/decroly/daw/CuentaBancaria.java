package com.decroly.daw;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.Scanner;
public class CuentaBancaria {

		private String iban;
		private String titular;
		private double saldo;
		private Movimiento[] movimientos;
		private int contador;
		
		//constructor
		
		public CuentaBancaria(String iban, String titular) {
			this.iban = iban;
			this.titular = titular;
			this.saldo = 0;
			this.movimientos = new Movimiento[100];
			this.contador = 0;
		}
		
		//constructor vacio
		public CuentaBancaria() {

		}
		
		//getters y setters
		public String getIban() {
			return this.iban;
		}

		public String getTitular() {
			return this.titular;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public Movimiento [] getMovimientos() {
			return this.movimientos;
		}
		
		public String mostrarInfoCuenta() {
			String infocuenta = String.format("Datos de la cuenta:\nIban: %s\nTitular: %s\nSaldo: %s", this.iban, this.titular, this.saldo);
			return infocuenta;
		}
		
		 public void registrarMovimiento(String tipo, double cantidad){
		 
			 if (contador >= 100) {
		            System.out.println("No se pueden realizar más movimientos.");
		        } else {
		            // Crear un nuevo movimiento y agregarlo al arreglo de movimientos
		        	movimientos[contador] = new Movimiento(tipo, cantidad);
		            contador++;
		            }
		     }
		 
		public void ingresar(double cantidad) {
			String tipo ="ingreso";
			
			System.out.println("Tipo de movimiento: Ingreso");
			this.saldo = this.saldo + cantidad;	
			registrarMovimiento("Ingreso", cantidad);
				
		}
		
		public void retirar(double cantidad) {
			String tipo ="retirada";
			if (cantidad <= 0) {
	            System.out.println("La cantidad a retirar debe ser mayor que cero.");
	        } 
			else if (cantidad > this.saldo) {
	            System.out.println("No tienes suficiente saldo para realizar esta retirada.");
	        } 
	        else {
	        	System.out.println("Tipo de movimiento: Retirada");
	        	this.saldo = this.saldo - cantidad;		
	        	registrarMovimiento("Retirada", cantidad);
	        }
			
		}
		
		

		    public void mostrarMovimiento(){
		        if(contador==0){
		            System.out.println("No existen movimientos.");
		        }
		        for (int i = 0; i < contador; i++) {
		            movimientos[i].mostrarInfoMovimiento();
		        }
		    }
	

		
}
