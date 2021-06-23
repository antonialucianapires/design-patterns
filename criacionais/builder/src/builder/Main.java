package builder;

import builder.builders.CarroBuilder;
import builder.carros.Carro;
import builder.diretor.Diretor;

public class Main {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		
		CarroBuilder builder = new CarroBuilder();
		diretor.construirCarroGol(builder);
		
		Carro carro = builder.getResultado();
		System.out.println(carro.getTipoCarro() + " criado com sucesso.");

	}

}
