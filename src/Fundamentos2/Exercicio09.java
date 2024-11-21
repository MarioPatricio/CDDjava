package Fundamentos2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q;
		double nota=0, media;
		System.out.println("Digite a quantidade de alunos: ");
		q = in.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Qual a nota do aluno? ");
			nota = nota + in.nextDouble();
			
		}
		media = nota/q;
		System.out.println("A média da turma foi: "+media);
		
	}

}
