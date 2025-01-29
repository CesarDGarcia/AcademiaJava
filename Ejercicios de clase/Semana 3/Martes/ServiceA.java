package com.Eercicio.martes;

public class ServiceA {
	private TaskService taskService;
	

	
	public ServiceA(TaskService taskService) {
		this.taskService = taskService;
		
	}
	
	
	void execute() {
		taskService.hazUnaTarea();
		taskService.hazOtraTarea();
		
	}

}
