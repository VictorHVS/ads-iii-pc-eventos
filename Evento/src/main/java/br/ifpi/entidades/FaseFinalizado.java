package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FaseFinalizado extends FaseEvento {
	FaseFinalizado fase;
	@Id
	@GeneratedValue
	private Long id;

	@Override
	public FaseEvento atualizar() {
		// TODO Auto-generated method stub
		return fase;
	}

}
