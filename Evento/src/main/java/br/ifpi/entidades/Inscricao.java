package br.ifpi.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inscricao {
	
	@Id @GeneratedValue
	private Long id;
	private StatusInscricao status;
	private Pagamento pagamento;
	private List<Cupom> cupons;
	

}
