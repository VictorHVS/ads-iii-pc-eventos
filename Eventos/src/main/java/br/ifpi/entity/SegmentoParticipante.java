package br.ifpi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SegmentoParticipante {
	//Aluno - Professor - Profisisonal
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	@OneToMany
	private CupomPromocional cupomDesconto;
	
	public SegmentoParticipante(){
		
	}

	public CupomPromocional getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(CupomPromocional cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
