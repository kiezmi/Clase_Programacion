package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Escribe la función “Centra80”, que nos centra una cadena en la
		// pantalla. Para ello, supondremos que la consola tiene una
		// longitud de 80 caracteres por línea
		// La función añadirá los espacios necesarios al principio de la
		// cadena para que quede centrada.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca texto");
		String frase = sc.nextLine();
		System.out.print(centra80(frase));

	}

	public static String centra80(String frase) {

		String espacio = " ";

		int nCaracteres = 80 / 2;
		int nPalabras = frase.length() / 2;
		nCaracteres = nCaracteres - nPalabras;

		for (int i = 0; i <= nCaracteres; i++) {
			espacio = espacio + " ";

		}
		frase = espacio + frase + espacio;
		return frase;
	}

}
