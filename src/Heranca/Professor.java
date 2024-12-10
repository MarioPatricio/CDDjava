package Heranca;

public class Professor extends Pessoa {
	
	public double salario;
	
	public Professor(String nome, String cpf, String telefone, double salario) {
		super(nome, cpf, telefone);
		this.salario=salario;
	}
	
	public void certificado() {
			System.out.println("Aluno receberá o certificado.");
	}
	public void diversao() {
			System.out.println("A aula está divertida!");

	}
}
