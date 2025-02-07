package com.ejercicio.miercoles;

public class Libros {
	

	String 	nombre;
	String autor;
	public Libros(String nombre, String autor) {
		this.nombre = nombre;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libros [nombre=" + nombre + ", autor=" + autor + "]";
	}
	

	

}