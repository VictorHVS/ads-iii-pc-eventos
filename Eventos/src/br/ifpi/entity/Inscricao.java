package br.ifpi.entity;

import java.util.List;

public class Inscricao {
	private int id;
	private String numero;
	
	private StatusInscricao statusInscricao;
	private List<AtividadeEvento> atividades;
	
	private Evento eventoPrincipal;
	public Inscricao(){
		
	}
	public void addAtividade(AtividadeEvento atividadeEvento){
		if(atividade.getEvento().getId == this.evento.get()){
		
		this.atividades.add(atividade);
		}else{
			
		}
	}
}
