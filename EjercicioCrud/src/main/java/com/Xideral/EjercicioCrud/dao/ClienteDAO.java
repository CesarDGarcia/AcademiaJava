package com.Xideral.EjercicioCrud.dao;

import java.util.List;

import com.Xideral.EjercicioCrud.entity.Cliente;

public interface ClienteDAO {
	
	List<Cliente> findAll();

    Cliente findById(int theId);

    Cliente save(Cliente theCliente);

    void deleteById(int theId);

}
