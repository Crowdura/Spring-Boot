package com.crud_user.clientapp.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="ciudades_id")
	private Ciudad ciudad;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Ciudad getCiudad() {
		return ciudad;
	}



	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", email=" + email + ", ciudad=" + ciudad + "]";
	}


	
}
