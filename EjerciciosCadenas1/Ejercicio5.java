package EjerciciosCadenas1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
//		Escribe la función “Contiene” a la que le pasamos una cadena y un carácter por 
//		parámetro y nos dice si el carácter aparece en la cadena o no. Es igual que la función 
//		Contains. Evidentemente, no podéis usar esta función para hacer la vuestra.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduzca caracter");
		char caracter= sc.next().charAt(0);
		
		
		System.out.print(Contiene(cadena,caracter));
		
	}

	public static boolean Contiene(String cadena, char caracter) {
		
		boolean contiene=false;
		
		for(int i=0;i<cadena.length();i++){
			if(caracter==cadena.charAt(i)){
				contiene=true;
				
			}
			
		}
		return contiene;
		

	}

}
