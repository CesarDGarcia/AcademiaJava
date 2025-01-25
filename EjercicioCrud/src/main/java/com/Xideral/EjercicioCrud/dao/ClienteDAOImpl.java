package com.Xideral.EjercicioCrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Xideral.EjercicioCrud.entity.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
	  private EntityManager entityManager;
	  
	  @Autowired
	    public ClienteDAOImpl(EntityManager theEntityManager) {
	        entityManager = theEntityManager;
	    }

	@Override
	public List<Cliente> findAll() {
		

        // create a query
        TypedQuery<Cliente> theQuery = entityManager.createQuery("from Cliente", Cliente.class);

        // execute query and get result list
        List<Cliente> clientes = theQuery.getResultList();

        // return the results
        return clientes;
	}

	@Override
	public Cliente findById(int theId) {
		// get employee
        Cliente theCliente = entityManager.find(Cliente.class, theId);

        // return employee
        return theCliente;
	}

	@Override
	public Cliente save(Cliente theCliente) {
		// save employee
        Cliente dbCliente = entityManager.merge(theCliente);

        // return the dbEmployee
        return dbCliente;
	}

	@Override
	public void deleteById(int theId) {
		 // find employee by id
        Cliente theCliente = entityManager.find(Cliente.class, theId);

        // remove employee
        entityManager.remove(theCliente);

		
	}
	

}
