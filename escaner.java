package Cosas_Basicas;
import java.util.Scanner;

public class escaner {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		int num1;
		int resultado;
		int suma;
		suma = 0;
		resultado = 0;

		while (suma < 10) {
			System.out.print("Introduzca sumando : ");
			num1 = sc1.nextInt();
			suma = suma + 1;
			resultado = num1 + resultado;
		}
		System.out.println("El resultado es: " + resultado);
	}
}
