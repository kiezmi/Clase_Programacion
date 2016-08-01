package Arrays;

public class matrices2 {

	public static void main(String[] args) {

		int numFilas = 2;
		int numColumnas = 2;
		int[][] vMatriz = new int[numFilas][numColumnas];

		// Rellenar matriz

		int num = 4;

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				vMatriz[f][c] = num;
				num--;

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
