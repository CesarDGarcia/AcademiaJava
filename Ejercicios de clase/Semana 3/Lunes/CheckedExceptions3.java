package com.Ejercicio.lunes;

class LimiteDepositosException extends Exception {
    public LimiteDepositosException(String mensaje) {
        super(mensaje);
    }
}

public class CheckedExceptions3{
    // Método para depositar dinero
    static int saldo = 3500;  // Definir el saldo de manera estática

    static void Depositar(int deposito) {
        saldo += deposito;
        System.out.println("Depósito realizado: " + deposito);
        System.out.println("Nuevo saldo: " + saldo);
    }

    // Método para verificar los depósitos y lanzar la excepción si el número excede 4
    static void limitedespositos(int numDepositos) throws LimiteDepositosException {
        if (numDepositos > 4) {
            throw new LimiteDepositosException("¡El número de depósitos excede el límite de 4!");
        }
    }

    public static void main(String[] args) {
        int numDeposito = 3;  // Número de depósitos inicial

        try {
            // Verificar si el número de depósitos excede el límite antes de realizar más depósitos
            limitedespositos(numDeposito);

            // Realizar el depósito
            Depositar(5000);
            numDeposito++;  // Aumentar el número de depósitos

            // Realizar otro depósito
            Depositar(1000);
            numDeposito++;  // Aumentar el número de depósitos

            // Realizar otro depósito
            Depositar(1500);
            numDeposito++;  // Aumentar el número de depósitos

            // Intentar realizar un depósito que exceda el límite de depósitos
            limitedespositos(numDeposito);  // Verificar nuevamente el límite
            Depositar(2000);  // Intentar hacer un cuarto depósito
            numDeposito++;

        } catch (LimiteDepositosException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        System.out.println("Saldo final: " + saldo);
        System.out.println("Número de depósitos realizados: " + numDeposito);
    }
}
