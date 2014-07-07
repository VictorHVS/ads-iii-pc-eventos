package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

public class AtividaDeEvento {
	private int id;
	private String nome;
	
	private TipoAtividadeEvento tipoAtividadeEvento;
	private Evento evento;
	private List<Participante> responsaveis;
	
	private Calendar dataInicio;	
	private Calendar dataFinaliza;
	
	
}
