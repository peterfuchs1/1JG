package baum;

public class Baum {
	public static void main(String[] args) {
		// Baumkrone zeichnen
		int hoehe = 4;
		for (int i = 0; i < hoehe; ++i) {
			for (int j = i; j < hoehe; ++j)
				System.out.print(" ");
			for (int k = 0; k <= 2 * i; ++k)
				System.out.print("*");
			System.out.println();
		}
		// Stamm zeichnen
		hoehe = 2;
		for (int i = 0; i < hoehe; ++i)
			System.out.println("   ***");
	}
}



