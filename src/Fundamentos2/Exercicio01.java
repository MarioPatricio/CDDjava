package Fundamentos2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos alunos têm na sala? ");
		int q = in.nextInt();
		int x = 0;
		float media, nota, soma;
		soma = 0;
		while (x < q){
			x++;
			System.out.print("Digite a nota do aluno: ");
			nota = in.nextFloat(); //ou nota += in.nextFloat(); dispensa variável soma
			soma = soma + nota; 
		}
		System.out.println("A quantidade de alunos é "+q);
		System.out.println("A soma das notas é "+soma);
		media = soma/q;
		System.out.println("A média é "+media);
	}

}
