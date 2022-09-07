package br.com.fiap.construtores.view;

import br.com.fiap.construtores.model.Carro;
import br.com.fiap.construtores.model.Montadora;

public class Exemplo {

	public static void main(String[] args) {
		//Instanciar um carro
		//Construtor cria o objeto com as informações iniciais
		Carro carro = new Carro("Corsa");
		//Depois podemos alterar as informações com os métodos set
		carro.setModelo("Corsel I");
		
		//Instanciar o carro com o modelo, ano, blindado e motor
		Carro gol = new Carro("Gol", 2001, false, 1.0f);
		gol.setAno(2010);
		
		//Instanciar a montadora
		Montadora fiat = new Montadora("FIAT", "Italiana");
		
		//Instanciar o carro com o modelo, ano, blindado, motor e montadora
		Carro uno = new Carro("Uno", 1999, false, 1, fiat);
		
		//Com o objeto da variável uno: exibir o modelo do carro e o nome da montadora
		System.out.print(uno.getModelo() + " - " + uno.getMontadora().getNome());
		
	}
}