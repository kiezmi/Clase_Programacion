package Cosas_Basicas;
import java.util.Scanner;

public class operacionesBasicas4 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		suma = 0;
		resta = 0;
		multiplicacion = 0;
		division = 0;

		System.out.print("Introduzca 1º numero : ");
		num1 = sc1.nextInt();
		System.out.print("Introduzca 2º numero : ");
		num2 = sc2.nextInt();

		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;

		System.out.println("El resultado es: " + suma);
		System.out.println("El resultado es: " + resta);
		System.out.println("El resultado es: " + multiplicacion);
		System.out.println("El resultado es: " + division);

	}

}
