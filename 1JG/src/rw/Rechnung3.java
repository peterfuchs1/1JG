/**
 * 
 */
package rw;

import javax.swing.JOptionPane;

/**
 * Beispiel fuer:
 * Kompetenzbereich: strukturierte Programmierung
 * ** Datentypen (Ganzzahl, Gleitkommazahl und String)
 * ** Literale
 * ** kopf- und fußgesteuerte Schleifen
 * ** Verzweigung
 * ** Methoden erstellen und verwenden
 * 
 * Kompetenzbereich: Algorithmen und Datenstrukturen
 * ** Variablen und Konstanten 
 * @author Walter Rafeiner-Magor
 * @version 29.06.2015
 *
 */

public class Rechnung3 {

	public static void main(String[] args) {
	// Deklaration einer Konstante:
	// Datentyp	Name der Variable ;
		final String KOPF_ZELE;
	// ansonsten einfach:
		final String TO_DAY = "2015-09-23";
		final String UEBERSCHRIFT = "Artikel          Anzahl    Kosten      Summe";
		final String FUSS_ZEILE = "Seite ";
		final int ZEILEN = 80;
		final int ANZAHL_ARTIKEL = 5;
	// Initialisierung einer Konstanten mittel Zuweisungsoperator
	// ganzzahlige Literale sind vom Datentyp int
		KOPF_ZELE ="Rechnung der Fa. Mayer vom "+TO_DAY;

	// Variablen Deklaration und sofortige Initialisierung
		String artikel1 = "USB-Stick 16GB  ";
		String artikel2 = "SDD 512GB       ";
		String artikel3 = "LED-Display 20\" ";
		String artikel4 = "USB-Tastatur    ";
		String artikel5 = "USB-Maus        ";
		double kosten1 = 19.9;
		double kosten2 = 219.9;
		double kosten3 = 199.99;
		double kosten4 = 9.99;
		double kosten5 = 3.99;
		int anzahl1 = 0;
		int anzahl2 = 0;
		int anzahl3 = 0;
		int anzahl4 = 0;
		int anzahl5 = 0;

		
		int zeile = 1;
		int seite = 1;
		
	// Artikel einlesen
		int artikelZaehler = 1;
		int anzahl = -1;
		do {
			String message;
			switch(artikelZaehler)
			{
			case 1: message=artikel1+" Kosten pro Stuek: "+kosten1; break;
			case 2: message=artikel2+" Kosten pro Stuek: "+kosten2; break;
			case 3: message=artikel3+" Kosten pro Stuek: "+kosten3; break;
			case 4: message=artikel4+" Kosten pro Stuek: "+kosten4; break;
			default: message=artikel5+" Kosten pro Stuek: "+kosten5; break;
			}
			anzahl=Integer.parseInt(JOptionPane.showInputDialog(null,message,"Wieviele Artikel wollen Sie kaufen?",JOptionPane.PLAIN_MESSAGE));
			if (anzahl >= 0)
				switch(artikelZaehler)
				{
				case 1: anzahl1=anzahl; break;
				case 2: anzahl2=anzahl; break;
				case 3: anzahl3=anzahl; break;
				case 4: anzahl4=anzahl; break;
				case 5: anzahl5=anzahl; break;
				}	
				artikelZaehler++;
		} while (anzahl >=0 && artikelZaehler <=5);
		// Rechnung erstellen
		// Wir starten mit der Kopfzeile
		System.out.println(KOPF_ZELE);
		zeile += 1;
		// Danach sind 3 Zeilen freizulassen
		while(zeile < 4){
			System.out.println();
			zeile += 1;
		}
		// Wir geben un die Ueberschrift aus:
		System.out.println(UEBERSCHRIFT);
		zeile += 1;
		double gesamtsumme = 0;
		double gesamt=0.0;
		// Artikelausgabe
		for (artikelZaehler = 1;artikelZaehler<= ANZAHL_ARTIKEL; artikelZaehler++){
			switch(artikelZaehler){
			case 1: gesamt=Rechnung3.artikelAusgabe(artikel1, anzahl1, kosten1); break;
			case 2: gesamt=Rechnung3.artikelAusgabe(artikel2, anzahl2, kosten2); break;
			case 3: gesamt=Rechnung3.artikelAusgabe(artikel3, anzahl3, kosten3); break;
			case 4: gesamt=Rechnung3.artikelAusgabe(artikel4, anzahl4, kosten4); break;
			case 5: gesamt=Rechnung3.artikelAusgabe(artikel5, anzahl5, kosten5); break;
			}
			if(gesamt!=0.0){
				zeile +=1;
				gesamtsumme +=gesamt;
			}
		}
		// Gesamtsumme ausgeben
		if (gesamtsumme > 0) {
			System.out.println("Gesamtsumme betraegt:                   "+gesamtsumme);
			zeile += 1;
		}
		// Wir geben die Fusszeile an richtiger Stelle aus
		while (zeile < ZEILEN){
			System.out.println();
			zeile += 1;
		}
		System.out.println(FUSS_ZEILE+seite);		
	}
	private static double artikelAusgabe(String beschreibung, int anzahl, double kosten){
		double gesamt = 0.0;
		if(anzahl >0){
			gesamt=anzahl*kosten;
			System.out.println(beschreibung+"  "+anzahl+ " Stk   x "+kosten+" = "+gesamt);
		}
		return gesamt;
	}
}
