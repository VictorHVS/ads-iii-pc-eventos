package br.ifpi.entidades;

public enum Papel {
	APOIO("Apoio");
	
	private String descricao;
	
	private Papel(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
