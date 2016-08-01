package Cosas_Basicas;
public class Multiplicar {

	public static void main(String[] args) {

		int multiplicador;
		int num;
		int resultado;
		int tabla;

		tabla = 1;
		num = 1;
		multiplicador = 1;

		while (tabla <= 10) {
			
			while (num <= 10) {
				resultado = num * multiplicador;
				System.out.println(num + " X " + multiplicador + " = " + resultado);
				num = num + 1;
			}
			
			tabla = tabla + 1;
			multiplicador=tabla;
			num=1;
			System.out.println(".......");
			
		}

	}
}