package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Escribe un programa que te pide dos números. Si el primero es menor
		// que el segundo,
		// escribe todos los números comprendidos entre ambos en orden
		// ascendente. Si el
		// primero es mayor que el segundo, escribe todos los números
		// comprendidos entre ambos en orden descendente.

		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;

		System.out.println("Introduzca primer numero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca segundo numero: ");
		numero2 = sc.nextInt();

		if (numero1 < numero2) {
			for (int i = numero1; i <= numero2; i++) {
				System.out.println(i);

			}
		} else {
			for (int i = numero1; i >= numero2; i--) {
				System.out.println(i);
			}
		}

	}

}
