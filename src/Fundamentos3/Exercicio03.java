package Fundamentos3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto1 = "Será que são iguais?";
		String texto2 = "Será que são iguais?";
		boolean resposta = texto1.equals(texto2);
		System.out.println(resposta);
		
		if (resposta == true) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Não são iguais!");
		}
		in.close();

	}

}
