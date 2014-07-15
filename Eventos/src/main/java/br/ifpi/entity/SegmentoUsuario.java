package br.ifpi.entity;

public enum SegmentoUsuario {
	Aluno(0.35, "aluno"), Professor(0.25,"professor"), Profissional(0.15,"profissional");
	
	double cupomDesconto;
	String nome;
	
	SegmentoUsuario(double cupomDesconto, String nome) {
		this.cupomDesconto= cupomDesconto;
		this.nome = nome;
	}
}
