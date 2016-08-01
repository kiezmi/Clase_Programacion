package EjerciciosCadenas2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Escribe la función “QuitaCaracter” a la que le pasamos una cadena y
		// un carácter y nos
		// devuelve la cadena pero con todas las ocurrencias de ese carácter quitadas. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduzca caracter a quitar");
		char caracter = sc.next().charAt(0);
	
		System.out.print(QuitaCaracter(cadena,caracter ));
	}

	

public static String QuitaCaracter(String cadena, char caracter ) {

	String nuevaCadena = "";

	for (int i = 0; i < cadena.length(); i++) {

		if (cadena.charAt(i) == caracter) {
			nuevaCadena = nuevaCadena;
		} else {
			nuevaCadena = nuevaCadena + cadena.charAt(i);
		}
	}
	return nuevaCadena;


	}

}
