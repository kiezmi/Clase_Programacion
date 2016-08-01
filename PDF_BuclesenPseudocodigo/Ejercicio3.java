package PDF_BuclesenPseudocodigo;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa que nos escriba los 10 primeros números pares.
		int numero = 0;
		for (int i = 1; numero < 10; i++) {
			if (i % 2 == 0) {
				numero++;
				System.out.println(i);
			}
		}
	}

}
