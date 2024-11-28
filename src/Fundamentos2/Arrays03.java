package Fundamentos2;

import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrayOne[] = new int[4];
		int arrayTwo[] = new int [4];
		
		for(int i = 0; i < arrayOne.length; i++) {//também poderia fazer com apenas um for, colocando ambos arrays dentro
			System.out.print("Digite o número: ");
			arrayOne[i] = in.nextInt();
			//System.out.println(arrayOne[i]);
		}
		for(int a=0; a < arrayOne.length; a++) {
		System.out.println(arrayOne[a]);
		}
		for(int i = 0; i < arrayTwo.length; i++) {
			System.out.print("Digite o número: ");
			arrayTwo[i] = in.nextInt();
			//System.out.println(arrayOne[i]);
		}
		for(int a=0; a < arrayTwo.length; a++) {
		System.out.println(arrayTwo[a]);
		}
		/*for (int j: arrayOne) { maneira mais simples, caso não utilize o índice
			System.out.println(j);
		}*/
		in.close();
	}

}
