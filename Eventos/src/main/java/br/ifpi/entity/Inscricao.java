package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

public class Inscricao {
	private int id;
	private String numero;
	private Calendar inicioInscicao;
	private Calendar finalizaInscricao;
	
	private StatusInscricao statusInscricao;
	private List<AtividaDeEvento> atividades;
	
	private Evento eventoPrincipal;
	public Inscricao(){
		
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
		return eventoPrincipal;
	}
	public void setEventoPrincipal(Evento eventoPrincipal) {
		this.eventoPrincipal = eventoPrincipal;
	}
	public Calendar getInicioInscicao() {
		return inicioInscicao;
	}
	public void setInicioInscicao(Calendar inicioInscicao) {
		this.inicioInscicao = inicioInscicao;
	}
	public Calendar getFinalizaInscricao() {
		return finalizaInscricao;
	}
	public void setFinalizaInscricao(Calendar finalizaInscricao) {
		this.finalizaInscricao = finalizaInscricao;
	}
	
}
