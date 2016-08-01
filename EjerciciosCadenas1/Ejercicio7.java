package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Escribe la función “QuitaEspacios” a la que le pasamos una cadena y
		// nos devuelve otra cadena igual que la primera en la que
		// se han eliminado los espacios que haya al principio y al final.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.print(QuitaEspacios(cadena));

	}

	public static String QuitaEspacios(String cadena) {

		String nuevaCadena = "";

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) != ' ') {
				nuevaCadena = nuevaCadena + cadena.charAt(i);
			}
		}
		return nuevaCadena;

	}

}
