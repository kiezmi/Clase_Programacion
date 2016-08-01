package Juegos;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		int numFilas = 3;
		int numColumnas = 3;
		int jugador = 0;
		boolean finPardida = false;
		int numTiros=0;

		int[][] vMatriz = new int[numFilas][numColumnas];

		Scanner sc = new Scanner(System.in);

		while (finPardida != true) {
			// imprimir
			System.out.println("â•”â•?â•¦â•?â•¦â•?â•—");
			for (int f = 0; f < numFilas; f++) {
				for (int c = 0; c < numColumnas; c++) {
					System.out.print("â•‘");
					char ficha;
					switch (vMatriz[f][c]) {
					case 1:
						ficha = 'X';						
						break;
					case 2:
						ficha = 'O';						
						break;
					default:
						ficha = ' ';
						break;
					}
					System.out.print(ficha);
				}
				System.out.print("â•‘");
				System.out.println();
				if (f < numFilas - 1) {
					System.out.println("â• â•?â•¬â•?â•¬â•?â•£");
				}
			}
			System.out.println("â•šâ•?â•©â•?â•©â•?â•?");

			if (jugador != 1){
				jugador=1;
			}else{
				jugador=2;
			}
			//pregunta
			System.out.println("Jugador: "+jugador);
			System.out.println("Dime tu jugada f:");
			int fila = sc.nextInt();
			System.out.println("Dime tu jugada c:");
			int columna = sc.nextInt();
			
			vMatriz[fila][columna] = jugador;
			
			numTiros++;			
			if (numTiros >= 9){
				finPardida=true;				
			}
		}
	}

}
