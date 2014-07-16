package br.ifpi.entidades;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AtividadeComposta extends Atividade {
	
	@Id
	@GeneratedValue
	private Long id;

	private List<AtividadeSimples> unidades;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
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
	public TipoAtividade getTipoAtividade() {
		// TODO Auto-generated method stub
		return super.getTipoAtividade();
	}

	@Override
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		// TODO Auto-generated method stub
		super.setTipoAtividade(tipoAtividade);
	}

	public List<AtividadeSimples> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<AtividadeSimples> unidades) {
		this.unidades = unidades;
	}

}
