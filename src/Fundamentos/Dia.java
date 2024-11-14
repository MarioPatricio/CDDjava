package Fundamentos;

import java.util.Scanner;

public class Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int d = entrada.nextInt();
		if (d == 1) {
			System.out.print("Domingo.");
		}else if (d == 2) {
			System.out.print("Segunda.");
		}else  if (d == 3) {
			System.out.println("Terça.");
		}else if (d == 4) {
			System.out.println("Quarta.");
		}else if (d == 5) {
			System.out.println("Quinta.");
		}else if (d == 6) {
			System.out.println("Sexta.");
		}else if (d == 7) {
			System.out.println("Sábado.");
		}else {
			System.out.println("Valor inválido.");
		}
	}

}
