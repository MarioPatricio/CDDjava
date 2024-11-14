package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite A: ");
		int a = entrada.nextInt();
		System.out.print("Digite B: ");
		int b = entrada.nextInt();
		System.out.print("Digite C: ");
		int c = entrada.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		if (a > b) {
			if (a > c) {
				System.out.println("A é o maior.");
			} else {
				System.out.println("C é o maior.");
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println("B é o maior.");
			} else {
				System.out.println("C é o maior.");
			}
		}

	}

}
