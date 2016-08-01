package Cosas_Basicas;

public class letras {

	public static void main(String[] args) {

		String nombre;
		int indiceletra;
		int longitud;
		char letra;
		
		indiceletra=0;
		nombre="enrique";
				
		longitud = nombre.length() - 1;
		
		
		while(indiceletra <= longitud){
			letra=nombre.charAt(indiceletra);
			letra=(char)(letra-32);
			System.out.print(letra);
			indiceletra++;
			
		}
		
		
		

	}

}
