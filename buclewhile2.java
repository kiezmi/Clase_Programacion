package Bucles;

public class buclewhile2 {

	public static void main(String[] args) {

		int valor;
		int num = 1;
		int sumapares = 0;
		int sumaimpares = 0;

		while (num <= 100) {
			valor = num % 2;
			switch (valor) {

			case 0:
				System.out.println(num + "Es par");
				sumapares = sumapares + num;
				break;

			default:
				System.out.println(num + "Impar");
				sumaimpares = sumaimpares + num;
				break;

			}

			num = num + 1;

		}
		System.out.println(sumaimpares);
		System.out.println(sumapares);
	}

}