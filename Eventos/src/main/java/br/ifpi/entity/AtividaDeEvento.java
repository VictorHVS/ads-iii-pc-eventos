package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public abstract class AtividaDeEvento {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	@ManyToOne
	private TipoAtividadeEvento tipoAtividadeEvento;
	
	@OneToOne
	private Participante responsavel;
	
	@OneToMany
	private List<Participante> frequentantes; 
	
	@OneToOne
	private Calendar dataInicio;	
	
	@OneToOne
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
	public List<Participante> getFrequentantes() {
		return frequentantes;
	}
	public void setFrequentantes(List<Participante> frequentantes) {
		this.frequentantes = frequentantes;
	}
	
	
}
