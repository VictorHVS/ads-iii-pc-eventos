package br.ifpi.dao;

import javax.swing.JOptionPane;

import br.ifpi.entity.Inscricao;

public class EventoPrincipal {

	public static void main(String[] args) {
		Inscricao inscricao = new Inscricao();
		String usuario = "clapyourhands";
		String senha = "123";
		String usuarioTest;
		String senhaTest;
		String opcao;
		
			usuarioTest = JOptionPane.showInputDialog("Digite o nome do usuario: ", "Informe o nome de Usuario"); 
			
			if(usuarioTest.equals(usuario)){
				senhaTest = JOptionPane.showInputDialog("Digite sua senha: ", "Informe sua senha!"  );
				
				if(usuario.equals(senhaTest)){
					opcao = JOptionPane.showInputDialog("Bem-Vindo ao Menu Eventos" + "\n"+
							"Escolha a ação desejada: \n" +
							" 1 - Inscrever um Evento \n" + 
							" 2 - Inscrever-se em um Evento" +
							" 3 - Ver todos os Eventos" +
							" 4 - Sair");
					
					switch(opcao){
					case "1": 
						do{
						String nomeEvento;
						
							nomeEvento =  JOptionPane.showInputDialog("Nome do Evento: ", "Informe o nome do Evento!"  );
							if(inscricao.getEventoPrincipal().getNome().equals(nomeEvento)){
								JOptionPane.showMessageDialog(null, "O Evento já foi cadastrado !");
								
							}else{
								String nomeResponsavel =  JOptionPane.showInputDialog("Nome do responsavel: ", "Informe o nome do responsavel:"  );
							}
						}while();
					case "2":
					
					case "3":
						     
					case "4":
					}
				}else{
					//senha errada
				}
			}else{
				
				//usuario errado
			}
		
		
		
		JOptionPane.showMessageDialog(null,	"Bem Vindo ao Menu Eventos"+ "\n"+
				"1 - Inscrever um Evento" + "\n" +
				"2 - Inscrever-se em um Evento" + "\n"
				);
	}

}
