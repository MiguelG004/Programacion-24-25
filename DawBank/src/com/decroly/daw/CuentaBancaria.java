package com.decroly.daw;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.Scanner;
public class CuentaBancaria {

		private String iban;
		private String titular;
		private double saldo;
		private Movimiento[] movimientos;
		
		//constructor
		
		public CuentaBancaria(String iban, String titular) {
			this.iban = iban;
			this.titular = titular;
			this.saldo = 0;
			this.movimientos = new Movimiento[100];
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
		
	
		public void ingresar(double cantidad) {
			String tipo ="ingreso";
			if(tipo == "ingreso") {
				System.out.println("Tipo de movimiento: Ingreso");
				this.saldo = this.saldo + cantidad;		
			}	
		}
		
		public void retirar(double cantidad) {
		
			String tipo ="retirada";
			if(tipo == "retirada") {
				System.out.println("Tipo de movimiento: Retirada");
				this.saldo = this.saldo - cantidad;		
			}	
		}
		
		public void infoMovimiento(String tipo, double cantidad) {
			
			
			
		}
	

		
}
