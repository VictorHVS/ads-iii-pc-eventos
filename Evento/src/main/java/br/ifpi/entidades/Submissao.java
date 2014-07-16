package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Submissao {
	
	@Id @GeneratedValue
	private Long id;
	@ManyToOne
	private Participante participante;
}
