/**
 * 
 */
package strings;

/**
 * @author uhs374h
 * @version 2016-03-13
 *
 */
public class Umwandlung {
	public static void main(String[] args) {
		// Ganzzahlige Typenumwandlungen
		byte b = Byte.parseByte("12");
		short s = Short.parseShort("254");
		int i = Integer.parseInt("4096");
		long l = Long.parseLong("3000000000");
		// Fliesskommazahlen
		float f= Float.parseFloat("1234.5687");
		double d = Double.parseDouble("12345678.987654");
		// Wahrheitswerte
		boolean b1 = Boolean.parseBoolean("true");
		boolean b2 = Boolean.parseBoolean("FALSE");
		
		System.out.println("Variable mit ganzzahligen Datentypen:");
		System.out.println("byte: "+b);
		System.out.println("short: "+s);
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println();
		System.out.println("Variable mit Fliesskomma-Datentypen:");
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println();
		System.out.println("Variable mit Wahrheitswerten:");
		System.out.println("boolean: "+b1);
		System.out.println("boolean: "+b2);
	}
}
