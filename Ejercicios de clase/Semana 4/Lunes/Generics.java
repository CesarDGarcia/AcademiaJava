package com.ejercicio.lunes;



public class Generics {

	  public static void main(String[] args) {
	        // Crear un inventario específico para Papeleria
	        Inventario<Papeleria> inventarioPapeleria = new Inventario<>();

	        // Agregar productos al inventario
	        inventarioPapeleria.agregarProducto(new Papeleria("Cuaderno", 5.99));
	        inventarioPapeleria.agregarProducto(new Papeleria("Lápiz", 0.99));
	        inventarioPapeleria.agregarProducto(new Papeleria("Bolígrafo", 1.49));

	        // Mostrar el inventario
	        System.out.println("📋 Inventario de Papelería:");
	        inventarioPapeleria.mostrarInventario();
	    }
	
	

}


