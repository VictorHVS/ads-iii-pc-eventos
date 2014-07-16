package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class TipoUsuario {
	
	@Id @GeneratedValue
	private Long id;
}
