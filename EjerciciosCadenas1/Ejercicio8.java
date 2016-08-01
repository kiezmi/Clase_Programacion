package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Escribe la función “SustituyeCaracter” a la que le pasamos una
		// cadena, un carácter y otro carácter y nos devuelve otra
		// cadena igual que la primera en la que se ha
		// sustituido el primer carácter por el segundo carácter. Ojo, en las
		// cadenas, al contrario
		// que en los arrays, no podemos modificar directamente un valor al
		// estilo de cadena[2]= ‘A’ (los corchetes sólo sirven para leer el
		// valor, no para modificarlo).

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduzca caracter");
		char caracter = sc.next().charAt(0);
		System.out.println("Introduzca caracter para sustituir");
		char caracter2 = sc.next().charAt(0);
		System.out.print(SustituyeCaracter(cadena, caracter, caracter2));

	}

	public static String SustituyeCaracter(String cadena, char caracter, char caracter2) {

		String nuevaCadena = " ";

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == caracter) {
				nuevaCadena = nuevaCadena + caracter2;
			} else {
				nuevaCadena = nuevaCadena + cadena.charAt(i);
			}
		}
		return nuevaCadena;

	}

}
