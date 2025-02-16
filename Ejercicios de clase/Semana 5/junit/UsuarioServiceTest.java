package com.juniit.v0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import juniit.UsuarioDto;
import juniit.UsuarioServicio;

public class UsuarioServiceTest {
	
	// Lo usual es que si se usa el coverage el codigo este probado con un 80% o mayor
	
	//@DisplayName("") para poner una descripcion de la prueba 
	// viene de junit jupiter
	@Test
	public void test1() { //en vez de test podemos poner un nombre que haga referencia al tipo de prueba para diferenciarlos
		UsuarioDto esperado = new UsuarioDto(1L, "Pizk");
		UsuarioServicio usuarioServicio = new UsuarioServicio();
		final UsuarioDto resultado = 
				usuarioServicio.crearUsuario(1L, "Pizk");
		//Las asserciones nos ayudaran a comparar si los resultados son los esperados o no 
		
		//Assertions.assertEquals(esperado.id, resultado.id);
		//Assertions.assertEquals(esperado.nombre, resultado.nombre); // podemos llamar estos atributos para que nos diga que fue lo que llamo, tambien podemos pasar un mensaje que haga referencia al tipo de prueba
		
		Assertions.assertEquals(esperado,resultado); //Me dice esto es igual que esto otro o es diferente 
		
		//Assertions.assertTrue(true); // Si algo es verdadero pasara, si no fallara
		//Assertions.assertFalse(false); // Si algo es falso pasara el test, si es verdadero no lo pasara
		//Assertions.fail();
		
		//las pruebas de comparacion pueden fallar si no hemos definido el objeto que queremos comparar
		
		//hay una anotacion que es @BeforeEach lo que nos dice es que va a aplicar o ejecutar un metodo antes de algo en particular
		
		
	
	}
	
	@Test
	public void test2() {
		UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
		UsuarioServicio usuarioServicio = new UsuarioServicio();
		usuarioServicio.crearUsuario(1L,"Nombre");
		final UsuarioDto resultado = 
			usuarioServicio.obtenerUsuario(1L);
		Assertions.assertEquals(esperado, resultado);
	}
	
	
	
	@Test
	void testHashCode() {
	    UsuarioDto usuario1 = new UsuarioDto(1L, "Pizk");
	    UsuarioDto usuario2 = new UsuarioDto(1L, "Pizk");

	    // Asegúrate de que dos objetos iguales tengan el mismo código hash
	    Assertions.assertEquals(usuario1.hashCode(), usuario2.hashCode());
	}

	@Test
	void testEquals() {
	    UsuarioDto usuario1 = new UsuarioDto(1L, "Pizk");
	    UsuarioDto usuario2 = new UsuarioDto(1L, "Pizk");
	    UsuarioDto usuario3 = new UsuarioDto(2L, "Juan");

	    // Asegúrate de que dos objetos con los mismos datos sean iguales
	    Assertions.assertEquals(usuario1, usuario2);

	    // Asegúrate de que dos objetos con datos diferentes no sean iguales
	    Assertions.assertNotEquals(usuario1, usuario3);
	}

	@Test
	void testToString() {
	    UsuarioDto usuario = new UsuarioDto(1L, "Pizk");
	    
	    // Verifica que el toString devuelva el formato correcto
	    String expected = "UsuarioDto [id=1, nombre=Pizk]";
	    Assertions.assertEquals(expected, usuario.toString());
	}


}
