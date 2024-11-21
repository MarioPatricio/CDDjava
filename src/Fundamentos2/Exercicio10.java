package Fundamentos2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=0, y=0, soma=0;
		for (int i = 1; i <= 20; i++) {
			if (i%3==0) {
				y += i;
			}
				if (i%5==0) {
					x += i;
				}
			
			/*if (i%3==0 || i%5==0) {
				x += i;
				System.out.println(i);
			}
		System.out.println("A soma é " + x);*/
		}
		System.out.println(x);
		System.out.println(y);
		soma = x + y;
		System.out.println("A soma é "+ soma);

	}

}
