package Arrays;

public class ejerciciosMatricesPizzara {

	public static void main(String[] args) {

		int numFilas = 3;
		int numColumnas = 3;
		int[][] vMatriz = new int[numFilas][numColumnas];

		// Rellenar matriz

		// 0 1 0
		// 1 0 1
		// 0 1 0

//		int num = 0;
//
//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				vMatriz[f][c] = num;
//				if (num % 2 == 0) {
//					num++;
//				} else {
//					num--;
//				}
//
//			}
//
//		}

		// 010
		// 305
		// 070
//		int num=0;
//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (num % 2 == 0) {
//					vMatriz[f][c] = 0;
//				} else {
//					vMatriz[f][c] = num;
//				}
//				num++;
//
//			}
//		}

		// 100
		// 010
		// 001
//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (f == c) {
//					vMatriz[f][c] = 1;
//		}
//	}
//}

		// 000
		// 111
		// 000

//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (f == 1) {
//					vMatriz[f][c] = 1;
//		}
//	}
//}

		// 010
		// 010
		// 010
//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (c == 1) {
//					vMatriz[f][c] = 1;
//				}
//			}
//		}

		// 001
		// 010
		// 100

//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (f + c == 2) {
//					vMatriz[f][c] = 1;
//
//				}
//			}
//
//		}

		// 101
		// 010
		// 101

//		for (int f = 0; f < numFilas; f++) {
//			for (int c = 0; c < numColumnas; c++) {
//				if (f + c == 2 || f == c) {
//					vMatriz[f][c] = 1;
//
//				}
//			}
//
//		}

		// Imprimir la matriz

		for (int f = 0; f < numFilas; f++) {
			for (int c = 0; c < numColumnas; c++) {
				System.out.print(vMatriz[f][c]);

			}
			System.out.println();
		}

	}

}
