package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Articulo")//en caso que la tabla sea diferente

public class Articulo {
	
	//Atributos de entidad fabricante
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "precio")//no hace falta si se llama igual
		private int precio;
		
		@ManyToOne
//		@ElementCollection
	    @JoinColumn(name="fid")
	    private Fabricante fabricante;

		//Constructores
		/**
		 * 
		 */
		public Articulo() {
			
		}

	
		/**
		 * @param id
		 * @param nombre
		 * @param precio
		 * @param fabricante
		 */
		public Articulo(Long id, String nombre, int precio, Fabricante fabricante) {
			//super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricante = fabricante;
		}


		// getter y setter
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


		/**
		 * @return the precio
		 */
		public int getPrecio() {
			return precio;
		}


		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(int precio) {
			this.precio = precio;
		}


		/**
		 * @return the fabricante
		 */
		public Fabricante getFabricante() {
			return fabricante;
		}


		/**
		 * @param fabricante the fabricante to set
		 */
		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}


		//metodo toString
		@Override
		public String toString() {
			return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
		}
		
		
		
		
		
		
		
	

}
