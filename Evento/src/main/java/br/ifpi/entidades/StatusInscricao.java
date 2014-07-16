package br.ifpi.entidades;

public enum StatusInscricao {

	CRIADA("Criada"), AGUARDANDOPAGAMENTO("Aguardando Pagamento"), CONFIRMADA("Confirmada"), CANCELADA("Cancelada");
	
	private String descricao;
	
	private StatusInscricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
