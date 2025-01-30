package com.Ejercicio.miercoles;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		//Defino mis animales por nombre y tipo
		Animales animal1 = new Animales("Perro","Mamifero");
		Animales animal2 = new Animales("Aguila","Ave");
		Animales animal3 = new Animales("Cobra","Reptil");
		Animales animal4 = new Animales("Rana","Anfibio");
		Animales animal5 = new Animales("Tiburon","Pez");
		Animales animal6 = new Animales("Mariposa","Insecto");
		Animales animal7 = new Animales("Elefante","Mamifero");
		Animales animal8 = new Animales("Pinguino","Ave");
		Animales animal9 = new Animales("Tortuga","Reptil");
		Animales animal10 = new Animales("Salmon","Pez");
		Animales animal11 = new Animales("Salamandra","Anfibio");
		Animales animal12 = new Animales("Abeja","Insecto");
		Animales animal13 = new Animales("Perro","Mamifero");
		
		//Los meto en una List
		List<Animales> lista = List.of(animal1, animal2,animal3,animal4,animal5,animal6,animal7,animal8,animal9,animal10,animal11,animal12, animal13);
		
		//Se la paso a un Set de collections y Defino un HashSet este le podemos pasar una List en el parametro
		Set<Animales> setLista = new HashSet<>(lista);
		
		System.out.println(animal1.equals(animal13));
		// el HashCode me sirve en este caso para identificar mis objetos y que no se repitan
	
		
		//For each para imprimir la lista o el set mas bien
		for(Animales x:setLista)
			System.out.println(x);

	}

}
