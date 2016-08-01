package Cosas_Basicas;
public class CalcularDNI {

	public static void main(String[] args) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int DNI;
		DNI = 48408340;
		int letra = DNI % 23;

		System.out.println(letras.charAt(letra));

	}

}
