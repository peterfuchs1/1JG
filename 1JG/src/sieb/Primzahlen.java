/**
 * 
 */
package sieb;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class Primzahlen {
	private boolean[] isPrim;
	public static final int LAENGE_MAX = 1000;

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Primzahlen p = new Primzahlen(700000000);
		long start=System.currentTimeMillis();
		p.berechnen();
		long dauer=System.currentTimeMillis()-start;
		//p.ausgabe();
		System.out.println("Die Dauer betraegt :"+dauer/1000.0+"sec");

	}

	/**
	 * 
	 */
	public Primzahlen() {
		this(LAENGE_MAX);
	}

	public Primzahlen(int laengeMax) {
		isPrim = new boolean[laengeMax];
	}

	/**
	 * @param array
	 */
	public Primzahlen(boolean[] array) {
		this.isPrim = array;
	}

	/**
	 * initialisieren und Primzahlen berechnen
	 */
	public void berechnen() {
		int size = isPrim.length - 1;
		for (int i = 2; i<=size; i++) { // mit true initialisieren
			if(i%2!=0)
				isPrim[i] = true;
		}

		isPrim[0] = isPrim[1] = false; 		
		isPrim[2]=true;
		size = (int) Math.sqrt(isPrim.length);
	
		for (int i = 3; i < size; i++) {
			if (isPrim[i])
				for (int j = i * i; j < isPrim.length; j += i) {
//				for (int j = i ; j < isPrim.length; j += i) {
					isPrim[j] = false;
				}
		}

	}

	/**
	 * Ausgabe
	 */
	public void ausgabe() {
		int anzahl = 0;
		for (int i = 2; i < isPrim.length; i++)
			if (isPrim[i]) {
				anzahl++;
				if (anzahl % 10 == 0)
					System.out.println();
				System.out.print(i + ", ");

			}
	}

	/**
	 * @return the array
	 */
	public boolean[] getArray() {
		return isPrim;
	}

	/**
	 * @param array
	 *            the array to set
	 */
	public void setIsPrim(boolean[] array) {
		this.isPrim = array;
	}

}
