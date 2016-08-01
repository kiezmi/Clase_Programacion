package Bucles;

public class contarpalabras {

	public static void main(String[] args) {

		String frase;
		int longitud;
		int indice;
		char letra;
		int num;

		frase = "Esto es una frase";
		longitud = frase.length();
		indice = 0;
		num = 1;

		while (indice < longitud) {
			letra = frase.charAt(indice);

			if (letra ==' ') {
				num++;

			}
			indice++;
		}

		System.out.println("Hay " + num + " palabras");
	}

}
