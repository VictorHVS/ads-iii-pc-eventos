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
	private String tipoEvento;
	
	@OneToMany
	private List<AtividaDeEvento> atividades;
	
	@ManyToOne
	private Instituicao instituicao;
	
	@ManyToOne
	private FaseEvento faseEvento;
	
	private List<Participante> participantes;
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

	public List<DescontoProgramado> getDescontos() {
		return descontos;
	}

	public void setDescontos(List<DescontoProgramado> descontos) {
		this.descontos = descontos;
	}

	public List<CupomPromocional> getCupom() {
		return cupom;
	}

	public void setCupom(List<CupomPromocional> cupom) {
		this.cupom = cupom;
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

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
}
