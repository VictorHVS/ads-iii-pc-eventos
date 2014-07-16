package br.ifpi.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateDatabase {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				"jpa-hibernate-mysql-dev");
		
		emf.close();
		
	}

}