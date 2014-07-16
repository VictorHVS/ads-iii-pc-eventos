package br.ifpi.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evento {
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private TipoEvento tipo;
	@ManyToOne
	private Organizacao organizacao;
	@OneToMany
	private List<Inscricao> inscricoes;
	@OneToMany
	private List<Submissao> submissoes;
	@OneToMany
	private List<EspacoFisico> espacos;
	@OneToMany
	private List<Cupom> cupons;
	@OneToMany
	private List<DescontoProgramado> descontosProgramados;
	@OneToMany
	private List<Atividade> atividades;
	private Divulgacao divulgacao;
	private FaseEvento faseEvento;
	
	public Evento(String nome, TipoEvento tipo, Organizacao organizacao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.organizacao = organizacao;
		this.setFaseEvento(new FaseLancamento());
	}
	
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
	public TipoEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}
	public Organizacao getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Submissao> getSubmissoes() {
		return submissoes;
	}
	public void setSubmissoes(List<Submissao> submissoes) {
		this.submissoes = submissoes;
	}
	public List<EspacoFisico> getEspacos() {
		return espacos;
	}
	public void setEspacos(List<EspacoFisico> espacos) {
		this.espacos = espacos;
	}
	public List<Cupom> getCupons() {
		return cupons;
	}
	public void setCupons(List<Cupom> cupons) {
		this.cupons = cupons;
	}
	public List<DescontoProgramado> getDescontosProgramados() {
		return descontosProgramados;
	}
	public void setDescontosProgramados(
			List<DescontoProgramado> descontosProgramados) {
		this.descontosProgramados = descontosProgramados;
	}
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	public Divulgacao getDivulgacao() {
		return divulgacao;
	}
	public void setDivulgacao(Divulgacao divulgacao) {
		this.divulgacao = divulgacao;
	}
	public FaseEvento getFaseEvento() {
		return faseEvento;
	}
	public void setFaseEvento(FaseEvento faseEvento) {
		this.faseEvento = faseEvento;
	}

}
