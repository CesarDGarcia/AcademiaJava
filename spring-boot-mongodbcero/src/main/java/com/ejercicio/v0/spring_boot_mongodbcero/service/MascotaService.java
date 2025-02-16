package com.ejercicio.v0.spring_boot_mongodbcero.service;

import java.util.List;

import com.ejercicio.v0.spring_boot_mongodbcero.collecction.Mascotas;

public interface MascotaService {
	String save(Mascotas mascota);

	List<Mascotas> findAll();

	void delete(String id);

	List<Mascotas> getMascotaStartWith(String nombre);
	
	
}
