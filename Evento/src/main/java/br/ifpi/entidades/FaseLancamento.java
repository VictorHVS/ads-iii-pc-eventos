package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FaseLancamento extends FaseEvento {
	
	@Id @GeneratedValue
	private Long id;

}
