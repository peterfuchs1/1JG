/**
 * 
 */
package rw;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Beispiel fuer:
 * Kompetenzbereich: strukturierte Programmierung
 * ** Datentypen (Ganzzahl, Gleitkommazahl und String)
 * ** Literale
 * ** kopf- und fußgesteuerte Schleifen
 * ** Verzweigung
 * ** Arrays
 * 
 * Kompetenzbereich: Algorithmen und Datenstrukturen
 * ** Variablen und Konstanten 
 * @author Walter Rafeiner-Magor
 * @version 29.06.2015
 *
 */

public class Rechnung4 {

	@SuppressWarnings("unused")
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
		String artikeln[] ={"USB-Stick 16GB  ","SDD 512GB       ","LED-Display 20\" ",
							"USB-Tastatur    ","USB-Maus        "};
		double kosten[] ={19.9, 219.9, 199.99, 9.99, 3.99};
		int anzahlen[]=new int[ANZAHL_ARTIKEL]; 
		Arrays.fill(anzahlen, 0);

		int zeile = 1;
		int seite = 1;
		
	// Artikel einlesen
		int artikelZaehler = 1;
		int anzahl = 0;
		for (int i=0;anzahl>=0 && i<ANZAHL_ARTIKEL;i++){
			String message=artikeln[i]+" Kosten pro Stuek: "+kosten[i];
			anzahl=Integer.parseInt(JOptionPane.showInputDialog(null,message,"Wieviele Artikel wollen Sie kaufen?",JOptionPane.PLAIN_MESSAGE));
			anzahlen[i] = (anzahl>=0)?anzahl:0;
		}
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
		for (int i = 0;i< ANZAHL_ARTIKEL; i++){
			if(anzahlen[i]>0){
				gesamt=anzahlen[i]*kosten[i];
				System.out.println(artikeln[i]+"  "+anzahlen[i]+ " Stk   x "+kosten[i]+" = "+gesamt);
				zeile += 1;
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
}
