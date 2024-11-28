package Fundamentos3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = new String();
		
		System.out.println("Digite uma frase: ");
		str = in.nextLine();
		StringTokenizer b = new StringTokenizer(str); //StringTokenizer exemplo = new StringTokenizer(entrada.nextLine());
		System.out.println(b.countTokens());
		
		in.close();
	}

}
