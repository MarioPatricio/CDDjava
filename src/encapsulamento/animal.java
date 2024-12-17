package encapsulamento;

public class animal {
	
	private String nome, tutor, rg, raca, mesaniversario;
	private int idade;
	
	public void ajustarTudo(String nome, String tutor, String rg, String raca, String mesaniversario, int idade) {
		this.nome=nome;
		this.tutor=tutor;
		this.rg=rg;
		this.raca=raca;
		this.mesaniversario=mesaniversario;
		this.idade=idade;
	}
	
	public void mostrarNome() {
		System.out.println(this.nome);
	}
	
	public void mostrarTutor() {
		System.out.println(this.tutor);
	}
	
	public void mostrarRg() {
		System.out.println(this.rg);
	}
	
	public void mostrarRaca() {
		System.out.println(this.raca);
	}
	
	public void mostrarAniversario() {
		System.out.println(this.mesaniversario);
	}
	
	public void mostrarIdade() {
		System.out.println(this.idade);
	}
	
}
