package Bucles;

public class ejerciciocontar {

	public static void main(String[] args) {
		String palabra;
		int longitud;
		int indice;
		char letra;
		int num;

		palabra = "PAlabra";
		longitud = palabra.length() - 1;
		indice = 0;
		num = 0;

		while (indice <= longitud) {
			letra = palabra.charAt(indice);

			switch (letra) {

			case 'a':
				num++;
				break;
			case 'A':
				num++;
				break;
			default:
				break;

			}
			indice++;
		}
		System.out.print("hay "+num+" Vocales a/A");
	}

}
