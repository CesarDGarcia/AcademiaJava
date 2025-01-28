package com.polimorfismoEjercicio;

public class VideoJuego {
    public static void main(String[] args) {
    	Personaje mago = new Mago("Gandalf", 20, 100, 50, 30);
        Personaje ladron = new Ladron("Robin", 15, 20, 80, 40);
        Personaje peleador = new Peleador("Conan", 25, 10, 30, 120);
        
        peleador.ataque();
        mago.ataque();
        ladron.ataque();
    }
}
