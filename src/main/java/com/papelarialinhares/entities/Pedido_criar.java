package com.papelarialinhares.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido_criar {
	
	@Id 
	@GeneratedValue
	
	private Long id;

	private String razaosocial;
	private String fantasia;
	private String endereco;

	// GETTERS AND SETTERS
	/**
	 * gets
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * set
	 * @param id the id to set
	 */
	
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * gets
	 * @return the razaosocial
	 */
	public String getRazaosocial() {
		return razaosocial;
	}

	/**
	 * set
	 * @param razaosocial the razaosocial to set
	 */
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	/**
	 * gets
	 * @return the fantasia
	 */
	public String getFantasia() {
		return fantasia;
	}

	/**
	 * set
	 * @param fantasia the fantasia to set
	 */
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	/**
	 * gets
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * set
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}