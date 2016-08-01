package EjerciciosCadenas2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Escribe la función “MayusculasPrimera” a la que le pasas una cadena y
		// te devuelve la
		// cadena con la primera letra de cada palabra puesta en mayúsculas.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
	
	
		System.out.print(MayusculasPrimera(cadena ));
	}

	

public static String MayusculasPrimera(String cadena) {

	String nuevaCadena = "";

	for (int i = 0; i < cadena.length(); i++) {

		if (cadena.charAt(i) == ' ') {
			nuevaCadena = nuevaCadena+Character.toLowerCase(cadena.charAt(i)) ;
		} else {
			nuevaCadena = nuevaCadena + Character.toUpperCase(cadena.charAt(i));
		}
	}
	return nuevaCadena;
	}

}
