package Arrays;

public class vectorNumerosReves {

	public static void main(String[] args) {

		int[] vNumero = new int[10];

		for (int i =0; i <vNumero.length; i++) {
			vNumero[i] = 10-i ;
			
			System.out.println(vNumero[i]);
		}

	}

}
