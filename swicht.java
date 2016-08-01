package Cosas_Basicas;

public class swicht {

	public static void main(String[] args) {

		int valor;
		int num = 1;

		while (num <= 100) {
			valor = num % 2;
			switch (valor) {

			case 0:
				System.out.println(num + "Es par");
				break;

			default:
				System.out.println(num + "Impar");
				break;

			}

			num = num + 1;
		}

	}

}
