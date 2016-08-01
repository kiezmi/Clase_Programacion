package Bucles;

import java.util.Scanner;

public class desglose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int parcial = 0;

		int unidad[] = {1000000,100000 ,10000,1000, 100, 10, 1 };
		String tipos[]={"millon","centenas de millar","Decenas de millar","unidades de millar","centenas","decenas","unidades"};

		System.out.println("Introduzca cantidad");
		numero = sc.nextInt();

		int veces = 0;

		while (veces < 7) {
			parcial = numero / unidad[veces];
			numero = (numero % unidad[veces]);

			System.out.println("Cantidad de " + tipos[veces] + ": " + parcial);

			veces++;
		}

	}

}
