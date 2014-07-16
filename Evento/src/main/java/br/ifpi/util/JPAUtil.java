package br.ifpi.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("jpa-hibernate-mysql-dev");

	private static ThreadLocal<EntityManager> ems = new ThreadLocal<EntityManager>();

	// Fecha o EntityManager atrelado � Thread atual e retira-o da ThreadLocal.
	public static void closeCurrentEntityManager() {
		EntityManager em = ems.get();

		if (em != null && em.isOpen()){
			em.close();
		}
			
		ems.set(null);
	}

	// Obt�m o EntityManager vinculado � Thread atual. Se ele ainda
	// n�o existir, � criado e depois, vinculado � Thread atual.
	public static EntityManager getCurrentEntityManager() {
		EntityManager em = ems.get();

		if (em == null) {
			em = emf.createEntityManager();
			ems.set(em);
		}

		return em;
	}
}
