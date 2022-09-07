package br.com.fiap.construtores.model;

public class Carro {

	//Atributos
	private String modelo;
	
	private int ano;
	
	private boolean blindado;
	
	private float motor;
	
	private boolean pagaIpva;
	
	private Montadora montadora;
	
	//Construtor, chamado com o operador new
	//1- Não tem retorno (nem void)
	//2- Possui o mesmo nome da Classe
	public Carro(String modelo) {
		this.modelo = modelo;
		if (2022 - ano > 20) {
			pagaIpva = false;
		} else {
			pagaIpva = true;
		}
	}
	
	//Criar um construtor com todos os atributos
	public Carro(String modelo, int ano, boolean blindado, float motor) {
		this(modelo); //Chama o construtor que recebe o modelo
		this.ano = ano;
		this.blindado = blindado;
		this.motor = motor;
	}
	
	//Criar um construtor com modelo, ano, blindado, motor e montadora
	public Carro(String modelo, int ano, boolean blindado, float motor, Montadora montadora) {
		this(modelo, ano, blindado, motor);
		this.montadora = montadora;
	}
	
	//Getters e Setters
	public boolean getPagaIpva() {
		return pagaIpva;
	}
	
	public Montadora getMontadora() {
		return montadora;
	}
	
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	
	//Não tem o set, ou seja, os outros objetos não podem alterar o valor
//	public void setPagaIpva(boolean pagaIpva) {
//		this.pagaIpva = pagaIpva;
//	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setBlindado(boolean blindado) {
		this.blindado = blindado;
	}
	
	public void setMotor(float motor) {
		this.motor = motor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public float getMotor() {
		return motor;
	}
	
	public boolean getBlindado() {
		return blindado;
	}
	
}