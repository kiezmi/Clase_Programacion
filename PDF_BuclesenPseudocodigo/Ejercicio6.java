package PDF_BuclesenPseudocodigo;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Escribe un programa que te escribe la tabla de multiplicar del número
		// que le
		// introduzcas por teclado.
		Scanner sc = new Scanner(System.in);
		int tabla = 0;
		int multiplicar = 0;

		System.out.println("Introduzca numero de tabla: ");
		tabla = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			multiplicar = i * tabla;
			System.out.println(i + " X " + tabla + " = " + multiplicar);

		}

	}
}
