package ejerciciosPropuestosPDF1;

import java.util.Scanner;

public class ejercicio1pdf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Marque hora: ");
		int hora = sc.nextInt();
		System.out.println("Marque minuto: ");
		int minutos = sc.nextInt();

		int sumaMinutos = hora * 60 + minutos;

		if (sumaMinutos >= 6 * 60 && sumaMinutos <= 11 * 60 + 59) {
			System.out.println("Buenos dias");
		}
		if (sumaMinutos >= 12 * 60 && sumaMinutos <= 19 * 60) {
			System.out.println("Buenos tardes");
		}
		if (sumaMinutos >= 19 * 60 + 1 || sumaMinutos <= 5 * 60 + 59) {
			System.out.println("Buenos noches");
		}

	}

}
