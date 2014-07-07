package br.ifpi.dao;


	import java.awt.HeadlessException;
	import java.sql.Connection;
	import java.sql.SQLException;
	import java.text.ParseException;

public class AbreConexaoDAO {
		public static void main(String[] args) throws HeadlessException,
				ParseException {	
			Connection con = null;
			try {
				con = FabricaConexao.getConnection();
				System.out.println("Conectado");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

