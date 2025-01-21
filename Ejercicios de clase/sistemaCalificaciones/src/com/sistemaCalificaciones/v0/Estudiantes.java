package com.sistemaCalificaciones.v0;

import com.Calificaciones.v0.Calificaciones;



public class Estudiantes {
	// Estos van a ser los atributos del Estudiantes
    public String nombre;
    public Double calificacion; 

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificación: " + calificacion );
    }

    public static void main(String[] args) {
        
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.nombre = "Ana";

        Estudiantes estudiante2 = new Estudiantes();
        estudiante2.nombre = "Carlos";

        Estudiantes estudiante3 = new Estudiantes();
        estudiante3.nombre = "Lucía"; // Se definen los estudiantes y sus nombres

        Calificaciones.asignarCalificacion(estudiante1, 85);       
        Calificaciones.asignarCalificacion(estudiante2, 90.5);    
        Calificaciones.asignarCalificacion(estudiante3, 78); //Llama al metodo que asigna calificaciones     

        estudiante1.mostrarInfo(); //Nombre: Ana Calificación: 85.0
        System.out.println("----------------------");
        estudiante2.mostrarInfo();//Nombre: Carlos Calificación: 90.5 
        System.out.println("----------------------");
        estudiante3.mostrarInfo();// Nombre: Lucía Calificación: 78.0
    }
}