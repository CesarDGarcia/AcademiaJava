package com.InmutabilidadEjercicio;

import java.util.Objects;

public final class Personaje {
	private final StringBuilder nombre;
	private final int nivel;
	private final int inteligencia;
	private final int magia;
	private final int fuerza;
	
	
	
	public Personaje(StringBuilder nombre, int nivel, int inteligencia, int magia, int fuerza) {
		this.nombre = new StringBuilder(nombre);
		this.nivel = nivel;
		this.inteligencia = inteligencia;
		this.magia = magia;
		this.fuerza = fuerza;
	}



	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", inteligencia=" + inteligencia + ", magia="
				+ magia + ", fuerza=" + fuerza + "]";
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return fuerza == other.fuerza && inteligencia == other.inteligencia && magia == other.magia
				&& nivel == other.nivel && Objects.equals(nombre, other.nombre);
	}



	public StringBuilder getNombre() {
		return new StringBuilder(nombre);
	}



	public int getNivel() {
		return nivel;
	}



	public int getInteligencia() {
		return inteligencia;
	}



	public int getMagia() {
		return magia;
	}



	public int getFuerza() {
		return fuerza;
	}
	
	
	
	
}