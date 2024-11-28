package Fundamentos2;

import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nota[] = new double[3], media, total=0;
		
		for (int i = 0; i < nota.length; i++) {
		System.out.print("Digite a nota: ");
		nota[i] = in.nextDouble();
		}
		for (double j : nota) {
			total += j;//total = total + j;
			System.out.print(j + " ; ");
		}
		media = total/nota.length;
		System.out.print("A média das notas é "+ media);
		
		in.close();
	}

}
