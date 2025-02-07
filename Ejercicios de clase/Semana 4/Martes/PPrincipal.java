package com.ejercicio.martes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PPrincipal {

	    public static void main(String[] args) {
	        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Definir un Predicate para filtrar números pares
	        Predicate<Integer> esPar = num -> num % 2 == 0;

	        // Filtrar números pares e impares usando el Predicate
	        List<Integer> numerosPares = filtrarNumeros(numeros, esPar);
	        List<Integer> numerosImpares = filtrarNumeros(numeros, esPar.negate());

	        // Mostrar resultados
	        System.out.println("Números pares: " + numerosPares);
	        System.out.println("Números impares: " + numerosImpares);
	    }

	    // Método que usa Predicate para filtrar números
	    public static List<Integer> filtrarNumeros(List<Integer> lista, Predicate<Integer> criterio) {
	        List<Integer> resultado = new ArrayList<>();
	        for (Integer num : lista) {
	            if (criterio.test(num)) {
	                resultado.add(num);
	            }
	        }
	        return resultado;
	    }
	}



