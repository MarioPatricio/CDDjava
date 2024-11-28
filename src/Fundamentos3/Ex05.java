package Fundamentos3;

public class Ex05 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("Azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		int tam = s1.length();
		System.out.println(tam);
				

	}

}
