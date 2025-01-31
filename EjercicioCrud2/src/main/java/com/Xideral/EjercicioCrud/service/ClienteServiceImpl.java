package com.Xideral.EjercicioCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Xideral.EjercicioCrud.dao.ClienteRepository;
import com.Xideral.EjercicioCrud.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepository clienteRepository;

	
	@Autowired
	public ClienteServiceImpl(ClienteRepository theClienteRepository) {
		clienteRepository = theClienteRepository;
	}
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(int theId) {
		Optional<Cliente> result = clienteRepository.findById(theId);
		
		Cliente theCliente = null;
		
		if(result.isPresent()) {
			theCliente = result.get();
		} else {
			throw new RuntimeException("Did not find Cliente id - " + theId);
		}
		return theCliente;
		
	}

	@Transactional
	@Override
	public Cliente save(Cliente theCliente) {

		return clienteRepository.save(theCliente);
	}

	@Transactional
	@Override
	public void deleteById(int theId) {
		clienteRepository.deleteById(theId);
		
	}
	
	
	
	
	

}
