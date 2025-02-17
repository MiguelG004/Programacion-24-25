package dawbank;

import java.util.Arrays;
import java.util.LinkedList;

public class CuentaBancaria {


	private String iban;
	private double saldo;
	private Cliente cliente;
	LinkedList<Movimiento> lista = new LinkedList<Movimiento>();
	private int contador;
	
	//constructor
	
	public CuentaBancaria(String iban, Cliente cliente) {
		this.iban = iban;
		this.cliente = cliente;
		this.saldo = 0;
		this.contador = 0;
	}
	
	
	//getters y setters
	public String getIban() {
		return this.iban;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	

	 //Metodo para realizar interpolacion en los strings en java
	@Override
	public String toString() {
		return "CuentaBancaria [iban=" + iban + ", cliente=" + cliente + ", saldo=" + saldo
				+ "]";
	}
	
	//metodo para utilizar la funcion de ingresar
	public void ingresar(double cantidad) throws CuentaException{
		this.saldo = this.saldo + cantidad;	//saldo nuevo= saldo actual + cantidad ingresada
		registrarMovimiento("Ingreso", cantidad); //registra el movimiento para mostrarlo despues
			
	}
	
	
	//metodo para utilizar la funcion de retirar
	public void retirar(double cantidad) throws CuentaException{
        this.saldo = this.saldo - cantidad; //Saldo nuevo = saldo actual - cantidad a retirar
        registrarMovimiento("Retirada", cantidad);  //registra el movimiento para mostrarlo despues
       
	}
	
	 public void registrarMovimiento(String tipo, double cantidad){
		 lista.add(new Movimiento(tipo, cantidad));
	     }
	 
	 
	 public void mostrarMovimiento(){
		 for (int i=0; i<lista.size(); i++) {
		      System.out.println(lista.get(i));
		    }
	    }
	 
	
}
