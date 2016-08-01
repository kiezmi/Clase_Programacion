package Bucles;

public class asteriscos {

	public static void main(String[] args) {

		String nombre;
		int longitud;
		char letra;
		int indice;

		nombre = "Enrique";
		longitud = nombre.length() - 1;
		indice = 0;

		while (indice <= longitud) {
			letra = nombre.charAt(indice);
			
			switch (letra) {

			case 'a':
				letra='*';
				break;
			case 'e':
				letra='*';
				break;
			case 'i':
				letra='*';
				break;
			case 'o':
				letra='*';
				break;
			case 'u':
				letra='*';
				break;
			case 'A':
				letra='*';
				break;
			case 'E':
				letra='*';

				break;
			case 'I':
				letra='*';
				break;
			case 'O':
				letra='*';
				break;
			case 'U':
				letra='*';
				break;

			}
			System.out.print(letra);
			indice++;
		}

	}

}
