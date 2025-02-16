package com.ejercicio.v0.spring_boot_mongodbcero.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ejercicio.v0.spring_boot_mongodbcero.collecction.Mascotas;

public interface MascotaRepository extends MongoRepository<Mascotas,String>{

	 List<Mascotas> findByNombreStartsWith(String nombre);

}
