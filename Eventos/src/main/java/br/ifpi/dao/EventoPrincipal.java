package br.ifpi.dao;

import javax.swing.JOptionPane;

import br.ifpi.entity.AtividaDeEvento;
import br.ifpi.entity.Evento;
import br.ifpi.entity.Inscricao;
import br.ifpi.entity.Instituicao;

public class EventoPrincipal {

	public static void main(String[] args) {
		Inscricao inscricao = new Inscricao();
		Instituicao instituicao = new Instituicao();
		String usuario = "clapyourhands";
		String senha = "123";		
		String opcao;
		
		if(usuario.equals(JOptionPane.showInputDialog("Digite o nome do usuario: ", "Informe o nome de Usuario") )){
			if(senha.equals(JOptionPane.showInputDialog("Digite sua senha: ", "Informe sua senha!"  ))){
					opcao = JOptionPane.showInputDialog("Bem-Vindo ao Menu Eventos" + "\n"+
							"Escolha a ação desejada: \n" +
							" 1 - Inscrever um Evento \n" + 
							" 2 - Inscrever-se em um Evento" +
							" 3 - Ver todos os Eventos" +
							" 4 - Sair");
					
					switch(opcao){
					case "1": 
						
							Evento evento = new Evento();
							AtividaDeEvento atividadeEvento = new AtividaDeEvento();
							
							evento.setNome( JOptionPane.showInputDialog("Nome do Evento: ", "Informe o nome do Evento!"  ));
							if(inscricao.getEventos().contains(evento.getNome())){
								JOptionPane.showMessageDialog(null, "O Evento já foi cadastrado !" + usuario + ",  você teronará o menu principal!");
								
							}else{
								
								evento.getInstituicao().setNome(JOptionPane.showInputDialog("Nome da Instituição: ", "Informe o nome da Instituição!"  ));
								evento.getInstituicao().setEndereço(JOptionPane.showInputDialog("Endereço Instituição: ", "Informe o Endereço da Instituição!"  ));	
								//Lembrar colocar dentro de instituição o evento dentro da lista de eventos da classe instituição
								evento.getTipoEvento().setNome(JOptionPane.showInputDialog("Tipo de Evento: ", "Informe o tipo de Evento!"  ));
							do{
								atividadeEvento.setNome(JOptionPane.showInputDialog("Nome da Atividade do Evento: ", "Informe o nome da Atividade do Evento!"  ));
								atividadeEvento.getResponsavel().setNome(JOptionPane.showInputDialog("Nome do Responsavel pela atividade: ", "Responsavel pela Atividade!"  ));
								atividadeEvento.getResponsavel().setEmail(JOptionPane.showInputDialog("Email do Responsavel: ", "Email do responsavel !"  ));
								atividadeEvento.getResponsavel().setCpf(JOptionPane.showInputDialog("CPF do Responsável: ", "Informe o Cpf do responsavel!!"  ));
								atividadeEvento.getResponsavel().getPerfil().setIdentificar(JOptionPane.showInputDialog("Perfil do Responsavel: ", "Informe o perfil do Responsavel" ));;
								evento.getAtividades().add(atividadeEvento);
							}while(JOptionPane.showInputDialog("Deseja cadastrar outra Atividade de Evento? ").equals("1"));
								inscricao.getEventos().add(evento);
								evento.getInstituicao().getEventos().add(evento);
							
							}
							break;
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
