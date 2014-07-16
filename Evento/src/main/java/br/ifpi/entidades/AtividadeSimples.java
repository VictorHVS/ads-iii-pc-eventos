package br.ifpi.entidades;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class AtividadeSimples extends Atividade{
	@Id @GeneratedValue
	private Long id;
	
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private TipoAtividade tipoAtividade;

	@OneToMany
	private List<AtividadeSimples> eventoUnidade;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;	
	
	@Temporal(TemporalType.DATE)
	private Calendar dataFinaliza;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public List<AtividadeSimples> getEventoUnidade() {
		return eventoUnidade;
	}
	public void setEventoUnidade(List<AtividadeSimples> eventoUnidade) {
		this.eventoUnidade = eventoUnidade;
	}
	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
}