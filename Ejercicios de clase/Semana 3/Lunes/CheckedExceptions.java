package com.Ejercicio.lunes;

public class CheckedExceptions extends Exception{
	
	  static class LimitCreditException extends Exception {
	        public LimitCreditException(String message) {
	            super(message);
	        }
	  }
	
	
	  public static void limite(int credit) throws LimitCreditException {
	        if (credit > 12000) {
	            throw new LimitCreditException("No puedes superar ese límite");
	        }
	    }
	  
	public static void main(String[] args) {
		
	int	credit = 11000;
	
	try {
        limite(credit);  // Verifica el crédito
    } catch (LimitCreditException e) {
        System.out.println("Excepción: " + e.getMessage());
          
        }

	System.out.println("tu credito esta en : " + credit); 
	}

}
