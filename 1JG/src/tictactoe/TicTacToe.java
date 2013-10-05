package tictactoe;

import javax.swing.JOptionPane;

/**
 * Einfaches Konsolespiel TicTacToe
 * 
 * @author Walter Rafeiner-Magor
 * 
 */
public class TicTacToe {
	private char[] gewinn;
	public static final int ROWS = 3; // Anzahl der Spalten=Reihen
	public static final char COMPUTER = '#'; // Zeichen des Computers
	public static final char HUMAN = 'o'; // Zeichen des Spielers
	public static final int SIZE = ROWS*ROWS; // Anzahl der Felder
	private boolean computerTurn; // wer ist gerade an der Reihe?

	/**
	 * Standardkonstruktor
	 */
	public TicTacToe() {
		gewinn = new char[SIZE];
	}

	/**
	 * Aktuelles Spielfeld ausgeben
	 */
	public void printStatus() {
		System.out.print("\n\t1\t2\t3");
		for (int i = 0; i < SIZE; i++) {
			if (i % ROWS == 0)
				System.out.print("\n" + ((i + 1) / ROWS + 1) + "\t" + gewinn[i]);
			else
				System.out.print("\t" + gewinn[i]);
		}
		System.out.println();
	}

	/**
	 * Testet obder Spieler mit dem Zeichen c bereits eine Gewinnerkonstellation
	 * erreicht hat
	 * 
	 * @param c
	 *            Zeichen des Spielers
	 * @return hat der Spieler bereits gewonnen?
	 */
	private boolean winner(char c) {
		boolean gewonnen = false;
		// Diagonale
		if (gewinn[0] == c && gewinn[4] == c && gewinn[8] == c)
			gewonnen = true;
		if (gewinn[2] == c && gewinn[4] == c && gewinn[6] == c)
			gewonnen = true;
		for (int i = 0; !gewonnen && i < ROWS; i++) {
			int a = i * ROWS; // Aktueller Zeile errechnen
			// Horizontaler Sieg
			if (gewinn[a] == c && gewinn[a + 1] == c && gewinn[a + 2] == c)
				gewonnen = true;
			// Vertikaler Sieg
			if (gewinn[i] == c && gewinn[i + ROWS] == c && gewinn[i + ROWS*2] == c)
				gewonnen = true;
		}

		return gewonnen;
	}

	/**
	 * Computer spielt
	 */
	private void playComputer() {
		boolean fieldSet = false;
		do {
			int newTip = (int) (Math.random() * SIZE);
			// Ist das gewaehlte Feld nicht mehr frei?
			fieldSet = setAField(newTip, COMPUTER);
		} while (!fieldSet);
	}
	/**
	 * menschlicher Spieler
	 */
	private void playHuman() {
		boolean fieldSet = false;
		do {
			int zeile = Integer.parseInt(JOptionPane
					.showInputDialog("Bitte ein neues Feld waehlen - Zeile: ")) - 1;
			int spalte = Integer
					.parseInt(JOptionPane
							.showInputDialog("Bitte ein neues Feld waehlen - Spalte: ")) - 1;
			int newTip = zeile * ROWS + spalte;
			fieldSet = setAField(newTip, HUMAN);
			if (!fieldSet) // Ist das gewaehlte Feld nicht mehr frei?
				JOptionPane.showMessageDialog(null,
						"Bitte ein freies Feld verwenden!");
		} while (!fieldSet);
	}
	/**
	 * Spiel initialisieren
	 */
	public void init() {
		for (int i = 0; i < SIZE; i++)
			gewinn[i] = ' ';
		// Wer beginnt?
		computerTurn=(Math.random()>0.5)?true:false;
		
		
		// Leeres Spielfeld ausgeben
		printStatus();
	}

	/**
	 * Wieviele Felder sind bereits besetzt?
	 * 
	 * @return Anzahl gespielter Felder
	 */
	private int elements() {
		int ret = SIZE;
		for (int i = 0; i < SIZE; i++)
			if (gewinn[i] == ' ')
				ret--;
		return ret;
	}

	/**
	 * Let's play
	 */
	public void play() {
		char zeichen=(computerTurn)?COMPUTER:HUMAN;
		
		while (elements() < SIZE && !winner(zeichen)) {
			// Spieler wechseln
			computerTurn = !computerTurn;
			if (computerTurn) {
				zeichen = COMPUTER;
				playComputer();
			} else {
				zeichen = HUMAN;
				playHuman();
			}
			this.printStatus();
		}
	}

	/**
	 * Das Ergbnis des Spiels ermitteln
	 */
	public void result() {
		System.out.print("\nDieses Spiel hat ");
		if (winner(COMPUTER))
			System.out.println("der Computer gewonnen");
		else if (winner(HUMAN))
			System.out.println("der menschliche Spieler gewonnen");
		else
			System.out.println("leider keinen Sieger!");
	}

	/**
	 * Setzt das übergebene Zeichen in das festgelegte Feld Falls dieses bereits
	 * besetzt ist, wird false zurückgegeben
	 * 
	 * @param field
	 *            wo soll das zeichen gesetzt werden
	 * @param zeichen
	 *            welches Zeichen soll gesetzt werden
	 * @return gesetzt
	 */
	private boolean setAField(int field, char zeichen) {
		if (gewinn[field] == ' ') { // Ist das gewaehlte Feld frei?
			gewinn[field] = zeichen;
			return true;
		}
		return false;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Test the game
		TicTacToe t = new TicTacToe();
		t.init();
		t.play();
		t.result();
	}

}
