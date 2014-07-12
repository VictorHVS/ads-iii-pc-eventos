package br.ifpi.entity;

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

	public Inscricao() {

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

	public List<AtividaDeEvento> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<AtividaDeEvento> atividades) {
		this.atividades = atividades;
	}

	public Evento getEventoPrincipal() {
		return evento;
	}

	public void setEventoPrincipal(Evento eventoPrincipal) {
		this.evento = eventoPrincipal;
	}

}
