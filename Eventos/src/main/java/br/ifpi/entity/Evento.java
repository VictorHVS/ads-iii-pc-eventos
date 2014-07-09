package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evento {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	@ManyToOne
	private TipoEvento tipoEvento;
	
	@OneToMany
	private List<AtividaDeEvento> atividades;
	
	@ManyToOne
	private Instituicao instituicao;
	
	@ManyToOne
	private FaseEvento faseEvento;
	
	private List<DescontoProgramado> descontos;
	private List<CupomPromocional> cupom;
	private Calendar dataInicio;

	private Calendar dataFinaliza;

	public Evento() {

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AtividaDeEvento> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<AtividaDeEvento> atividades) {
		this.atividades = atividades;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public FaseEvento getFaseEvento() {
		return faseEvento;
	}

	public void setFaseEvento(FaseEvento faseEvento) {
		this.faseEvento = faseEvento;
	}
}
