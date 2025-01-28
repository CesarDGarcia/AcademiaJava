package com.Xideral.EjercicioCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Xideral.EjercicioCrud.dao.ClienteDAO;
import com.Xideral.EjercicioCrud.entity.Cliente;



@Service
public class ClienteServiceImpl implements ClienteService {
	
	private ClienteDAO clienteDAO;

	
	@Autowired
	public ClienteServiceImpl(ClienteDAO theClienteDAO) {
		clienteDAO = theClienteDAO;
	}
	
	@Override
	public List<Cliente> findAll() {
		return clienteDAO.findAll();
	}

	@Override
	public Cliente findById(int theId) {
		
		return clienteDAO.findById(theId);
	}
	@Transactional
	@Override
	public Cliente save(Cliente theCliente) {

		return clienteDAO.save(theCliente);
	}

	@Override
	public void deleteById(int theId) {
		clienteDAO.deleteById(theId);
		
	}
	
	
	
	
	

}
