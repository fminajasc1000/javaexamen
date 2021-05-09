package com.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


/*
 * Clase para definir la estructura de la tabla proyecto con hibernet
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */

@Entity
public class Proyecto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6812175509424985380L;
	@Id
	@GeneratedValue
	private Integer idProyecto;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "proyecto_users", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "proyecto_idProyecto"))
	private Set<User> desarrollador;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User projectManager;

	public Integer getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<User> getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(Set<User> desarrollador) {
		this.desarrollador = desarrollador;
	}

	public User getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(User projectManager) {
		this.projectManager = projectManager;
	}

	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", desarrollador=" + desarrollador + ", projectManager=" + projectManager + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desarrollador == null) ? 0 : desarrollador.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idProyecto == null) ? 0 : idProyecto.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		if (desarrollador == null) {
			if (other.desarrollador != null)
				return false;
		} else if (!desarrollador.equals(other.desarrollador))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idProyecto == null) {
			if (other.idProyecto != null)
				return false;
		} else if (!idProyecto.equals(other.idProyecto))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		return true;
	}
	
	
}
