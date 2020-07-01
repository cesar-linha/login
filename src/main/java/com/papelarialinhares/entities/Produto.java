package com.papelarialinhares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue
	@Column(name = "id_Produto")
	private Integer id_produto;
	
	@Column(name = "Unidade", length = 11, nullable = false)
	private String unidade;
	
	@Column(name = "Descricao", length = 60, nullable = false)
	private String descricao;
	
	@Column(name = "Valor_Unitario")
	private Double valor_unitario;

}
