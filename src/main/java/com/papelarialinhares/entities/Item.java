package com.papelarialinhares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_pedido")
public class Item {
	
	@Id
	@GeneratedValue
	@Column(name = "id_Item_Pedido")
	private Integer id_item_pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Produto")
	private Produto codProduto;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Pedido")
	private Pedido codPedido;
	
	@Column(name = "Quantidade", length = 11, nullable = false)
	private Integer quantidade;

	public Integer getId_item_pedido() {
		return id_item_pedido;
	}

	public void setId_item_pedido(Integer id_item_pedido) {
		this.id_item_pedido = id_item_pedido;
	}

	public Produto getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Produto codProduto) {
		this.codProduto = codProduto;
	}

	public Pedido getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Pedido codPedido) {
		this.codPedido = codPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}