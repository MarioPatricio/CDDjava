package aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int a = entrada.nextInt();
		if (a < 0) {
			System.out.println("Negativo.");
		}else {
			System.out.println("Positivo.");
		}
	}

}
