package br.ifpi.entity;

import java.util.List;

public class Evento {
	private int id;
	private String nome;
	private TipoEvento tipoEvento;
	private List<AtividadeEvento> atividades;
	private Instituicao instituicao;
	
	public Evento(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
}
