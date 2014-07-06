package br.ifpi.dao;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizarBD {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("hibernate.hbm2ddl.auto", "update");
		
		try {
			EntityManagerFactory emf 
			= Persistence.createEntityManagerFactory("jpa-hibernate-mysql", props);
			
			emf.close();
			System.out.println("Deu certo");
			
		} catch (Exception e) {
			e.printStackTrace(); 
			System.out.println("Deu errado");
		}
	}
}
