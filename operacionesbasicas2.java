package Cosas_Basicas;
import java.util.Scanner;

public class operacionesbasicas2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		double num1;
		double num2;
		char operacion;
        double resultado;
		
		operacion = ' ';
		resultado = 0.0;
		

		System.out.print("Introduzca 1º numero : ");
		num1 = sc.nextDouble();

		System.out.print("Introduzca 2º numero : ");
		num2 = sc.nextDouble();

		System.out.print("Introduzca operacion ( + - * / ): ");
		operacion = sc.next().charAt(0);
		

		switch (operacion) {

		case '/':
			resultado = num1 / num2;
			
			break;
		case '*':
			resultado = num1 * num2;
			
			break;
		case '-':
			resultado = num1 - num2;
			
			break;
		case '+':
			resultado = num1 + num2;
			
			break;

		default:
			break;
		}
		System.out.println("El resultado es: " + resultado);
	}
}
