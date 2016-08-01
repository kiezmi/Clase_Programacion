package Cosas_Basicas;
import java.util.Scanner;

public class funciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1;
		double num2;
		char operacion = ' ';
		double resultado = 0.0;

		System.out.print("Introduzca 1º numero : ");
		num1 = sc.nextDouble();

		System.out.print("Introduzca 2º numero : ");
		num2 = sc.nextDouble();

		System.out.print("Introduzca operacion ( + - * / ): ");
		operacion = sc.next().charAt(0);

		switch (operacion) {

		case '/':
			resultado = division(num1, num2);

			break;
		case '*':
			resultado = multiplicacion(num1, num2);

			break;
		case '-':
			resultado = resta(num1, num2);

			break;
		case '+':
			resultado = suma(num1, num2);

			break;

		default:
			break;
		}
		System.out.println("El resultado es: " + resultado);
	}

	// Funcion Suma
	public static double suma(double num1, double num2) {
		return num1 + num2;

	}

	// Funcion Resta
	public static double resta(double num1, double num2) {
		return num1 - num2;

	}

	// Funcion Multiplicacion
	public static double multiplicacion(double num1, double num2) {
		return num1 * num2;

	}

	// Funcion Division
	public static double division(double num1, double num2) {

		return num1 / num2;

	}
}
