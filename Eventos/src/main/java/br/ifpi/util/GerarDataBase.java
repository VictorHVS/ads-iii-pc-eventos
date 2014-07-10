package br.ifpi.util;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarDataBase {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("hibernate.hbm2ddl.auto", "create");

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(
					"jpa-hibernate-mysql-dev", prop);
			EntityManager em = emf.createEntityManager();

			em.close();
			emf.close();

			System.out.println("Banco de Dados atualizado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar banco de dados...");
		}
	}
}
