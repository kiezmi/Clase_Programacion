package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Escribe la función “NumeroVocales” a la que le pasamos una cadena y
		// nos devuelve el número de vocales que hay en la cadena.
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca texto");
		String frase = sc.nextLine();

		int espacio = NumeroVocales(frase);

		System.out.println("Hay " + espacio + " Vocales");

	}

	public static int NumeroVocales(String frase) {
		int longitud = frase.length() ;
		int indice = 0;
		char letra;
		int num = 0;

		while (indice < longitud) {
			letra = frase.charAt(indice);

			switch (letra) {
			case 'a':
				num++;
				break;
			case 'e':
				num++;
				break;
			case 'i':
				num++;
				break;
			case 'o':
				num++;
				break;
			case 'u':
				num++;
				break;
			case 'A':
				num++;
				break;
			case 'E':
				num++;
				break;
			case 'I':
				num++;
				break;
			case 'O':
				num++;
				break;
			case 'U':
				num++;
				break;
			default:
				break;

			}

			indice++;
		}

		return num;
	}

}
