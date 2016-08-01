package Bucles;

import java.util.Scanner;

public class Pizarranumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero");
		int numero = sc.nextInt();
		int suma = 0;
		String operador = "";
		boolean signo = false;

		for (int i = 1; i <= numero; i++) {
			for (int n = 0; n < i; n++) {
				if (signo == true) {
					operador = "+";
				}
				suma = suma + i;
				System.out.print(operador + i);
				signo = true;

			}
		}
		System.out.print("=" + suma);
	}

}
