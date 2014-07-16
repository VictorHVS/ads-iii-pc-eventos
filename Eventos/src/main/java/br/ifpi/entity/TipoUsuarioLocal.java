package br.ifpi.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("UsuarioLocal")
public class TipoUsuarioLocal {


		public boolean autenticar(Participante participante) {
			
			return false;
		}

}
