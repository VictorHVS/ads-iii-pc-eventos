package br.ifpi.entity;

public class SegmentoParticipante {
	//Aluno - Professor - Profisisonal
	private int id;
	private String nome;
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
