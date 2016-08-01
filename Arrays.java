package Arrays;

public class Arrays {

	public static void main(String[] args) {

		int size = 5;
		int[] vector = new int[size];

		for (int i = 0; i < vector.length; i++) {
			vector[i]=i;
			System.out.print(vector[i]+" ");
		}

		System.out.print(vector.length);

	}

}
