package com.polimorfismoEjercicio;

abstract class Personaje {
	String	nombre;
	int nivel;
	int inteligencia;
	int magia;
	int fuerza;
	
	public Personaje(String nombre, int nivel, int inteligencia, int magia, int fuerza) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.inteligencia = inteligencia;
		this.magia = magia;
		this.fuerza =fuerza;
		
	}
	
	public abstract void ataque();
	
}
