package br.ifpi.entity;

import java.util.ArrayList;
import java.util.List;

public class EspacoFisico {
	
	private int id;
	private String nome;
	private boolean reservado;
	private List<EspacoFisico> locais; 
	private EspacoFisico principal;
	
	
	public EspacoFisico(){
		
	}
	public EspacoFisico(int id, String nome, boolean reservado, EspacoFisico principal){
		this.setId(id);
		this.setNome(nome);
		this.setReservado(reservado);
		this.principal = new EspacoFisico();
	}
	public EspacoFisico(int id, String nome, boolean reservado, EspacoFisico principal, List<EspacoFisico> locais){
		this.setId(id);
		this.setNome(nome);
		this.setReservado(reservado);
		this.principal = new EspacoFisico();
		this.locais = new ArrayList<>(); 
	}
	
	public void addLocais(EspacoFisico local){
		
		principal.addLocais(local);
		
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
		
	
	
}
