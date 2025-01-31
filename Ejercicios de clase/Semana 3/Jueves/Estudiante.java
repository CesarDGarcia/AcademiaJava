package com.Ejercicio.Jueves;


public class Estudiante {
	private String nombre;
	private int numCuenta;
	
	Limpieza servicio;
	
	
	
	public Estudiante(String nombre, int numCuenta) {
		super();
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}



	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", numCuenta=" + numCuenta + "]";
	}
	
	
	 public void delegarServicio(Limpieza limpieza) {
	        System.out.println(this.nombre + " ha delegado el servicio de limpieza.");
	        
	        // Ahora usamos el objeto Limpieza para aplicar el servicio
	        limpieza.aplicarServicio();
	    }

	
	

}
