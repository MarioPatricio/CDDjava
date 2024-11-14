package Fundamentos;

import java.util.Scanner;

public class TipoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite: ");
		char x = in.next().charAt(0);
		System.out.println(x);
		if (x == 'F' || x == 'f') {//Lembrar de colocar else, abrir chaves e colocar if
			System.out.println("Feminino.");
		}else if (x =='M' || x == 'm') {
			System.out.println("Masculino.");
		}else {
			System.out.println("Erro.");
		}
	}

}
