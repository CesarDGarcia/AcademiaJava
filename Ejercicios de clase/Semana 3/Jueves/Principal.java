package com.Ejercicio.Jueves;



public class Principal {

	public static void main(String[] args) {
		
		Escuela escuela = new Escuela("Facultad de Ciencias");
		
		Estudiante est1 = new Estudiante("Pedro",1);
		Estudiante est2 = new Estudiante("Veronica",2);
		Estudiante est3 = new Estudiante("Pablo",3);
		
		Limpieza empleado = new Limpieza("Jose");
		
		est1.delegarServicio(empleado);
		
		//Estamos mandando a partir de un metodo set los salones que son propiedad de Escuela
		escuela.setSalones(new Salones(1,"A"));
		escuela.setSalones(new Salones(1,"B"));
		escuela.setSalones(new Salones(1,"C"));
		
		System.out.println(escuela.salones);
		
		escuela = null;

		System.out.println(escuela);
	}

}
