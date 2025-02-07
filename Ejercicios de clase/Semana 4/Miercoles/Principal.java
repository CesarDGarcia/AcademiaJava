package com.ejercicio.miercoles;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;



public class Principal {

	public static void main(String[] args) {
		
		System.out.println("***** Primer Lambda*****");
		BiPredicate<Integer,Integer> bp = (x,y) -> x % y == 0;
		
		 
		 System.out.println(bp.test(15, 5));
		 System.out.println(bp.test(24, 7));
		 
		 
		 System.out.println("***** Segunda Lambda*****");
		 Function<Integer,Integer> cuadrado = num -> num * num;

		 //System.out.println(cuadrado); Metodo si no le pasamos un parametro no mandara algo
		 System.out.println(cuadrado.apply(6));
		 System.out.println(cuadrado.apply(99));
		 
		 System.out.println("***** Tercera Lambda*****");
		 Supplier<Double> numRand = () -> Math.random(); //Este metodo me da un numero aleatorio menor que 1
		 
		 
		 System.out.println("El numero aleatorio es: "+ numRand.get());
		 
		 System.out.println("***** Cuarta Lambda*****");
		 BiFunction<Double,Double,Double> potencias = (z,w) -> Math.pow(z,w)+Math.pow(w,z);
		 
		 
		 
		 System.out.println(potencias.apply(5.0, 6.0));
		 
		 System.out.println("***** Quinta Lambda*****");
		 Supplier<Integer> ranCien = ()	-> (int)( Math.random()*100);
		 
		 
		 System.out.println("Primer Numero: "+ranCien.get());
		 System.out.println("Segundo Numero: "+ranCien.get());
		 System.out.println("Tercer Numero "+ranCien.get());
		 
		 System.out.println("*****Lambda con collection*****");
		 
		 Map<Integer, Libros> mapBiblioteca = new HashMap<>();
		 
		 mapBiblioteca.put(1,new Libros("Cien años de soledad", " Gabriel García Márquez" ));
		 mapBiblioteca.put(2,new Libros("Orgullo y prejuicio", " Jane Austen" ));
		 mapBiblioteca.put(3,new Libros("El gran Gatsby", " F. Scott Fitzgerald" ));
		 mapBiblioteca.put(4,new Libros("El Diablo de los numeros", " Hans Magnus Enzensberger" ));
		 mapBiblioteca.put(5,new Libros("Ella y su gato", " Makoto Shinkai y Naruki Nagakawa" ));
		 mapBiblioteca.put(6,new Libros("Uzumaki", " Junji Ito" ));
		 mapBiblioteca.put(7,new Libros("Frankenstein", " Mary Shelly" ));
				 
		 mapBiblioteca.forEach((k,v) -> System.out.println("Clave: "+k+ ", Libro: "+v.nombre.concat(" - "+v.autor)));
		 
		
	}

}
