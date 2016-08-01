package Cosas_Basicas;
public class cambionombre {

	public static void main(String[] args) {
		String nombre;
		nombre = "Enrique";

		String cifrado;
		cifrado = "";

		int longitud = nombre.length() - 1;

		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;
		cifrado = cifrado + nombre.charAt(longitud);
		longitud--;

		System.out.println(cifrado);

	}

}
