package Bucles;

public class bucleFor {

	public static void main(String[] args) {

		// for (int i = 0; i < 3; i = i + 1) {
		// System.out.println("rule #" + i);
		//
		// }

		int resultado;
		for (int Tabla = 0; Tabla <= 10; Tabla++) {
			System.out.println("Tabla del "+Tabla);
			for (int operando = 1; operando <= 10; operando++) {
				resultado = Tabla * operando;
				System.out.println(Tabla + "X" + operando + "=" + resultado);
			}

			System.out.println("-----------------------");

		}

	}

}
