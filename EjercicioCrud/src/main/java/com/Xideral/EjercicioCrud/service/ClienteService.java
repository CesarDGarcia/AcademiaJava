package com.Xideral.EjercicioCrud.service;

import java.util.List;

import com.Xideral.EjercicioCrud.entity.Cliente;

public interface ClienteService {
	
	List<Cliente> findAll();
	
	Cliente findById(int theId);
	
	Cliente save(Cliente theCliente);
	
	void deleteById(int theId);

}
