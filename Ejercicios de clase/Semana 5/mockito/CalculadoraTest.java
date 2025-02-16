package com.ejercicio.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.ejercicio.calculadora.Calculadora;

public class CalculadoraTest {
	@Test //Importamos de junit esta etiqueta que marca esta parte del codigo como test
	void testSumaConMockito() {
		//Creamos un mock de la interfaz Calculadora, impotamos Calculadora, y mock de Mockito
		Calculadora calculatorMock = mock(Calculadora.class);
		
		
		//Definimos con when un comportamiento simulado hacemos el import static de when
		when(calculatorMock.suma(5, 3)).thenReturn(8);
		
		int resultado = calculatorMock.suma(5,3);
		assertEquals(8, resultado);
		
		
		verify(calculatorMock).suma(5,3);
		
	}
	

}
