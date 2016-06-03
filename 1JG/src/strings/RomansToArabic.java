package strings;

import javax.swing.*;

/**
 * Beschreiben Sie hier die Klasse RomansToArabic.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RomansToArabic {
	private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	/**
	 * main-Methode: Wird beim Start verwendet
	 * 
	 * @param args
	 *            Argumente, welche beim Start mitgegeben wurden
	 */
	public static void main(String[] args) {
		int zahl = 0;
		String eingabe;
		int ausgabe;
		do {
			eingabe = JOptionPane
					.showInputDialog("Roemische Zahlen: Gib eine Roemische Zahl zwischen I und MMMCM ein:");
		} while (!validate(eingabe));
		ausgabe = toInt(eingabe);
		System.out.println("Hallo, deine Zahl lautet: " + ausgabe);
	}

	/**
	 * wandelt eine int zahl in eine roemische Zahl als String um
	 * 
	 * @param zahl
	 *            arabische Zahl, die in eine roemische umgewandelt
	 * @return roemische Zahl
	 */
	public static int toInt(String r) {
		// Return the standard representation of this Roman numeral.

		int value = 0;
		while (r.length() > 0) {
			int l = 0;
			for (int i = 0; i < letters.length; i++) {
				l = letters[i].length();
				if (l > r.length())
					continue;
				String letter = r.substring(0, l);
				String m = letters[i];
				if(m.equals(letter)){
					value+=numbers[i];
					break;
				}
			}
			r = r.substring(l);
		}		
		return value;
	}

	/**
	 * Methode validate
	 *
	 * @param r
	 *            Ein Roman-String
	 * @return correct value?
	 */
	public static boolean validate(String r) {
		boolean ret = false;
		boolean correct = true;
		while (r.length() > 0) {
			correct = false;
			int l = 0;
			for (int i = 0; i < letters.length && !correct; i++) {
				l = letters[i].length();
				if (l > r.length())
					continue;
				String letter = r.substring(0, l);
				String m = letters[i];
				correct = m.equals(letter);
			}
			if (!correct)
				return false;
			r = r.substring(l);
		}
		return true;
	}
}