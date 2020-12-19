package hamster;

public class G146 extends HamsterKlasse {
	public static void main(String[] args) {
		int anzahlKoerner; // Zählvariable deklarieren
		int felder; // Zählvariable deklarieren
		anzahlKoerner = 0; // Zählvariable initialisieren
		felder = 0; // Zähl Variable intialisieren
		while(vornFrei() == true) { // solange vorne frei ist
			vor(); // einen Schritt nach vor
			anzahlKoerner = anzahlKoerner + koernerAmFeld(); // koernerAmFeld Methode aufrufen und anzahlKoerner addieren	
			felder = felder + 1; // Zur Variable 1 hinzufügen
		}
		double  durchschnittergebnis; // Zähl Variable deklarieren
	    durchschnittergebnis = durchschnitt(anzahlKoerner,felder); // Durchschnitt Methode aufrufen und durchschnittergebnis intialisieren 
		schreib("Der Durchschnitt lautet " + durchschnittergebnis + " Körner pro Feld"); // Durchschnitt wird angezeigt 	
	}

	/**
	 * Körner an einem Feld aufsammeln
	 * Zählen wie viele an einem Feld sind
	 * Alle Körner wieder hinlegen
	 * @return Anzahl der Körner auf einem Feld
	 */
	static int koernerAmFeld() {
		int koerner; // Körner Variable intialisieren
		koerner = 0; // Körner Variable deklarieren
		while(kornDa() == true) { // solange ein Korn da ist
			nimm(); // Korn nehmen
		}
		while(maulLeer() == false) { // Solange das Maul nicht leer ist
			gib(); // Ein Korn hinlegen
			koerner = koerner + 1; // Zur Körnervariable 1 hinzufügen
		}
		return koerner; // Körner Wert zurückgeben
	}

	/**
	 * Den Durchscnitt berechnen
	 * @param Anzahl der Körner auf jedem Feld
	 * @param Anzahl der Felder
	 * @return Die Anzahl der Körner durch die Anzahl der Felder
	 */		
	static double durchschnitt(int anzahlKoerner, int felder) {
		double ergebnis=anzahlKoerner; // Zähl Variable intialisieren 
		ergebnis = ergebnis / felder; // anzahl Körner durch felder rechnen
		return ergebnis; // Wert von ergebnis zurückgeben
	} 
}
