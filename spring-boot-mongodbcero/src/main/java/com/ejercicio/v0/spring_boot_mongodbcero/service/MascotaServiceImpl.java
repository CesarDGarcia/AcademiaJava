package com.ejercicio.v0.spring_boot_mongodbcero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.v0.spring_boot_mongodbcero.collecction.Mascotas;
import com.ejercicio.v0.spring_boot_mongodbcero.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService{
	@Autowired
	private MascotaRepository mascotaRepository;

	@Override
	public String save(Mascotas mascota) {
		mascotaRepository.save(mascota);
		return mascota.getId();
	}
	
	@Override
	public List<Mascotas> findAll() {
        return mascotaRepository.findAll();
	}
	
	@Override
	public void delete(String id) {
        mascotaRepository.deleteById(id);
	}

	@Override
    public List<Mascotas> getMascotaStartWith(String nombre) {
        return mascotaRepository.findByNombreStartsWith(nombre);
    }
	
}
