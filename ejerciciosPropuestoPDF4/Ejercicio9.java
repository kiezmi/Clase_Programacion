package ejerciciosPropuestoPDF4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numFilas = 4;
		int numColumnas = 4;
		String[][] vPalabra = new String[numFilas][numColumnas];
		String palabra = " ";
		System.out.print("Introduzca palabra ");
		palabra = sc.next();

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vPalabra[f][c] = palabra;
			}
		}

		// imprimir
		for (int f = 0; f < numFilas; f++) {

			for (int c = 0; c < numColumnas; c++) {
				if (vPalabra[f][c] == null) {

				} else {
					System.out.print(vPalabra[f][c]);
				}
			}
			System.out.println();
		}

	}

}
