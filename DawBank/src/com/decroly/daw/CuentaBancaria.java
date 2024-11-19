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
		
		public CuentaBancaria(String iban, String titular, double saldo) {
			this.iban = iban;
			this.titular = titular;
			this.saldo = 0;
			this.movimientos = new Movimiento[100];
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
		
		public String infoCuenta() {
			String infocuenta = String.format
		}
		
		
	

		
}
