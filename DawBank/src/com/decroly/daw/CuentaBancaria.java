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
		
		 //Metodo para realizar interpolacion en los strings en java
		public String mostrarInfoCuenta() {
			String infocuenta = String.format("Datos de la cuenta:\nIban: %s\nTitular: %s\nSaldo: %s", this.iban, this.titular, this.saldo);
			return infocuenta;
		}
		
		//metodo para utilizar la funcion de ingresar
		public void ingresar(double cantidad) {
			String tipo ="ingreso";
			this.saldo = this.saldo + cantidad;	//saldo nuevo= saldo actual + cantidad ingresada
			registrarMovimiento("Ingreso", cantidad); //registra el movimiento para mostrarlo despues
				
		}
		
		//metodo para utilizar la funcion de retirar
		public void retirar(double cantidad) {
			String tipo ="retirada";
			
	        this.saldo = this.saldo - cantidad; //Saldo nuevo = saldo actual - cantidad a retirar
	        registrarMovimiento("Retirada", cantidad);  //registra el movimiento para mostrarlo despues
	       
		}
		
		 public void registrarMovimiento(String tipo, double cantidad){
		 
			 if (contador >= 100) {
				 System.out.println("***********");
		            System.out.println("Se ha llegado al limite de los movimientos");
		        } else {
		        	movimientos[contador] = new Movimiento(tipo,cantidad); // Crea un nuevo movimiento y lo agrega al array de movimientos
		            contador++;
		            }
		     }
		 
		 public void mostrarMovimiento(){
		        if(contador==0){
		            System.out.println("No se han realizado movimientos.");
		        }
		        for (int i = 0; i < contador; i++) {

		            System.out.println(movimientos[i].mostrarInfoMovimiento()); //imprime los movimiento con el metodo de la clase movimiento: mostrarInfoMovimiento
		        }
		    }
		 
		
		
		
}
