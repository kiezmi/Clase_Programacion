package ejerciciosPropuestosPDF1;

import java.util.Scanner;

public class pasarGrados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double gradosCelsius = 0;
		double gradosFahrenheit = 0;
		int opcion = 0;
		double resultado = 0;
		do {
			System.out.println("====================================");
			System.out.println("Calculo de Grados (version 1.0)");
			System.out.println("====================================");
			System.out.println("Elija opcion deseada");
			System.out.println("1. Pasar de Celsius a Kelvin");
			System.out.println("2. Pasar de Kelvin a Celsius");
			System.out.println("====================================");
			opcion = sc.nextInt();

		} while (opcion >= 3 && opcion <=1);

		switch (opcion) {
		case 1:
			double celsius;
			System.out.println("introduzca Grados Celsius ");
			celsius = sc.nextDouble();
			resultado = celsius - 273.15;
			System.out.println("Resultado " + resultado+" º K");
			break;
		case 2:
			double kelvin;
			System.out.println("introduzca Grados Kelvin ");
			kelvin = sc.nextDouble();
			resultado = kelvin + 273.15;
			System.out.println("Resultado " + resultado+" º C");
			break;

		default:
			break;

		}
		System.out.println("Vuelva pronto =)");

	}

}
