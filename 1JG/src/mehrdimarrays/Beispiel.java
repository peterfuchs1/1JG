package mehrdimarrays;

public class Beispiel {
	/* Tabelle mit Elementen vom Typ double mit 20 Zeilen und 10 Spalten */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beispiel b = new Beispiel();
		// TODO Auto-generated method stub

		double tabelle[][] = { { 4, 7, 2 }, { 8, 5, 3, 1 }, { 6, 9 },
				{ 3, 6, 4 } };

		double zeile[] = tabelle[1];

		tabelle[0][0] = 4.34;

		/*
		 * vierdimensionales Array, wobei die ersten drei Dimensionen bekannt
		 * sind
		 */
		int matrix[][][][] = new int[1][11][12][];
		/*
		 * Initialisierung eines Feldes der vierten Dimension, wobei der Index
		 * der ersten drei Dimensionen 0 ist
		 */
		matrix[0][0][0] = new int[10];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				for (int k = 0; k < matrix[i][j].length; k++)
					/* Initialisierung eines Feldes der vierten Dimension */
					matrix[i][j][k] = new int[10];

	}

}
