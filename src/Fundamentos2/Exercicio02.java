package Fundamentos2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int x = in.nextInt();
		int a = 1;
		while (a < x) {
			 //x++; assim o 1 não aparece
			if (a%2==1) { //ou x % 2 !=0
			System.out.println(a);
		}a++;
		}

	}

}
