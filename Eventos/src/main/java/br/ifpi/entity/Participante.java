package br.ifpi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Participante {

	@Id
	@GeneratedValue
	private int id;	
	private String nome;
	String email;
	String cpf;
	
	@ManyToOne
	private PerfilParticipante perfilParticipante;
	
	@ManyToOne
	private SegmentoParticipante segmentoParticipante;
	
	@OneToMany(mappedBy="participante")
	private List<Inscricao> inscricoes;
	
	@ManyToOne
	private TipoUsuario tipoUsuario;

	
	public Participante() {

	}

	public Participante(String _nome, String _email, String _cpf, PerfilParticipante _perfil) {
		this.nome = _nome;
		this.email = _email;
		this.cpf = _cpf;
		this.perfilParticipante = _perfil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PerfilParticipante getPerfil() {
		return perfilParticipante;
	}

	public void setPerfil(PerfilParticipante perfil) {
		this.perfilParticipante = perfil;
	}

}
