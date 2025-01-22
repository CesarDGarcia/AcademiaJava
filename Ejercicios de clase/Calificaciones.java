package com.Calificaciones.v0;
import com.sistemaCalificaciones.v0.Estudiantes;

public class Calificaciones {
	//Un metodo estatico para asignar calificaciones 
    public static void asignarCalificacion(Estudiantes estudiante, Double calificacion) {
        estudiante.calificacion = calificacion;
    }
    //El metodo de sobrecarga (Overloading)
    public static void asignarCalificacion(Estudiantes estudiante, int calificacion) {
        estudiante.calificacion = (double) calificacion;
    }
}