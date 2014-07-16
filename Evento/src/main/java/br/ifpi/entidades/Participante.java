package br.ifpi.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Participante {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private PerfilParticipante perfil;
	private TipoUsuario tipo;
	private List<Submissao> submissoes;
	private List<Inscricao> inscricoes;
	private SegmentoParticipante segmento;
	
}
