package hamster;

public class E146 extends HamsterKlasse {
	public static void main(String[] args) {
		int koerner; // Zähl Variable deklarisieren
		koerner = 0; // Zähl Variable initialisieren
		// solange vorne frei ist
		while (vornFrei() == true) {
			vor(); // nach vorne gehen
			// solange Korn da ist
			while (kornDa() == true) {
				nimm(); // Korn nehmen
				koerner = koerner + 1; // Den Wert um 1 erhöhen
			}

		}
		// Wenn der zaehler Wert größer gleich 10 ist
		if (koerner >= 10) {
			schreib("Ich habe 10 Körner!"); // Gibt eine Meldung aus
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			// solange vorne frei ist
			while (vornFrei() == true) {
				vor(); // nach vorne gehen
			}
			// solange ein Korn da ist
			while (maulLeer() == false) {
				gib(); // legt ein Korn hin
			}
		} else {
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			vor(); // einen Schritt nach vor
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			// solange vorne frei ist
			while (vornFrei() == true) {
				vor(); // nach vorne gehen
				// solange Korn da ist
				while (kornDa() == true) {
					nimm(); // Korn nehmen
				}
			}
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			linksUm(); // 90° nach links drehen
			vor(); // einen Schritt nach vor
			// solange das Maul leer ist
			while (maulLeer() == false) {
				gib(); // legt ein Korn hin

			}
		}
	}

}
