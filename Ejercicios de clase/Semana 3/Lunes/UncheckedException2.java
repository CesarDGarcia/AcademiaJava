package com.Ejercicios.lunesUC;

import javax.management.RuntimeErrorException;

public class UncheckedException2 extends RuntimeException{

	// Constructor que acepta un mensaje
    public UncheckedException2(String mensaje) {
        super(mensaje); // Se lo pasamos a la clase base RuntimeException
    }

    // Método que lanza la excepción personalizada
    public void metodo() {
        throw new UncheckedException2("Esto es una excepción unchecked con mensaje personalizado");
    }
    public static void main(String[] args) {
        UncheckedException2 exception = new UncheckedException2("Mensaje de prueba");
        
        try {
            exception.metodo();
        } catch (UncheckedException2 e) {
            // Imprime el mensaje personalizado
            System.out.println("Se lanzó una excepción: " + e.getMessage());
        }
    }
}




