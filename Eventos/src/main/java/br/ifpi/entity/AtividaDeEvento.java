package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

public class AtividaDeEvento {
	private int id;
	private String nome;
	
	private TipoAtividadeEvento tipoAtividadeEvento;
	private Participante responsavel;
	
	private Calendar dataInicio;	
	private Calendar dataFinaliza;
	public Participante getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Participante responsavel) {
		this.responsavel = responsavel;
	}
	public TipoAtividadeEvento getTipoAtividadeEvento() {
		return tipoAtividadeEvento;
	}
	public void setTipoAtividadeEvento(TipoAtividadeEvento tipoAtividadeEvento) {
		this.tipoAtividadeEvento = tipoAtividadeEvento;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFinaliza() {
		return dataFinaliza;
	}
	public void setDataFinaliza(Calendar dataFinaliza) {
		this.dataFinaliza = dataFinaliza;
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
