package com.ejercicio.v0.spring_boot_mongodbcero.collecction;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Document(collection = "mascota")

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mascotas {
	@Id 
	private String id;
	private String nombre;
	private String edad;
	List<String> caracteristicas;
	List<Propietario> propietario;

}
