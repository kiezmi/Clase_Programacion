package Cosas_Basicas;
public class Ejercicio3 {

	public static void main(String[] args) {

		int antiguedad;
		int distancia;
		int sueldo;
		antiguedad = 10;
		distancia = 22;
		sueldo = 60;

		int sueldo2;
		int sueldo3;
		sueldo2 = 0;
		sueldo3 = 0;

		if (antiguedad < 5) {
			sueldo = 60;
		} else if (antiguedad <= 10) {
			int diferencia = antiguedad - 5;
			sueldo = sueldo + diferencia * 10;
			sueldo2 = sueldo;
			
		} else
			sueldo2 = 120;

		if (distancia <= 20) {
			sueldo3 = 0;

		} else {

			distancia = distancia * 1;
			sueldo3 = distancia;
			
		}
		sueldo2 = sueldo;
		System.out.println("Cobraras " + sueldo2 + "€ de antiguedad y " + sueldo3 + "€ de distancia");
		System.out.print("Total ");
		System.out.println(sueldo2 + sueldo3+"€");
	}

}
