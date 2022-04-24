package chatProject;

import java.util.ArrayList;

public class Chat {
	private Usuario donoDaSala; 
	private String nomeDaSala;
	private ArrayList<Mensagem> conversa;
	
	public Chat(Usuario dono, String nome) {
		this.donoDaSala = dono;
		this.nomeDaSala = nome;
	}
	
	public boolean novaMensagem(Mensagem novaMensagem) {
		this.conversa.add(novaMensagem);
		return true;
	}
	
	public boolean carregarMensagens() {
		Mensagem mensagemtemp;
		Usuario userTemp;
		for(int i = 0; i < this.conversa.size(); i++) {
			mensagemtemp = this.conversa.get(i);
			userTemp = mensagemtemp.getUsuario();
			System.out.println(userTemp.getNome()+" >"+mensagemtemp.getConteudo());
		}
		return true;
	}
}
