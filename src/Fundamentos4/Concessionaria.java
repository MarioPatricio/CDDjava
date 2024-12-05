package Fundamentos4;

public class Concessionaria {

	public static void main(String[] args) {
		Carro opala = new Carro();
		Carro uno = new Carro("Azul", "Mille", 30.000, false, false, 0);
		uno.abastecer();
		uno.ligar();
		uno.ligar();
		uno.desligar();
		
		Honda Civic = new Honda("2,0l 4 cilindros em linha", "Preto", "XLS", 265.900);
		
	}

}
