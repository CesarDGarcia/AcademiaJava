package com.proyecto.Final.bo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("libreria")
public class Libreria {
	private String productoId;
	private String nombre;
	private String precio;
	
	
	
}
