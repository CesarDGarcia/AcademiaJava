package com.javatechie.spring.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")

public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String nombre;
    @Column(name = "LAST_NAME")
    private String apellido;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String genero;
    @Column(name = "CONTACT")
    private String numero;
    @Column(name = "COUNTRY")
    private String pais;
    @Column(name = "DOB")
    private String fdn;
    
    
    
    public Customer(int id, String nombre, String apellido, String email, String genero, String numero, String pais,
			String fdn) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
		this.numero = numero;
		this.pais = pais;
		this.fdn = fdn;
	}

	public Customer() {
	}

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getGenero() {
		return genero;
	}




	public void setGenero(String genero) {
		this.genero = genero;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public String getDob() {
		return fdn;
	}




	public void setDob(String dob) {
		this.fdn = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", genero="
				+ genero + ", numero=" + numero + ", pais=" + pais + ", dob=" + fdn + "]";
	}




	

}