package com.decroly.daw;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap; 
public class Taller {

	private Map<String, Coche> taller = new HashMap<String, Coche>();

	public Taller() {
		this.taller = new HashMap<>();
	}
	
	
	public boolean añadeElemento(String matricula, Coche coche) {
		if (matricula != null && coche != null && !taller.containsKey(matricula)) {
            taller.put(matricula, coche);
            return true;
        }
        return false;
	}
	
	public boolean eliminarElemento(String matricula) {
		boolean eliminar = false;
		for(String coche : taller.keySet()) {
			if(coche.equals(matricula)) {
				taller.remove(matricula);
				eliminar = true;
			}
		}
		return eliminar;
	}
	
	public boolean validarMatricula(String matricula){
	        boolean existe = false;
	        for(String coche : taller.keySet()){
	            if(coche.equals(matricula)){
	                existe = true;
	            }
	        }
	        return existe;
	    }
	
    public boolean comprobarMatricula(String matricula){
        boolean correcto = false;
        Pattern patron = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher matcher = patron.matcher(matricula);
        if(matcher.matches()){
            correcto = true;
        }
        return correcto;
    }
	
	public void visualizaMatricula() {
		if (taller.isEmpty()) {
        } else {
        	System.out.println("Matrículas --> ");
            for (String matricula : taller.keySet()) {
                System.out.println("              " + matricula);
            }
        }
		
	}
	
	public void visualizaCoche() {
		if (taller.isEmpty()) {
        } else {
            for (Coche coche : taller.values()) {
                System.out.println(coche);
            }
        }
	}
	
	public void visualizaTaller() {
		
		if (taller.isEmpty()) {
        } else {
        	System.out.println("TALLER --> ");
            for (Map.Entry<String, Coche> entry : taller.entrySet()) {
                System.out.println("           Matrícula: " + entry.getKey() + ", Coche: " + entry.getValue());
            }
        }
		
	}
	

	

}


	