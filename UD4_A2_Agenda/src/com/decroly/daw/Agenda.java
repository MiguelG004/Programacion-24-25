package com.decroly.daw;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Agenda {

	private LinkedList<Contacto> agenda = new LinkedList<>();
	private int contador;
	
	public Agenda() {
		this.agenda = agenda;
		this.contador = 0;
	}
	
	public int getContador() {
		return this.contador;
	}
	
	public boolean añadeContacto(String nombre, String telefono, String correo){
		if(telefono != null) {
			agenda.add(new Contacto(nombre, telefono, correo));
			this.contador++;
			return true;
		}
		return false;	
	}
	
	public boolean comprobarContacto(String nombre) {
		boolean existe = false;
        for(Contacto contacto: agenda){
            if(contacto.getNombre().equals(nombre)){
                existe = true;
                return existe;
            }
        }
        return existe;
		
	}
	
	public Contacto buscaContacto(String nombre) {
		Contacto c = null;
        for(Contacto contacto: agenda) {
            if(contacto.getNombre().equals(nombre)) {
                c = contacto;
            }
        }
        return c;
	}
	
	public boolean eliminaContacto(String nombre) {
		
		return false;
	}
	
	public boolean visualizaAgenda() {
		
		return false;
	}
	
	
}
