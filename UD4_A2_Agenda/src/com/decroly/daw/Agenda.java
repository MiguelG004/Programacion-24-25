package com.decroly.daw;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Agenda {

	private LinkedList<Agenda> agenda = new LinkedList<>();

	public Agenda() {
		this.agenda = agenda;
	}
	
	public boolean añadeContacto(String telefono){
		if(telefono != null) {
			agenda.add(telefono);
			return true;
		}
		return false;	
	}
	
	public boolean buscaContacto() {
		
		return false;
	}
	
	public boolean eliminaContacto() {
		
		return false;
	}
	
	public boolean visualizaAgenda() {
		
		return false;
	}
	
	
}
