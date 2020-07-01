package com.papelarialinhares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue
	@Column(name = "id_Vendedor")
	private Integer id_vendedor;
	
	@Column(name = "Nome_Vendedor", length = 80, nullable = false)
	private String nome_vendedor;
	
	@Column(name = "Salario")
	private Float salario;
	
	@Column(name = "Comissao")
	private Float comissao;

	public Integer getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Integer id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNome_vendedor() {
		return nome_vendedor;
	}

	public void setNome_vendedor(String nome_vendedor) {
		this.nome_vendedor = nome_vendedor;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public Float getComissao() {
		return comissao;
	}

	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}
	
}
