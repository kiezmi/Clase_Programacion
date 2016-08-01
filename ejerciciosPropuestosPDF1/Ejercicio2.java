package ejerciciosPropuestosPDF1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		double lado = 0;
		double pi = Math.PI;
		double radio = 0;
		double base = 0;
		double altura = 0;
		double base2 = 0;
		double resultado = 0;

		do {
			System.out.println("====================================");
			System.out.println("Calculo de Superficies (version 1.0)");
			System.out.println("====================================");
			System.out.println("1. Cuadrado lado*lado");
			System.out.println("2. Circulo pi*radio*raio");
			System.out.println("3. Rectangulo base*altura");
			System.out.println("4. Trapecio (base1+base2)*altura/2");
			System.out.println("5. Triangulo (base*altura)/2");
			System.out.println("====================================");
			opcion = sc.nextInt();
		} while (opcion >= 6);

		switch (opcion) {
		case 1:
			System.out.println("introduzca datos del lado");
			lado = sc.nextDouble();
			resultado = lado * lado;
			System.out.println("Resultado " + resultado);
			break;
		case 2:

			System.out.println("Introduzca datos del radio");
			radio = sc.nextDouble();
			resultado = radio * radio * pi;
			System.out.println("Resultado " + resultado);
			break;
		case 3:
			System.out.println("introduzca datos de la base");
			base = sc.nextDouble();
			System.out.println("introduzca datos de la altura");
			altura = sc.nextDouble();
			resultado = base * altura;
			System.out.println("Resultado " + resultado);
			break;
		case 4:
			System.out.println("introduzca datos de la base");
			base = sc.nextDouble();
			System.out.println("introduzca datos de la base2");
			base2 = sc.nextDouble();
			System.out.println("introduzca datos de la altura");
			altura = sc.nextDouble();
			resultado = (base + base2) * altura / 2;
			System.out.println("Resultado " + resultado);
			break;
		case 5:
			System.out.println("introduzca datos de la base");
			base = sc.nextDouble();
			System.out.println("introduzca datos de la altura");
			altura = sc.nextDouble();
			resultado = (base * altura) / 2;
			System.out.println("Resultado " + resultado);
			break;
		default:
			break;

		}
		System.out.println("Vuelva pronto =)");

	}

}
