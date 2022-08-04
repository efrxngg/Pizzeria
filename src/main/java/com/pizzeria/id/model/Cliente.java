package com.pizzeria.id.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;
	
	@Column(name = "cedula", nullable = false, length = 10)	
	private String cedula;
	
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;

	
	public Cliente() {}


	public Cliente(int id, String nombre, String cedula, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
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


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
