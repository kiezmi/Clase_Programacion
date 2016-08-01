package Cosas_Basicas;
public class ecuacion2ºgrado {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double x;
		double y;

		a = 2;
		b = 10;
		c = 5;

		if (a == 0) {
			x = c / b;
			System.out.println("no es de segundo grado");
			System.out.println(x);
		} else {
			
			x = ((-b) + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
			y = ((-b) - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);

			System.out.println("x= " + x);
			System.out.println("y= " + y);
		}
	}

}
