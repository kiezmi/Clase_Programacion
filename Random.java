package Bucles;

public class Random {

	public static void main(String[] args) {

		int[] vRandom = new int[100];

		for (int i = 0; i < vRandom.length; i++) {
			vRandom[i] = (int) (Math.random() * 100);
		}

		int cuentacincos = 0;
		int cuentadiez = 0;

		for (int i = 0; i < vRandom.length; i++) {
			if (vRandom[i] == 5) {

				cuentacincos++;
			}
		
		if (vRandom[i] <= 10) {

			cuentadiez++;
		}
		}
		System.out.println("Hay "+cuentacincos+" Cinco/s");
		System.out.println("Hay "+cuentadiez+" menores de 10");
	}
}