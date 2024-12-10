package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", "1", "1", 7);
		Aluno a2 = new Aluno("Maria", "2", "2", 10);
		Professor p1 = new Professor("Zé", "3", "3", 4000.0);
		Professor p2 = new Professor("Ana", "4", "4", 4000.0);
		
		System.out.println(a1.nome);
		System.out.println(a2.nome);
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		a1.sofrer();
		p2.diversao();
		p1.certificado();
		
	}

}
