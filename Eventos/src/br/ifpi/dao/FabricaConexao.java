package br.ifpi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	

public class FabricaConexao {
		
		public static Connection getConnection() throws SQLException{
			
			try {
				return DriverManager
							.getConnection("jdbc:mysql://localhost/eventos", "root","");
			} catch (Exception e) {
				// TODO: handle exception
				throw e;
			}
			
		}
		
	}


