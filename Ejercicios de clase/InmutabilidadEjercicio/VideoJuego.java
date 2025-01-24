package com.InmutabilidadEjercicio;


public  class VideoJuego {
	
	
    	public static void main(String[] args) {
        	StringBuilder nombre1 = new StringBuilder("Mash");
        	Personaje personaje1 = new Personaje(nombre1,4,6,7,8); //Si tenemos el StringBuilder espesificar que es de ese tipo y no solo poner "Clase" 
        	//StringBuilder clase = new StringBuilder("Peleador");
        	System.out.println(personaje1);
        	
        	nombre1.append("Belmont");
        	System.out.println(personaje1);
        
        }
}