package com.Ejercicio.Jueves;

public class Limpieza {
	
	String nombreEmpleado;

	public Limpieza(String nombreEmpleado) {
		super();
		this.nombreEmpleado = nombreEmpleado;
	}

	@Override
	public String toString() {
		return "Limpieza [nombreEmpleado=" + nombreEmpleado + "]";
	}
	
	public void aplicarServicio() {
        System.out.println("El empleado de limpieza " + nombreEmpleado + " realizó el servicio de limpieza.");
    }
}