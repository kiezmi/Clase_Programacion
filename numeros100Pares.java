package Cosas_Basicas;

public class numeros100Pares {

	public static void main(String[] args) {
		
		int pares;
		int []numeros= new int[100];
		pares=2;
		
		for(int i=0;i<numeros.length;i++){
			numeros[i]=numeros[i]+pares;
			pares=pares+2;
			
		}
		for(int i=0;i<numeros.length;i++){
			System.out.println(numeros[i]);
		}

	}

}
