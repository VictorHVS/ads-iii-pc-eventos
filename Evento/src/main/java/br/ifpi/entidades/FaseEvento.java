package br.ifpi.entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name = "Fase_Evento")
public abstract class FaseEvento {
	
	@Id @GeneratedValue
	private Long id;
	
	private FaseEvento faseEvento;
	
	public FaseEvento atualizar(){
	return faseEvento;
	}
}
