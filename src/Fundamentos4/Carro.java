package Fundamentos4;

public class Carro {
	
	public String cor;
	public String modelo;
	public double preco;
	public boolean ligado;
	public boolean acelerado;
	public int abastecido;
	public Carro() {
	}
	public Carro(String cor, String modelo, double preco) {
		this.cor=cor;
		this.modelo=modelo;
		this.preco=preco;
	}
	public Carro(String cor) {
		this.cor=cor;
	}
	public Carro(String cor, String modelo, double preco, boolean ligado, boolean acelerado, int abastecido) {
		this.cor=cor;
		this.modelo=modelo;
		this.preco=preco;
		this.ligado=ligado;
		this.acelerado=acelerado;
		this.abastecido=abastecido;
	}
	public void ligar() {
		if (ligado) {
			System.out.println("Carro já ligado.");
		}else {
				System.out.println("Ligando carro.");
				ligado = true;
			}
		}
		
	public void desligar() {
		if (ligado) {
		System.out.println("Desligando carro.");
		ligado = false;
		}else {
			System.out.println("Já desligado.");
		}
	}
	public void abastecer() {
		System.out.println("Abastecendo");
		abastecido = 1;
	}
	public void frear() {
		if (!ligado) {
			System.out.println("Carro parado.");
		}else {
		for (int i=0; i < 5;i++ ) {
			System.out.println("FOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOON");
		}
		}
		
	}
	public void acelerar() {
		if (!ligado) {
			System.out.println("Carro desligado... ligando agora.");
			ligado = true;
		}else {
		if (ligado) {
			System.out.println("Droga, é o Braia... VRUUUUUUUUUUUUUUM");
		}
		}
		
	}
	
}
