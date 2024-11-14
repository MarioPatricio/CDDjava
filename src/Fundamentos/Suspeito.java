package Fundamentos;

import java.util.Scanner;

public class Suspeito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int cont = 0;
		System.out.print("Telefonou para a vítima? ");
		char resp = in.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			cont++;
		}
		System.out.print("Esteve no local do crime? ");
		resp = in.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			cont++;
		}
		System.out.print("Mora perto da vítima? ");
		resp = in.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			cont++;
		}
		System.out.print("Devia para a vítima? ");
		resp = in.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			cont++;
		}
		System.out.print("Já trabalhou para a vítima? ");
		resp = in.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeito.");
		}else {
			if (cont == 3 && cont == 4) {
				System.out.println("Cúmplice.");
			}
			if (cont == 5) {
				System.out.println("Assassino.");
			}else {
				System.out.println("Inocente.");
			}
		}
		System.out.print("Respostas ditas 'Sim': "+ cont);
	}

}
