package bridge;

import bridge.plataformas.IPlataforma;
import bridge.plataformas.Youtube;
import bridge.transmissoes.LiveAvancada;

public class Main {

	public static void main(String[] args) {
		iniciarLive(new Youtube());
	}
	
	public static void iniciarLive(IPlataforma plataforma) {
		
		/* ### LIVE SIMPLES ###
		System.out.println("Aguarde...");
		Live live = new Live(plataforma);
		live.transmissao();
		live.resultado();
		*/
		
		System.out.println("[Gravação avançada] Aguarde...");
		LiveAvancada liveAvancada = new LiveAvancada(plataforma);
		liveAvancada.transmissao();
		liveAvancada.comentarios();
		liveAvancada.subtitulos();
		liveAvancada.resultado();
		liveAvancada.gravacao();
		}

}
