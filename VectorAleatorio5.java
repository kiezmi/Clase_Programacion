package Arrays;

public class VectorAleatorio5 {

	public static void main(String[] args) {

		int size = 10;
		int[] vRandom = new int[size];

		for (int i = 0; i < vRandom.length; i++) {
			vRandom[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vRandom.length; i++) {
			System.out.print(vRandom[i] + " ");
		}
		System.out.println();

		int[] vRandom2 = new int[size];
		vRandom2 = vRandom;
		
		for (int i = vRandom2.length-1; i >= 0; i--) {
			System.out.print(vRandom2[i] + " ");
		}

	}

}
