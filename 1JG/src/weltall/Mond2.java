/**
 * 
 */
package weltall;

import javax.swing.JOptionPane;

/**
 * @author Walter Rafeiner-Magor
 * @version 29.06.2015
 *
 */

public class Mond2 {

	public static void main(String[] args) {
	//	Deklaration einer Konstante:
	//	Datentyp	Name der Variable ;
		final int	anzahlMonde;
	//	Initialisierung einer Konstanten mittel Zuweisungsoperator
		// ganzzahlige Literale sind vom Datentyp int
		anzahlMonde = 1;
	//	Deklaration und sofortige Initialisierung
	//	Datentyp	Name der Konstanten = Literal 
		final long mondBahnRadius;
		// ganzzahlige Literale mit L angestellt sind vom Datentyp long
		mondBahnRadius = 383100L;	// km
		
		final float	mondUmlaufZeit;
		// Flieﬂkommazahlen sind vom Datentyp double
		// auﬂer ein F wird an das Literal angefuegt
		mondUmlaufZeit = 27.3217F; // Tage
		
		final float	orbitalGeschwindigkeit = 1.023F; // km/s
		
		// Berechnung der Laenge der Mondumlaufbahn - Annaeherung
		// U = 2 * r * pi
		double mulb1 = 2 * mondBahnRadius * Math.PI;
		
		// Achtung die Konstante Math.PI ist vom Datentyp double
		// und muss deshalb (down)gecastet werden!
		float mulb2 = 2 * mondBahnRadius * (float)Math.PI;

	// Berechnung mittels Dauer und Geschwindigkeit
	// Vorerst wird in km/Tag umgerechnet
		double mulb3 = orbitalGeschwindigkeit * 3600 * 24 * mondUmlaufZeit;
		float mulb4 = orbitalGeschwindigkeit * 3600 * 24 * mondUmlaufZeit;
		
		System.out.println("Mond unser Trabant!");
		System.out.println("-------------------");
		System.out.println("Die Erde besitzt "+anzahlMonde+" Mond(e)!");
		System.out.println("Berechnung mittels Umlaufradius:");
		System.out.println("Mondumlaufbahn1 (double): "+mulb1+"km");
		System.out.println("Mondumlaufbahn2 (float): "+mulb2+"km");
		System.out.println("Berechnung mittels Umlaufzeit und Geschwindigkeit");
		System.out.println("Mondumlaufbahn3 (double): "+mulb3+"km");
		System.out.println("Mondumlaufbahn4 (float): "+mulb4+"km");
		
	}
}
