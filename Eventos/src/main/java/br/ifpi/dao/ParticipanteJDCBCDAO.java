package br.ifpi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.ifpi.entity.Participante;

public class ParticipanteJDCBCDAO implements ParticipanteDAO {
	Connection con = null;
	@Override
	public void addParticipante(Participante participante) {
		try {
			con = FabricaConexao.getConnection();	
			String sql = "insert into participante(nome, email, cpf, perfil) values(?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, participante.getNome());
				ps.setString(2, participante.getEmail());
				ps.setInt(4, participante.getCpf());
				ps.setString(3, participante.getPerfil());
				ps.executeUpdate();
		} catch (Exception e) {

		}

	}

	@Override
	public Participante consultaParticipante(int cpf) {
		try {
			con = FabricaConexao.getConnection();
			String sql = "select * from participante where cpf = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cpf);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Participante participante = new Participante();
				participante.setId(rs.getInt("id"));
				participante.setNome(rs.getString("nome"));
				participante.setEmail(rs.getString("email"));
				participante.setCpf(rs.getInt("cpf"));
				participante.setPerfil(rs.getString("perfil"));
				return participante;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Participante> consultarTodosParticipantes() {
		List<Participante> lista = new ArrayList<Participante>();

		String sql = "select * from participante";

		try {

			con = FabricaConexao.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Participante participante = new Participante();
				participante.setId(rs.getInt("id"));
				participante.setNome(rs.getString("nome"));
				participante.setEmail(rs.getString("email"));
				participante.setCpf(rs.getInt("cpf"));
				participante.setPerfil(rs.getString("perfil"));

				lista.add(participante);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void deleteParticipante(Participante participante) {
		try {
			String sql = "delete from participante where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, participante.getId());

			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
