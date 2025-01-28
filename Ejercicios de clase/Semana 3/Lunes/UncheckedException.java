package com.Ejercicios.lunesUC;

public class UncheckedException {

	    public static void main(String[] args) {
	        int[] numeros = {10, 20, 30, 40, 50};

	        // Intentar acceder a un índice fuera de los límites
	        try {
	            System.out.println("Accediendo al índice 10 del arreglo: " + numeros[10]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Excepción: El índice está fuera del rango del arreglo.");
	        }
	    }
	}

