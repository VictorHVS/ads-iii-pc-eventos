package br.ifpi.entidades;

public enum TipoEvento {
	Congresso("Congresso"), Simposio("Simposio"), SEMANA("Semana Cientifica");
	
	private String descricao;
	
	private TipoEvento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
