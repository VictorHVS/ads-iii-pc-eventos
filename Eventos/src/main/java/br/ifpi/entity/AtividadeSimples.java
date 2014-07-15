package br.ifpi.entity;

import java.util.Calendar;
import java.util.List;

public class AtividadeSimples extends AtividaDeEvento{
	private int id;
	private String nome;
	
	private TipoAtividadeEvento tipoAtividadeEvento;
	private Participante responsavel;
	
	private List<Participante> frequentantes; 
	
	private Calendar dataInicio;	
	private Calendar dataFinaliza;
	
	@Override
	public Participante getResponsavel() {
		// TODO Auto-generated method stub
		return super.getResponsavel();
	}

	@Override
	public void setResponsavel(Participante responsavel) {
		// TODO Auto-generated method stub
		super.setResponsavel(responsavel);
	}

	@Override
	public TipoAtividadeEvento getTipoAtividadeEvento() {
		// TODO Auto-generated method stub
		return super.getTipoAtividadeEvento();
	}

	@Override
	public void setTipoAtividadeEvento(TipoAtividadeEvento tipoAtividadeEvento) {
		// TODO Auto-generated method stub
		super.setTipoAtividadeEvento(tipoAtividadeEvento);
	}

	@Override
	public Calendar getDataInicio() {
		// TODO Auto-generated method stub
		return super.getDataInicio();
	}

	@Override
	public void setDataInicio(Calendar dataInicio) {
		// TODO Auto-generated method stub
		super.setDataInicio(dataInicio);
	}

	@Override
	public Calendar getDataFinaliza() {
		// TODO Auto-generated method stub
		return super.getDataFinaliza();
	}

	@Override
	public void setDataFinaliza(Calendar dataFinaliza) {
		// TODO Auto-generated method stub
		super.setDataFinaliza(dataFinaliza);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public List<Participante> getFrequentantes() {
		// TODO Auto-generated method stub
		return super.getFrequentantes();
	}

	@Override
	public void setFrequentantes(List<Participante> frequentantes) {
		// TODO Auto-generated method stub
		super.setFrequentantes(frequentantes);
	}
	

}
