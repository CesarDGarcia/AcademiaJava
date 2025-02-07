package com.ejercicio.lunes;

import java.util.ArrayList;
import java.util.List;

// Clase Papeleria
class Papeleria {
    private String nombre;
    private double precio;

    public Papeleria(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - Precio: $" + precio;
    }
}

// Clase genérica Inventario<T>
class Inventario<T> {
    private List<T> lista = new ArrayList<>();

    public void agregarProducto(T item) {
        lista.add(item);
    }

    public void mostrarInventario() {
        for (T item : lista) {
            System.out.println(item);
        }
    }
}