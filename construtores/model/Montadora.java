package br.com.fiap.construtores.model;

public class Montadora {

	//Atributos
	private String nome;
	
	private String nacionalidade;
	
	//Construtores
	//Construtor com nome e nacionalidade
	public Montadora(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	//Construtor só com o nome
	public Montadora(String nome) {
		this.nome = nome;
	}
	
	///Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}