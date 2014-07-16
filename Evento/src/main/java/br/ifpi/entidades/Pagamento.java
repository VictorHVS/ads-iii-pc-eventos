package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Pagamento {
	
	@Id @GeneratedValue
	private Long id;
	private FormadePagamento formaDePagamento;
	private 

}
