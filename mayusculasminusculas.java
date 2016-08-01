package Cosas_Basicas;

public class mayusculasminusculas {

	public static void main(String[] args) {

		String palabra;
		int longitud;
		int indice;
		char letra;
		int num;
		int num2;

		palabra = "PAlabra";
		longitud = palabra.length() - 1;
		indice = 0;
		num = 0;
		num2 = 0;

			while (indice <= longitud) {
				letra = palabra.charAt(indice);

					if (letra >= 'a' && letra <= 'z') {
							num++;

					}
					if (letra >= 'A' && letra <= 'Z') {
							num2++;
					}
				indice++;
			}
			
		System.out.println("Hay " + num + " Minusculas");
		System.out.println("Hay " + num2 + " Mayusculas");

	}

}
