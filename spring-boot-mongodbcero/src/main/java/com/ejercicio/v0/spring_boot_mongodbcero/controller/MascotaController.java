package com.ejercicio.v0.spring_boot_mongodbcero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.v0.spring_boot_mongodbcero.collecction.Mascotas;
import com.ejercicio.v0.spring_boot_mongodbcero.service.MascotaService;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@PostMapping
	public String save(@RequestBody Mascotas mascota) {
		return mascotaService.save(mascota);
		
	}
	
	@GetMapping("/getMascotas")
	public List<Mascotas> getAll() {
        return mascotaService.findAll();
    }
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
        mascotaService.delete(id);
    }

	@GetMapping
    public List<Mascotas> getMascotaStartWith(@RequestParam("nombre") String nombre) {
        return mascotaService.getMascotaStartWith(nombre);
    }
}
