package com.Xideral.EjercicioCrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Xideral.EjercicioCrud.entity.Cliente;
import com.Xideral.EjercicioCrud.service.ClienteService;


@RestController
@RequestMapping("/api")
public class ClienteController {
	
	private ClienteService clienteService;
	
	@Autowired
	public ClienteController(ClienteService theClienteService) {
		clienteService = theClienteService;
	}
	
	// expose "/employees" and return a list of employees
    @GetMapping("/clientes")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/clientes/{clienteId}")
    public Cliente getCliente(@PathVariable int clienteId) {

        Cliente theCliente = clienteService.findById(clienteId);

        if (theCliente == null) {
            throw new RuntimeException("Cliente id not found - " + clienteId);
        }

        return theCliente;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/clientes")
    public Cliente addCliente(@RequestBody Cliente theCliente) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theCliente.setId(0);

        Cliente dbCliente = clienteService.save(theCliente);

        return dbCliente;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/clientes")
    public Cliente  updateCliente(@RequestBody Cliente theCliente) {

        Cliente dbCliente = clienteService.save(theCliente);

        return dbCliente;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/clientes/{theId}")
    public String deleteCliente(@PathVariable int theId) {

        Cliente tempCliente = clienteService.findById(theId);

        // throw exception if null

        if (tempCliente == null) {
            throw new RuntimeException("Cliente id not found - " + theId);
        }

        clienteService.deleteById(theId);

        return "Deleted cliente id - " + theId;
    }

	

}
