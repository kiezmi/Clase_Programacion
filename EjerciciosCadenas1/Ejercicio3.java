package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe la función “EsPalindromo” a la que le pasamos una cadena y
		// nos dice si la
		// cadena es un palíndromo (true) o no (false). Un palíndromo es una
		// palabra o frase que
		// se lee igual al revés que al derecho.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca texto");
		String frase = sc.nextLine();

		if (EsPalindromo(frase) == false) {
			System.out.println("La cadena no es palindromo");
		} else {
			System.out.println("La cadena es palindromo");
		}
	}

	public static boolean EsPalindromo(String frase) {

		boolean palindromo = false;
		String fraseReves = "";
		for (int longitud = frase.length() - 1; longitud >= 0; longitud--) {
			fraseReves = fraseReves + frase.charAt(longitud);

		}

		if (frase.equals(fraseReves)) {
			palindromo = true;
		}
		return palindromo;
	}
}
