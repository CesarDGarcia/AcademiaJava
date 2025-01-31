package com.Xideral.EjercicioCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Xideral.EjercicioCrud.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
