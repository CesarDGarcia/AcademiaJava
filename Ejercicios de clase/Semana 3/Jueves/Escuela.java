package com.Ejercicio.Jueves;

import java.util.*;
public class Escuela {
	
	private String nombre;
	List<Salones> salones = new ArrayList<>();
	List<Estudiante> est;

	public Escuela(String nombre) {
		this.nombre = nombre;
		this.est = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + "]";
	}
	
	void setSalones(Salones salon) {
		salones.add(salon);
		
	}
	
	void setEstudiante(List<Estudiante> est) {
		this.est = est;
	}
	
	
	
}
