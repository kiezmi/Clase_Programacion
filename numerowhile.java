package Bucles;

public class numerowhile {

	public static void main(String[] args) {

		int numero;
		int fila;

		
		fila = 1;
//filas
		while (fila <= 10) {
			int numerofila;
			numerofila = fila;
			numero = 1;
//columnas
			while (numerofila > 0) {
				System.out.print(numero);
				numerofila--;
				numero++;
			}
			System.out.println();
			fila = fila + 1;
		}
	}
}
