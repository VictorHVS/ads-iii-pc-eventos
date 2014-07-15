package br.ifpi.entity;

import java.util.ArrayList;
import java.util.List;

public class EspacoFisicoSimples extends EspacoFisico {
	private int id;
	private String nome;
	private boolean reservado;
	private String localizacao;
	private int capacidade; 
	private EspacoFisico principal;
	
	
	
	public EspacoFisicoSimples(){
		
	}
	
	public void addLocais(EspacoFisico local) {
		// TODO Auto-generated method stub
		super.addLocais(local);
	}

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

	public EspacoFisico getPrincipal() {
		return principal;
	}

	public void setPrincipal(EspacoFisico principal) {
		this.principal = principal;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
		
	
	
}
