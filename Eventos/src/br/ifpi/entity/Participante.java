package br.ifpi.entity;

public class Participante {
	int id;
	String nome;
	String email;
	String cpf;
	String perfil;
	
	public Participante(){
		
	}
	
	public Participante(String _nome, String _email, String _cpf, String _perfil){
		this.nome = _nome;
		this.email = _email;
		this.cpf = _cpf;
		this.perfil = _perfil;
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

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}
