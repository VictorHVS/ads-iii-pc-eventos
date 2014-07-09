package br.ifpi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.ifpi.entity.Participante;

public class ParticipanteJPADAO implements ParticipanteDAO{
	EntityManager em = JPAUtil.getCurrentEntityManager();
	
	
	
	public void addParticipante(Participante participante) {
		
		em.getTransaction().begin();
		
		em.persist(participante);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	
	public Participante consultaParticipante(int cpf) {
		
		Query pesquisaPorCpf = em.createQuery("select p from Participante p where p.cpf = :cpf");
		
		pesquisaPorCpf.setParameter("cpf", cpf);
		
		Participante participante = (Participante)pesquisaPorCpf.getSingleResult();
		
		em.close();
		
		return participante;
	}

	
	public List<Participante> consultarTodosParticipantes() {
		
		Query pesquisaTodosParticipantes = em.createQuery("select p from Participante p");
		
		List<Participante> listaParticipante = pesquisaTodosParticipantes.getResultList();
		
		em.close();
		
		return listaParticipante;
	}

	
	public void deleteParticipante(Participante participante) {
		em.getTransaction().begin();
		
		em.remove(participante);
		
		em.getTransaction().commit();
		
	}

}
