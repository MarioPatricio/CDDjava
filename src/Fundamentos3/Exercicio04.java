package Fundamentos3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String str = new String(in.nextLine());
		String resultado = str.toUpperCase();
		System.out.println(resultado);
		
		in.close();
	}


}
