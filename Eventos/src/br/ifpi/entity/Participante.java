package br.ifpi.entity;

@Entity
public class Participante {
	
	@Id @GeneratedValue
	int id;
	String nome;
	String email;
	int cpf;
	String perfil;
	
	public Participante(){
		
	}
	
	public Participante(String _nome, String _email, int _cpf, String _perfil){
		this.nome = _nome;
		this.email = _email;
		this.cpf = _cpf;
		this.perfil = _perfil;
	}

	public int getId( ) {
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}
