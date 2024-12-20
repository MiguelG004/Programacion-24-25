package com.decroly.daw;

public class Main {

	public static void main(String[] args) {
		
		Astros[] astro = null;
		
		astro[0] = new Planetas(5, 5, 5, 5, 5, 5, 5, 5, true);
		//masa, diametro, pRotacion, pTraslacion, temperatura, distancia, distSol, orbitaSol, tieneSatelites
		for (int i = 0; i < astro.length; i++) {
			if(astro[i] != null){
				if (astro[i] instanceof Planetas){
					Planetas p1 = (Planetas)astro[i];
					System.out.println(p1);
					System.out.println(p1.getClass().getName());
    
				}else if(astro[i] instanceof Satelites){
					Satelites p1 = (Satelites)astro[i];
					System.out.println(p1);
					System.out.println(p1.getClass().getName());
				}
				else{
					System.out.println(astro[i]);
				}
			}
		}
		
		
		
	}	
}