package com.decroly.daw;

public class Planetas extends Astros {

	private double distSol;
	private double orbitaSol;
	private boolean tieneSatelites;
	
	public Planetas(double masa, double diametro, int pRotacion, int pTraslacion, double temperatura, int distancia, 
			double distSol, double orbitaSol, boolean tieneSatelites) {
		this.masa = masa;
		this.diametro = diametro;
		this.pRotacion = pRotacion;
		this.pTraslacion = pTraslacion;
		this.temperatura = temperatura;
		this.distancia = distancia;
		this.distSol = distSol;
		this.orbitaSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
	}

	public double getDistSol() {
		return distSol;
	}

	public double getOrbitaSol() {
		return orbitaSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}
	
	
	@Override
	public String toString() {
		return "Astro = Planeta --> masa = " + masa + ", diametro = " + diametro + ", Periodo de rotacion = " + pRotacion + 
				"x, Periodo de traslacion = " + pTraslacion + ", temperatura = " + temperatura + "C, Distancia = " + distancia + 
				", Distancia al sol" + distSol + ", orbita del sol = " + orbitaSol + ", ¿Tiene satelites? = " + tieneSatelites;
    }
	
	
	
}
