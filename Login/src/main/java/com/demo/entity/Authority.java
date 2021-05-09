package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * Clase para la definicion de las tablas en donde se almaceneran los tipos de usuarios
 * asi como del cifrado
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Entity
public class Authority {
	/*
	 * Esta tabla almacena los tipos de usuario
	 * USER-->
	 * ADMIN-->
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String authority;
	
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
