package Bucles;
import java.util.Scanner;

public class Eurovision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paises = 5;
		int[] vPuntuaciones = new int[paises];
		int puntuacion = 0;

		// Ejecutar

		for (int pais = 0; pais < vPuntuaciones.length; pais++) {
			System.out.println();
			System.out.println("Otorgue puntuacion");
			int nPuntuacion = sc.nextInt();

			// ordenar
			int indice = 0;
			while (indice < pais && vPuntuaciones[indice] < nPuntuacion) {
				indice++;
			}
			// el resto
			for (int resto = pais + 1; resto > indice; resto--) {
				vPuntuaciones[resto] = vPuntuaciones[resto - 1];

			}
			vPuntuaciones[indice] = nPuntuacion;

			// imprimir
			for (int a = 0; a < vPuntuaciones.length; a++) {
				System.out.print(vPuntuaciones[a] + " ");

			}
		}

	}
}
