package PDF_BuclesenPseudocodigo;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Escribe un programa que nos escriba los 10 primeros números que no
		// sean múltiplos
		// ni de 2 ni de 3.

		int numero = 0;

		for (int i = 0; numero < 10; i++) {

			if ((i % 2) != 0 && (i % 3) != 0) {
				numero++;
				System.out.println(i);

			}

		}

	}
}
