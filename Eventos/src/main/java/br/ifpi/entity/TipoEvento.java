package br.ifpi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoEvento {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	TipoEvento(String nome){
		this.nome = nome;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
