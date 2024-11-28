package Fundamentos3;

public class Ex04 {

	public static void main(String[] args) {
		String str = "Hello World!";
		String resultado = str.trim();
		System.out.println(resultado);

		char c = str.charAt(1);
		System.out.println(c);
		
		int pos = str.indexOf("o");
		System.out.println(pos);
		pos = str.lastIndexOf("o");
		System.out.println(pos);
		
	}

}
