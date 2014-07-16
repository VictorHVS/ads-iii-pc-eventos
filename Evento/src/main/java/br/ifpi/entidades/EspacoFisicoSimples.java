package br.ifpi.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("EF_simples")
public class EspacoFisicoSimples extends EspacoFisico {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private boolean reservado;
	private String localizacao;
	private int capacidade;

	@OneToOne
	private EspacoFisico principal;

	public EspacoFisicoSimples() {

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
