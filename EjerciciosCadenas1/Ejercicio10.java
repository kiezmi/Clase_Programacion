package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Escribe la función “EsNumero”, a la que le pasamos una cadena y nos
		// dice si está formada enteramente por números o no.
		// Esta función es muy interesante para
		// evitarnos errores a la hora de hacer un Console.ReadLine.
		// Si queremos leer un número del teclado, lo correcto es leerlo con un
		// Console.
		// ReadLine como si fuera una cadena, después comprobar con la función
		// EsNumero si está formado completamente por/ dígitos y después hacerle
		// un int.  Parse para pasarlo a un entero. Así no peta tanto.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.print(EsNumero(cadena));
	}

	public static String EsNumero(String cadena) {

		String comprobacion = "";
		char numero[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 0; i < cadena.length(); i++) {
			for (int n = 0; n < numero.length; n++) {

				if (cadena.charAt(i) == numero[n]) {
					comprobacion = comprobacion + cadena.charAt(i);
				}
			}
		}
		if (cadena.equals(comprobacion)) {

			comprobacion = "son numeros";
		} else {

			comprobacion = "no son numeros";
		}
		return comprobacion;
	}
}
