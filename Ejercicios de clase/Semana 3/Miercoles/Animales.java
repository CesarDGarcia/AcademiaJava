package com.Ejercicio.miercoles;

import java.util.Objects;

public class Animales {
	//Defino los atributos con los que distinguire a mis animales
	String tipo;
	String nombre;
	
	//Defino el constructor
	public Animales(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	//Sobreescribo el metodo hashCode
	@Override
	public int hashCode() {
		return Objects.hash( tipo); //por default me lo pondria con nombre pero este se puede quitar
									//aqui entra el equals para saber cuales son los repetidos 
	}
	
	//Sobreescribe el metodo equals me dira junto con el hashCode cuales objetos son iguales para comparar y quitar repetidos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animales other = (Animales) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}
	
	//Metodo toString para mandar a imprimir el arreglo sin esta solo me dara una referencia en memoria
	@Override
	public String toString() {
		return "Animales [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	

}
