package Fundamentos;


import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float nota1, nota2;
		System.out.print("Digite a primeira nota: ");
		nota1 = in.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = in.nextFloat();
		float media = (nota1+nota2)/2;
		System.out.println("A média é: "+ media);
		
		if (media >= 7) {
			System.out.println("Aprovado por média.");
		}else if(media >= 4) {
			System.out.println("Em recuperação: "+ media);
		}else {
			System.out.println("Reprovado.");
		}
	}

}
