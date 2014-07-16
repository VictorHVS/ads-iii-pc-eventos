package br.ifpi.testes;

import br.ifpi.dao.GenericJPADAO;
import br.ifpi.entidades.Evento;
import br.ifpi.entidades.TipoEvento;

public class TesteEventos {
	
	public static void main(String[] args) {
		
		Evento evento = new Evento("SbGames",TipoEvento.Simposio,);
		
		evento.setNome("SBGames");
		evento.setTipo(TipoEvento.Congresso);
		
		new GenericJPADAO().save(evento);
	}

}
