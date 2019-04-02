import javax.swing.*;
/**
 * Rechenklasse zum Quadrieren einer Zahl
 * 
 * @author wrafeiner
 * @version 2019-03-15
 */
public class Rechnen {
	/**
	 * Quadratzahl: 
	 * Gib eine Zahl ein und errechne die Quadratzahl
	 * 
	 * @return quadratzahl
	 */
	public static int quadratZahl() {
		String s;
		// Eingabe eines Strings (Hoffentlich einer Zahl)
		s= JOptionPane.showInputDialog("Bitte eine Zahl eingeben:");
		int zahl = 0;
		// Hier kann etwas schiefgehen!
		try {
			// Es wird versucht den String in eine Zahl umzuwandeln!
			zahl = Integer.parseInt(s);
		}
		catch (NumberFormatException ne) {
			// Falls die Zahl nicht konvertierbar ist 
			System.out.println("Der String ["+s+
					"] konnte nicht in eine ganze Zahl umgewandelt werden");
		}
		// Die Quadratzahl wird berechnet
		zahl = zahl * zahl;
		// und zurueckgegeben
		return zahl;
	}
}
