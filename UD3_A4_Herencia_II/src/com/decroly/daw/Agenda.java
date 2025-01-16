package com.decroly.daw;

public class Agenda {

	private Contacto[] contactos;
	private int numContacto;
	
	public Agenda() {
		this.contactos = new Contacto[10];
		this.numContacto = 0;
	}
	
	boolean añadirContacto(Contacto c) {
		boolean añadir;
		if (existeContacto(c.getNombre())) {
			añadir = false;
            return añadir;  // No se puede añadir si ya existe
        }
		else {
			contactos[numContacto] = c;
			numContacto++;
			añadir = true;
			return añadir;
		}
	}

	
	boolean eliminarContacto(String nombre) {
		boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equals(nombre)) {
                contactos[i] = null; 
                encontrado = true; 
                return encontrado;
            }
        }
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
            encontrado = true;
            return encontrado;
        } else {
            System.out.println("No se ha eliminado el contacto");
            return false;

        }
	}
	
	boolean existeContacto(String nombre) {
		boolean existe = false;
		for (int i = 0; i < contactos.length; i++) {
            
            if (contactos[i] != null && nombre.equals(contactos[i].getNombre())) {
                existe = true;
            	return existe;
            }
        }
		return existe;
	}

	void listarContactos() {
		if (numContacto == 0) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }
		else {
			for(int i = 0; i <= contactos.length - 1; i++) {
				if(contactos[i] != null) {
					System.out.print((i+1) + " ");
					System.out.println(contactos[i]);
				}
			}
		}
	}
	
	int buscaContacto(String nombre) {
		for (int i = 0; i < numContacto; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
	}
	
	
}
