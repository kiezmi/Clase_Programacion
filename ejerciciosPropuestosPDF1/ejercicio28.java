package ejerciciosPropuestosPDF1;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int saldo = 0;
		int parcial = 0;
		// int b100 = 0;
		// int b50 = 0;
		// int b20 = 0;
		// int b10 = 0;
		// int b5 = 0;
		// int m2 = 0;
		// int m1 = 0;
		// int newsaldo = 0;

		int billetes[] = { 200, 100, 50, 20, 10, 5, 2, 1 };

		System.out.println("Introduzca cantidad");
		saldo = sc.nextInt();

		int veces = 0;

		while (veces < 8) {

			parcial = saldo / billetes[veces];
			saldo = (saldo % billetes[veces]);

			System.out.println("Cantidad de billetes de " + billetes[veces] + ": " + parcial);

			veces++;
		}

		// newsaldo = b200 * 200;
		// newsaldo = saldo - newsaldo;

		// b100 = newsaldo / 100;
		// System.out.println("Cantidad de billetes de 100 " + b100);
		// newsaldo = b100 * 100 + b200 * 200;
		// newsaldo = saldo - newsaldo;
		//
		// b50 = newsaldo / 50;
		// System.out.println("Cantidad de billetes de 50 " + b50);
		// newsaldo = b50 * 50 + b100 * 100 + b200 * 200;
		// newsaldo = saldo - newsaldo;
		//
		// b20 = newsaldo / 20;
		// System.out.println("Cantidad de billetes de 20 " + b20);
		// newsaldo = b20 * 20 + b50 * 50 + b100 * 100 + b200 * 200;
		// newsaldo = saldo - newsaldo;
		//
		// b10 = newsaldo / 10;
		// System.out.println("Cantidad de billetes de 10 " + b10);
		// newsaldo = b10 * 10 + b20 * 20 + b50 * 50 + b100 * 100 + b200 * 200;
		// newsaldo = saldo - newsaldo;
		//
		// b5 = newsaldo / 5;
		// System.out.println("Cantidad de billetes de 5 " + b5);
		// newsaldo = b5 * 5 + b10 * 10 + b20 * 20 + b50 * 50 + b100 * 100 +
		// b200 * 200;
		// newsaldo = saldo - newsaldo;
		//
		// m2 = newsaldo / 2;
		// System.out.println("Cantidad de monedas de 2 " + m2);
		// newsaldo = m2 * 2 + b5 * 5 + b10 * 10 + b20 * 20 + b50 * 50 + b100 *
		// 100 + b200 * 200;
		//
		// newsaldo = saldo - newsaldo;
		// m1 = newsaldo / 1;
		// System.out.println("Cantidad de monedas de 1 " + m1);
		// newsaldo = m1 * 1 + m2 * 2 + b5 * 5 + b10 * 10 + b20 * 20 + b50 * 50
		// + b100 * 100 + b200 * 200;
		// newsaldo = saldo - newsaldo;

	}

}
