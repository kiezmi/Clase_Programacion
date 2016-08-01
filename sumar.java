package Bucles;
public class sumar {

	public static void main(String[] args) {

		int num;
		int resultado;
		num = 1;
		resultado = 0;

		while (num <= 100) {

			resultado = resultado + num;
			num = num + 1;

		}
		System.out.println("La suma de los 100 primeros numeros es " + resultado);
	}

}
