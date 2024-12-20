package com.decroly.daw;

public class Satelites extends Astros {

	private double distPlaneta;
	private double orbPlanetaria;
	private String planetaPerteneciente;
	
	public Satelites(double distPlaneta, double orbPlanetaria, String planetaPerteneciente) {
		this.distPlaneta = distPlaneta;
		this.orbPlanetaria = orbPlanetaria;
		this.planetaPerteneciente = planetaPerteneciente;
	}

	public double getDistPlaneta() {
		return distPlaneta;
	}

	public double getOrbPlanetaria() {
		return orbPlanetaria;
	}

	public String getPlanetaPerteneciente() {
		return planetaPerteneciente;
	}
	
	
	@Override
	public String toString() {
		return "Astro = Satelite --> masa = " + masa + ", diametro = " + diametro + ", Periodo de rotacion = " + pRotacion + 
				"x, Periodo de traslacion = " + pTraslacion + ", temperatura = " + temperatura + "C, Distancia = " + distancia + 
				", distancia al planeta = " + distPlaneta + ", orbita planetaria = " + orbPlanetaria + 
				", planeta perteneciente = " + planetaPerteneciente;
    }
	
}
