package chatProject;
public class Mensagem {
	private Usuario remetente;
	private String conteudo;
	
	public Mensagem(String texto, Usuario requisitante) {
		this.conteudo = texto;
		this.remetente = requisitante;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	public Usuario getUsuario() {
		return this.remetente;
	}
}
