package com.papelarialinhares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id 
	@GeneratedValue
	@Column(name = "id_Cliente")
	private Integer id;
	
	@Column(name = "Nome_Cliente", length = 80, nullable = false)
	private String nome;
	
	@Column(name = "Endereco", length = 80, nullable = false)
	private String endereco;
	
	@Column(name = "Cidade", length = 40, nullable = false)
	private String cidade;
	
	@Column(name = "CEP", length = 10, nullable = false)
	private String cep;
	
	@Column(name = "CPF", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "Telefone", length = 13, nullable = false)
	private String telefone;
	
	@Column(name = "Email", length = 30, nullable = false)
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	
	}
}