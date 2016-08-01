package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Escribe la función “NúmeroEspacios” a la que le pasamos una cadena y
		// nos devuelve el número de espacios que contiene esa cadena
		// (tanto al principio y al final como intercalados).
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca texto");
		String frase = sc.nextLine();
		
		int num = NumeroEspacios(frase);

		System.out.println("Hay " + num + " espacios");

	}

	public static int NumeroEspacios(String frase) {
		int longitud = frase.length() ;
		int indice = 0;
		char letra;
		int num = 0;

		while (indice < longitud) {
			letra = frase.charAt(indice);

			if (letra == ' ') {
				num++;
			}
			indice++;
		}

		return num;
	}

}
