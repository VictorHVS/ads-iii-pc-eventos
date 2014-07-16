package br.ifpi.entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "Fase_Evento")
public abstract class FaseEvento {
	FaseEvento faseEvento;
	public FaseEvento atualizar(){
		return faseEvento;}
}
