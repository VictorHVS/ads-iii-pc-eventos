package br.ifpi.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organizacao {
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	private List<Instituicao> instituicoes;
	private 
	
}
