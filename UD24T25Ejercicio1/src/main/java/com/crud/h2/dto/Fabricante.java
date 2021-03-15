package com.crud.h2.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Fabricante")//en caso que la tabla sea diferente
public class Fabricante  {
 
	//Atributos de entidad fabricante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

//	@ElementCollection
	@OneToMany
//    @ManyToOne
    @JoinColumn(name="id")
    private List<Articulo> articulo;
	
	//Constructores
	
	public Fabricante() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 
	 */
	public Fabricante(Long id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
	
	}

	
	//Getters y Setters
	
	public Fabricante(Long id, String nombre, List<Articulo> articulo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.articulo = articulo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
//	/**
//	 * @return the articulo
//	 */
//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
//	public List<Articulo> getArticulo() {
//		return articulo;
//	}
//
//	/**
//	 * @param articulo the articulo to set
//	 */
//	public void setArticulo(List<Articulo> articulo) {
//		this.articulo = articulo;
//	}

	@JsonIgnore
	public List<Articulo> getArticulo() {
		return articulo;
	}

	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", articulo=" + articulo + "]";
	}
	
	
	
	
	
}
