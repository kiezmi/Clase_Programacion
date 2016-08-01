package Arrays;

public class matrices {

	public static void main(String[] args) {

		int numFilas = 3;
		int numColumnas = 3;
		int[][] vMatriz = new int[numFilas][numColumnas];

		// Rellenar matriz

		int num = 1;

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vMatriz[f][c] = num;
				num++;

			}

		}

		// Imprimir la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				System.out.print(vMatriz[f][c]);

			}
			System.out.println();
		}

	}

}
