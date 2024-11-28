package Fundamentos3;

public class Exercicio05 {

	public static void main(String[] args) {
		String a[] = {"a", "vida", "é", "bela"};
		String b = new String();
		String c = new String();
		
		for (int i=0; i < a.length; i++) {
			b = b + a[i].toUpperCase() + " ";
		}
		System.out.println(b);
		
		for (int i=a.length-1; i > -1; i--) {
			c = c + a[i].toUpperCase() + " ";
		}
		System.out.println(c);
	}

}
