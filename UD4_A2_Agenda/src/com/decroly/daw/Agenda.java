package com.decroly.daw;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
	
	public boolean validarTelefono(String telefono) {
		boolean correcto = false;
        Pattern patront = Pattern.compile("[679]\\d{8}");
        Matcher matcher = patront.matcher(telefono);
        if(matcher.matches()){
            correcto = true;
            return correcto;
        }
		return correcto;
	}
	
	public boolean validarCorreo(String correo) {
		boolean correcto = false;
        Pattern patronc = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
        Matcher matcher = patronc.matcher(correo);
        if(matcher.matches()){
            correcto = true;
            return correcto;
        }
        
		return correcto;
	}
	
	public boolean buscaContacto(String nombre) {
		boolean existe = false;
		for(Contacto contacto: agenda) {
            if(contacto.getNombre().equals(nombre)) {
                existe = true;
                return existe;
            }
        }
        return false;
	}
	
	public boolean eliminaContacto(String nombre) {
		boolean existe = false;
		for (Contacto contacto : agenda) {
            if (contacto.getNombre().equals(nombre)) {
                agenda.remove(contacto);
                this.contador--;
                existe = true;
                return existe;
            }
        }
        return existe;
	}
	
	public String visualizaAgenda() {
		String visagenda = "";
        for(Contacto contacto: agenda) {
            visagenda += agenda.toString() + "\n";
        }
        return visagenda;

	}
	
	
}
