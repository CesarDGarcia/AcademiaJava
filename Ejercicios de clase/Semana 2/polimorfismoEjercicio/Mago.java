package com.polimorfismoEjercicio;

public class Mago extends Personaje {

	

	public Mago(String nombre, int nivel, int inteligencia, int magia, int fuerza) {
		super(nombre, nivel, inteligencia, magia, fuerza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataque() {
		System.out.println("Lanza un hechizo piro+ : " + (magia*nivel));
	}
}
