package Heranca;

public class Aluno extends Pessoa {
	
	public double nota;
	
	public Aluno (String nome, String cpf, String telefone, double nota) {
		super(nome, cpf, telefone);
		this.nota=nota;
	}
	
	public void sofrer() {
			System.out.println("Aluno está sofrendo.");
		
	}
	

}
