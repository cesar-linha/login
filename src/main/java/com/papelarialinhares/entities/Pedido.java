package com.papelarialinhares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedido")
public class Pedido {
		
	@Id
	@GeneratedValue
	@Column(name = "Num_Pedido")
	private Integer num_pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Cliente")
	private Cliente codCliente;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_Vendedor")
	private Vendedor codVendendor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Prazo_Entrega", length = 11, nullable = false)
	private Date prazo_entrega;

	public Integer getNum_pedido() {
		return num_pedido;
	}

	public void setNum_pedido(Integer num_pedido) {
		this.num_pedido = num_pedido;
	}


	public Date getPrazo_entrega() {
		return prazo_entrega;
	}

	public void setPrazo_entrega(Date prazo_entrega) {
		this.prazo_entrega = prazo_entrega;
	}
			
}