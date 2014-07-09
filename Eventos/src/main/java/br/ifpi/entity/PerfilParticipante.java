package br.ifpi.entity;

public class PerfilParticipante {
//Identificar como Participante -Organizador - Responsavel pela atividade
	private int id;
	private String identificar;
	
	PerfilParticipante(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificar() {
		return identificar;
	}

	public void setIdentificar(String identificar) {
		this.identificar = identificar;
	}
}
