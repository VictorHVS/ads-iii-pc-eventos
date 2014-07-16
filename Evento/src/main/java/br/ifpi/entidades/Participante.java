package br.ifpi.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Participante {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private PerfilParticipante perfil;
	private TipoUsuario tipo;
	@OneToMany
	private List<Submissao> submissoes;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PerfilParticipante getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilParticipante perfil) {
		this.perfil = perfil;
	}
	public TipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	public List<Submissao> getSubmissoes() {
		return submissoes;
	}
	public void setSubmissoes(List<Submissao> submissoes) {
		this.submissoes = submissoes;
	}
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public SegmentoParticipante getSegmento() {
		return segmento;
	}
	public void setSegmento(SegmentoParticipante segmento) {
		this.segmento = segmento;
	}
	@OneToMany
	private List<Inscricao> inscricoes;
	private SegmentoParticipante segmento;
	
}
