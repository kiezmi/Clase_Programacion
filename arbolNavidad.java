package Bucles;

public class arbolNavidad {

	public static void main(String[] args) {

		int numero;
		int fila;

		fila = 1;

		while (fila <= 5) {
			int numerofila;
			numerofila = fila;
			numero = 1;

			while (numerofila > 0) {
				System.out.print(numero);
				numerofila--;
				numero++;
			}
			System.out.println();
			fila = fila + 1;

		}
	}

}
