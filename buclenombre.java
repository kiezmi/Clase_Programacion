package Bucles;

public class buclenombre {

	public static void main(String[] args) {

		String nombre;
		String cifrado;
		int longitud;
		nombre = "ENRIQUE";
		cifrado = "";
		longitud = nombre.length() - 1;

		while (longitud >= 0) {

			cifrado = cifrado + nombre.charAt(longitud);
			longitud--;

		}

		System.out.println(cifrado);

	}

}
