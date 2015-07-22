/**
 * 
 */
package rw;
/**
 * Beispiel fuer:
 * Kompetenzbereich: strukturierte Programmierung
 * ** Datentypen (Ganzzahl, Gleitkommazahl und String)
 * ** Literale
 * ** kopfgesteuerte Schleifen
 * 
 * Kompetenzbereich: Algorithmen und Datenstrukturen
 * ** Variablen und Konstanten 
 * @author Walter Rafeiner-Magor
 * @version 29.06.2015
 *
 */

public class Rechnung1 {

	public static void main(String[] args) {
	// Deklaration einer Konstante:
	// Datentyp	Name der Variable ;
		final String KOPF_ZELE;
	// ansonsten einfach:
		final String TO_DAY = "2015-09-23";
		final String UEBERSCHRIFT = "Artikel          Anzahl    Kosten      Summe";
		final String FUSS_ZEILE = "Seite ";
		final int ZEILEN = 80;
		
	// Initialisierung einer Konstanten mittel Zuweisungsoperator
	// ganzzahlige Literale sind vom Datentyp int
		KOPF_ZELE ="Rechnung der Fa. Mayer vom "+TO_DAY;

	// Variablen Deklaration und sofortige Initialisierung
		String artikel1 = "USB-Stick 16GB  ";
		String artikel2 = "SDD 512GB       ";
		double kosten1 = 11.90;
		double kosten2 = 319.99;
		int zeile = 1;
		int seite = 1;
		
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
		int anzahl1=(int)(Math.random()*10+1);
		int anzahl2=(int)(Math.random()*2+1);
		double gesamt1=anzahl1*kosten1;
		String ersterArtikel = artikel1+"  "+anzahl1+ " Stk   x "+kosten1+" = "+gesamt1;
		zeile += 1;
		System.out.println(ersterArtikel);
		double gesamt2 =anzahl2*kosten2;
		String zweiterArtikel = artikel2+"  "+anzahl2+ " Stk   x "+kosten2+" = "+gesamt2;
		zeile += 1;
		System.out.println(zweiterArtikel);
		double gesamt=gesamt1+gesamt2;
		String summe = "Gesamtsumme betraegt:                   "+gesamt;
		zeile += 1;
		System.out.println(summe);
		// Wir geben die Fusszeile an richtiger Stelle aus
		while (zeile < ZEILEN){
			System.out.println();
			zeile += 1;
		}
		System.out.println(FUSS_ZEILE+seite);
		
	}
}
