package com.decroly.daw;
import java.util.Map;
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
		if (taller.containsKey(matricula)) {
            taller.remove(matricula);
            return true;
        }
        return false;
	}
	
	public void visualizaMatricula() {
		if (taller.isEmpty()) {
        } else {
            for (String matricula : taller.keySet()) {
                System.out.println("Matrícula: " + matricula);
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
            for (Map.Entry<String, Coche> entry : taller.entrySet()) {
                System.out.println("TALLER ==> Matrícula: " + entry.getKey() + ", Coche: " + entry.getValue());
            }
        }
		
	}
	

	

}


	