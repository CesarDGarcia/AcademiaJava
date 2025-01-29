package com.Eercicio.martes;

public class Principal {
	public static void main(String[] args) {
        // Usamos el inyector para crear ServiceA con su dependencia ya inyectada
        ServiceA serviceA = Inyector.createServiceA();
        serviceA.execute(); // Ejecutamos la acción

}
}