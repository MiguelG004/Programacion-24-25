package com.decroly.daw;

public abstract class Astros {

	protected double masa;
	protected double diametro;
	protected int pRotacion;
	protected int pTraslacion;
	protected double temperatura;
	protected int distancia;
	
	
	
	public double getMasa() {
		return masa;
	}

	public double getDiametro() {
		return diametro;
	}

	public int getpRotacion() {
		return pRotacion;
	}

	public int getpTraslacion() {
		return pTraslacion;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public int getDistancia() {
		return distancia;
	}


	@Override
		public String toString() {
			return "Astro --> masa = " + masa + ", diametro = " + diametro + ", Periodo de rotacion = " + pRotacion + 
					"x, Periodo de traslacion = " + pTraslacion + ", temperatura = " + temperatura + "C, Distancia = " + distancia;
	    }
}
