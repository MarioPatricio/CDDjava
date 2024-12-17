package Esportes;

public class TriAtleta implements Corredor, Nadador, Ciclista {
	
	public String nome;
	public double peso, altura;
	
	public TriAtleta(String nome, double peso, double altura) {
		this.nome=nome;
		this.peso=peso;
		this.altura=altura;
		
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo.");
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando.");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando.");
		
	}

	@Override
	public void correr() {
		System.err.println("Correndo.");
		
	}

}
