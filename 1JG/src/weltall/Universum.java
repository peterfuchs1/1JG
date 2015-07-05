/**
 * 
 */
package weltall;

/**
 * Beispiel fuer:
 * Kompetenzbereich: strukturierte Programmierung
 * ** Datentypen (Ganzzahl und Gleitkommazahl)
 * ** Literale
 * 
 * Kompetenzbereich: Algorithmen und Datenstrukturen
 * ** Variablen und Konstanten 
 * @author Walter Rafeiner-Magor
 * @version 05.07.2015
 *
 */
public class Universum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Deklaration einer Variable:
	// Datentyp und	Name der Variable ;		
		int radius;
	// Initialisierung einer Variablen mittel Zuweisungsoperator
	// ganzzahlige Literale sind vom Datentyp int
		radius = 45; // Millarden Lichtjahre
	// Deklaration und sofortige Initialisierung
	// Datentyp	 der Variable ist mit Datentyp des Literals ident
		double masse = 1e53; // kg
	// Deklaration und sofortige Initialisierung
	// Datentyp	 der Variable ist mit Datentyp des Literals ident
		float dichte = 4.7e-30F; // g/cm³
		
	// Deklaration und sofortige Initialisierung
	// Datentyp	 der Variable ist mit Datentyp des Literals ident
		float alterMittelwert = 13.8F; // Milliarden Jahre
		float delta = 0.04F;
	
		System.out.println("Unser Universum ist einzigartig!");
		System.out.println("--------------------------------");
		System.out.println("Es hat einen Durchmesser von mehr als "+radius+" Mrd Lichtjahre!");
		System.out.println("Die sichtbare Masse betraegt: "+masse+"kg");
		System.out.println("Die Dichte betraegt: "+dichte+"g/cm³");
		System.out.println("Das Mindestalter des Universums betraegt "+(alterMittelwert-delta)+" Mrd Jahre");
		System.out.println("Das Mindestalter des Universums betraegt "+(alterMittelwert+delta)+" Mrd Jahre");

	}
}
