package br.ifpi.entity;

import java.util.ArrayList;
import java.util.List;

public class EspacoFisicoComposto extends EspacoFisico {
	private int id;
	private String nome;
	private String localizacao;
	private boolean reservado;
	private List<EspacoFisico> locais; 
	private EspacoFisico principal;
	
	
	public EspacoFisicoComposto(){
		
	}

	public int getCapacidade(){
		int somatorio=0;
		for(EspacoFisico espacoFisico: locais){
			somatorio++;
		}
		return somatorio;
	}
	@Override
	public void addLocais(EspacoFisico local) {
		// TODO Auto-generated method stub
		super.addLocais(local);
	}


	@Override
	public boolean isReservado() {
		// TODO Auto-generated method stub
		return super.isReservado();
	}


	@Override
	public void setReservado(boolean reservado) {
		// TODO Auto-generated method stub
		super.setReservado(reservado);
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
	public List<EspacoFisico> getLocais() {
		// TODO Auto-generated method stub
		return super.getLocais();
	}


	@Override
	public void setLocais(ArrayList<EspacoFisico> arrayList) {
		// TODO Auto-generated method stub
		super.setLocais(arrayList);
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
