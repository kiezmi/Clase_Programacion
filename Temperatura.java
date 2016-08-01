package Cosas_Basicas;
public class Temperatura {

	public static void main(String[] args) {

		int temperatura;

		temperatura = 20;

		if (temperatura <= 0) {
			System.out.println("Solido");
		} else if (temperatura < 100) {
			System.out.println("Liquido");
		} else
			System.out.println("Gaseoso");

	}

}
