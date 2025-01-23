package com.polimorfismoEjercicio;

public class Peleador extends Personaje {

	public Peleador(String nombre, int nivel, int inteligencia, int magia, int fuerza) {
		super(nombre, nivel, inteligencia, magia, fuerza);
		
	}

	@Override
	public void ataque() {
		System.out.println("Da un golpe con puño haciendo un daño de : " + (fuerza*nivel));
		
	}
	
	

}
