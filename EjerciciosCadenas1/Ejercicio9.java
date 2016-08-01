package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Escribe la función “CuentaPalabras” a la que le pasamos una cadena
		// que contiene una frase y nos devuelve
		// el número de palabras que hay en la misma.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.print("Hay " + CuentaPalabras(cadena) + " palabras");

	}

	public static int CuentaPalabras(String cadena) {
		int palabras = 1;
		int longitud = cadena.length();
		for (int i = 0; i < longitud; i++) {
			if (cadena.charAt(i) == ' ') {
				palabras++;
			
			}
		}
		return palabras;

	}
}
