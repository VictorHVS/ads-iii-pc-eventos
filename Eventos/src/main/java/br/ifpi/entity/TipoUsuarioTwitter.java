package br.ifpi.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("UsuarioTwitter")
public class TipoUsuarioTwitter extends TipoUsuario{

	@Override
	public boolean autenticar(Participante participante) {
		
		return false;
	}

}