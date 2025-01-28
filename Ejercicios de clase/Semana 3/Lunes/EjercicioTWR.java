package com.Ejercicio.TWR;

public class EjercicioTWR {

    // Excepción personalizada para límite de crédito
    static class LimitCreditException extends Exception {
        public LimitCreditException(String message) {
            super(message);
        }
    }

    // Clase que implementa AutoCloseable para simular un recurso
    static class CreditVerifier implements AutoCloseable {
        private int credit;

        public CreditVerifier(int credit) {
            this.credit = credit;
        }

        public void verificarLimite() throws LimitCreditException {
            if (credit > 12000) {
                throw new LimitCreditException("No puedes superar el límite de crédito de 12,000.");
            }
        }

        @Override
        public void close() {
            // Aquí se puede agregar lógica de cierre del recurso si fuera necesario
            System.out.println("Verificador de crédito cerrado.");
        }
    }

    public static void main(String[] args) {
        int credit = 13000; // Cambia este valor para probar distintos escenarios

        try (CreditVerifier verifier = new CreditVerifier(credit)) {
            verifier.verificarLimite(); // Verifica si el crédito excede el límite
            System.out.println("Tu crédito está dentro del límite: " + credit);
        } catch (LimitCreditException e) {
            // Maneja la excepción
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
