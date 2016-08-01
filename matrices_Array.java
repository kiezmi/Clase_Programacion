package Arrays;
import java.util.Scanner;

public class matrices_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numFilas = 3;
		int numColumnas = 2;
		String[][] vPersona = new String[numFilas][numColumnas];

		// RELLENAR MATRIZ

		for (int f = 0; f < numFilas; f++) {

			System.out.print("Introduzca nombre: ");
			vPersona[f][0] = sc.next();
			System.out.print("Introduzca edad: ");
			vPersona[f][1] = sc.next();

		}

		int Menor, Mayor;

		int suma = 0;
		double media = 0;
		for (int f = 0; f < numFilas; f++) {
			suma = suma + Integer.parseInt(vPersona[f][1]);
			media = suma / numFilas;
		}

		// Inicializamos Mayor y Menor
		Mayor = Integer.parseInt(vPersona[0][1]);
		Menor = Integer.parseInt(vPersona[0][1]);

		// Determinar el mayor y el menor
		for (int i = 0; i < numFilas; i++) {
			// determinar el menor
			if (Menor > Integer.parseInt(vPersona[i][1])){
				Menor = Integer.parseInt(vPersona[i][1]);
			}

			// determinar el mayor
			if (Mayor < Integer.parseInt(vPersona[i][1])){
				Mayor = Integer.parseInt(vPersona[i][1]);
			}	
		}
		System.out.println("-------------------------------------------");
		// IMPRIMIR LA MATRIZ
		System.out.println("Nombre Edad");
		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				System.out.print(vPersona[f][c] + " ");
			}
			System.out.println();

		}
		// Mostrar los resulados
		System.out.println("-------------------------------------------");
		System.out.println("La media de edad es:" + media);
		System.out.println("-------------------------------------------");
		System.out.println("El Mayor es : " + Mayor);
		System.out.println("-------------------------------------------");
		System.out.println("El Menor es : " + Menor);
		System.out.println("-------------------------------------------");
	}
}
