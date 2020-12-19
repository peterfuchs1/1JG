package hamster;

public class G146 extends HamsterKlasse {
	public static void main(String[] args) {
		int anzahlKoerner; // Z�hlvariable deklarieren
		int felder; // Z�hlvariable deklarieren
		anzahlKoerner = 0; // Z�hlvariable initialisieren
		felder = 0; // Z�hl Variable intialisieren
		while(vornFrei() == true) { // solange vorne frei ist
			vor(); // einen Schritt nach vor
			anzahlKoerner = anzahlKoerner + koernerAmFeld(); // koernerAmFeld Methode aufrufen und anzahlKoerner addieren	
			felder = felder + 1; // Zur Variable 1 hinzuf�gen
		}
		double  durchschnittergebnis; // Z�hl Variable deklarieren
	    durchschnittergebnis = durchschnitt(anzahlKoerner,felder); // Durchschnitt Methode aufrufen und durchschnittergebnis intialisieren 
		schreib("Der Durchschnitt lautet " + durchschnittergebnis + " K�rner pro Feld"); // Durchschnitt wird angezeigt 	
	}

	/**
	 * K�rner an einem Feld aufsammeln
	 * Z�hlen wie viele an einem Feld sind
	 * Alle K�rner wieder hinlegen
	 * @return Anzahl der K�rner auf einem Feld
	 */
	static int koernerAmFeld() {
		int koerner; // K�rner Variable intialisieren
		koerner = 0; // K�rner Variable deklarieren
		while(kornDa() == true) { // solange ein Korn da ist
			nimm(); // Korn nehmen
		}
		while(maulLeer() == false) { // Solange das Maul nicht leer ist
			gib(); // Ein Korn hinlegen
			koerner = koerner + 1; // Zur K�rnervariable 1 hinzuf�gen
		}
		return koerner; // K�rner Wert zur�ckgeben
	}

	/**
	 * Den Durchscnitt berechnen
	 * @param Anzahl der K�rner auf jedem Feld
	 * @param Anzahl der Felder
	 * @return Die Anzahl der K�rner durch die Anzahl der Felder
	 */		
	static double durchschnitt(int anzahlKoerner, int felder) {
		double ergebnis=anzahlKoerner; // Z�hl Variable intialisieren 
		ergebnis = ergebnis / felder; // anzahl K�rner durch felder rechnen
		return ergebnis; // Wert von ergebnis zur�ckgeben
	} 
}
