package bridge.transmissoes;

import bridge.plataformas.IPlataforma;

public class LiveAvancada  extends Live{

	public LiveAvancada(IPlataforma plataforma) {
		super.plataforma = plataforma;
	}
	
	public void subtitulos() {
		System.out.println("Legendas ativadas na transmissão");
	}
	
	public void comentarios() {
		System.out.println("Comentários liberados");
	}
	
	public void gravacao() {
		System.out.println("Gravação iniciada!");
	}
	
}
