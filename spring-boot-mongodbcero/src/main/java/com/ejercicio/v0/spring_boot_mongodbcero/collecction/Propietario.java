package com.ejercicio.v0.spring_boot_mongodbcero.collecction;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Propietario {
	private String nombreProp;
	private int numeroProp;
	private String ciudad;

}
