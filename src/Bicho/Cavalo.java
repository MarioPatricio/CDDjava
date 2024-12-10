package Bicho;

public class Cavalo extends Mamifero {
	
	public Cavalo(String nome) {
		super(nome);
	}
	
	public void comer(String comida) {
		System.out.printf("%s está comendo %s\n", nome, comida);
	}

	public void locomover(String direcao) {
		System.out.printf("%s está se locomovendo para a %s\n", nome, direcao);
	}
}
