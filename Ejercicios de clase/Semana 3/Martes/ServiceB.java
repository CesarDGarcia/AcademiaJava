package com.Eercicio.martes;

public class ServiceB implements TaskService {

	@Override
	public void hazUnaTarea() {
		System.out.println("ServiceB esta haciendo una tarea");
		
	}

	@Override
	public void hazOtraTarea() {
		System.out.println("Haciendo otra tarea");
		
	}

}
