package ejerciciosPropuestosPDF1;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Escriba un programa que lea un carácter y determine a cual de los
		// siguientes grupos pertenece:
		//
		// a, e, i, o, u VOCAL
		// b, c, d, f, g, h, j, k PRIMERAS CONSONANTES
		// l, m, n, ñ, p, q, r SEGUNDAS CONSONTANTES
		// s, t, v, w, x, y, z ULTIMAS CONSONANTES
		//
		// Si el carácter tecleado por el usuario no pertenece a ninguno de los
		// grupos mencionados, el programa debe
		// desplegar un mensaje al respecto. Utilice una estructura de selección
		// múltiple para resolver el problema.

		char caracter=' ';
		System.out.print("Introduzca Vocal o Consonante");
		caracter = sc.next().charAt(0);

		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			System.out.print(caracter + " ");
			System.out.print("VOCAL");

		} else if (caracter == 'b' || caracter == 'c' || caracter == 'd' || caracter == 'f' || caracter == 'g'
				|| caracter == 'h' || caracter == 'j' || caracter == 'k') {
			System.out.print(caracter + " ");
			System.out.print("PRIMERAS CONSONANTES");

		} else if (caracter == 'l' || caracter == 'm' || caracter == 'n' || caracter == 'ñ' || caracter == 'p'
				|| caracter == 'q' || caracter == 'r') {
			System.out.print(caracter + " ");
			System.out.print("SEGUNDAS CONSONANTES");

		} else if (caracter == 's' || caracter == 't' || caracter == 'v' || caracter == 'w' || caracter == 'x'
				|| caracter == 'y' || caracter == 'z') {
			System.out.print(caracter + " ");
			System.out.print("ULTIMAS CONSONANTES");
		} else {
			System.out.print(caracter + " ");
			System.out.print("No es una vocal o consonante");
		}

	}
}
