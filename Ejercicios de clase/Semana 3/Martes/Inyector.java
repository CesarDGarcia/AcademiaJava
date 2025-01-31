package com.Eercicio.martes;

public class Inyector {
	
	// Método que crea y "inyecta" las dependencias
    public static ServiceA createServiceA() {
        TaskService serviceB = new ServiceB(); // Creamos la implementación de TaskService
        return new ServiceA(serviceB); // Inyectamos la dependencia en ServiceA
    }

}
