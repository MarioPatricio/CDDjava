package Fundamentos2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0;i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}

	}

}
