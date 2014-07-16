package br.ifpi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PerfilParticipante {
//Identificar como Participante -Organizador - Responsavel pela atividade
	
	@Id
	@GeneratedValue
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
