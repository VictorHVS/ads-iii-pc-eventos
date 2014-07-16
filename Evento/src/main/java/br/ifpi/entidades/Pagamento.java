package br.ifpi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagamento {
	
	@Id @GeneratedValue
	private Long id;
	private FormadePagamento formaDePagamento;

}
