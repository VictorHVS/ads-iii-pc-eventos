package br.ifpi.dao;
import java.util.List;

import br.ifpi.entity.*;

public interface ParticipanteDAO {
	
	public void addParticipante();
	public Participante consultaParticipante(int cpf);
	public List<Participante> consultarTodosParticipantes();	 
	public void deleteParticipante( Participante participante);

}
