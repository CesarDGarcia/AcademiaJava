package com.polimorfismoEjercicio;

public class Ladron extends Personaje {

	public Ladron(String nombre, int nivel, int inteligencia, int magia, int fuerza) {
		super(nombre, nivel, inteligencia, magia, fuerza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataque() {
		System.out.println("Lanza una daga : " + (inteligencia*nivel));
		
	}
	
	
	

}
