package br.ifpi.entity;

import java.util.Calendar;

public class DescontoProgramado {
	//Desconto referente a um evento especifico
	private int id;
	private Evento evento;
	private SegmentoParticipante segmentoParticiapante;
	private double desconto;
	private Calendar dataFim;
	private boolean ativo;
	
	public DescontoProgramado(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public SegmentoParticipante getSegmentoParticiapante() {
		return segmentoParticiapante;
	}

	public void setSegmentoParticiapante(SegmentoParticipante segmentoParticiapante) {
		this.segmentoParticiapante = segmentoParticiapante;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public boolean isAtivo() {
		return false;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
