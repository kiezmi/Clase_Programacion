package Cosas_Basicas;
import java.util.*;
import java.util.Scanner;

public class matricesarrayejemplo {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);
		int m, n;
		int Menor, Mayor;

		System.out.print("Ingrese Cantidad Filas : ");
		m = lectura.nextInt();

		System.out.print("Ingrese Cantidad Columnas : ");
		n = lectura.nextInt();

		int Arreglo[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			System.out.println("Ingrese fila " + i + " Fila : ");
			for (int j = 0; j < n; j++) {
				Arreglo[i][j] = lectura.nextInt();
			}
		}
		// Inicializamos Mayor y Menor
		Mayor = Arreglo[0][0];
		Menor = Arreglo[0][0];

		// Determinar el mayor y el menor
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// determinar el menor
				if (Menor > Arreglo[i][j])
					Menor = Arreglo[i][j];
				// determinar el mayor
				if (Mayor < Arreglo[i][j])
					Mayor = Arreglo[i][j];
			}
		}
		// Mostrar los resulados
		System.out.println("El Mayor es : " + Mayor);
		System.out.println("El Menor es : " + Menor);

	}
}
