package com.papelarialinhares.beans;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.papelarialinhares.entities.Cliente;
import com.papelarialinhares.entities.JpaUtil;

@ManagedBean
public class UsuarioBean {

	private Cliente cliente = new Cliente();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void salva(Cliente cli) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(cli);
		tx.commit();
		manager.close();
		JpaUtil.close();
	}
}
