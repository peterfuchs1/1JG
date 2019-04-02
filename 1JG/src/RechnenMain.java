/**
 * Rechen mit Klassen
 * 
 * @author walter rafeiner-magor
 * @version 2019-03-15
 */
public class RechnenMain {
	/**
	 * Die Antwort auf alle Fragen lautet?
	 * 
	 * @return 42
	 */
	public static int dieAntwort() {
		return 42;
	}
	
	/**
	 * Startmethode
	 * 
	 * @param args Commandline-Argumente
	 */
	public static void main(String[] args) {
		// Aufruf einer Klassenmethode (eigene Klasse)
		System.out.println("Die Antwort auf alle Fragen lautet: "
		+RechnenMain.dieAntwort());	
		
		// Aufruf einer "fremden" Klassenmethode
		int zahl= Rechnen.quadratZahl();
		System.out.println("Die Quadratzahl lautet "+zahl);
		
	}

}
