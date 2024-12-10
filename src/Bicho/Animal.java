package Bicho;

public abstract class Animal {
	
	public String nome;
	
	public Animal(String nome) {
		this.nome=nome;
	}
	
	public void comer() {
		System.out.println("O animal está comendo.");
	}

	public void locomover() {
		System.out.println("O animal está se locomovendo.");
	}
}
