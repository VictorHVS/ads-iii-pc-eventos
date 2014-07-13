package br.ifpi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Inscricao {

	@Id
	@GeneratedValue
	private int id;
	private String numero;

	@ManyToOne
	private Participante participante;
	
	@ManyToOne
	private StatusInscricao statusInscricao;
	
	@OneToMany
	private List<Evento> eventos;
	
	private List<AtividaDeEvento> atividadeEvento;
	
	public Inscricao() {
		eventos = new ArrayList<Evento>();
		atividadeEvento = new ArrayList<AtividaDeEvento>();
	}

	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public StatusInscricao getStatusInscricao() {
		return statusInscricao;
	}

	public void setStatusInscricao(StatusInscricao statusInscricao) {
		this.statusInscricao = statusInscricao;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List<AtividaDeEvento> getAtividadeEvento() {
		return atividadeEvento;
	}

	public void setAtividadeEvento(List<AtividaDeEvento> atividadeEvento) {
		this.atividadeEvento = atividadeEvento;
	}


}
