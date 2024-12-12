package encapsulamento;

public class animal {
	
	private String nome, tutor, rg, raca, mesaniversario;
	private int idade;
	
	public void AjustarNome(String nome) {
		this.nome=nome;
	}
	
	public void MostrarNome() {
		System.out.println(this.nome);
	}
	
}
