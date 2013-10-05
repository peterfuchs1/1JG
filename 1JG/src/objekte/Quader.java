/**
 * 
 */
package objekte;

/**
 * @author Walter Rafeiner-Magor
 *
 */
public class Quader {
	private double laenge, breite, hoehe;

	/**
	 * Constructor
	 */
	public Quader() {
		this(0,0,0);
	}

	/**
	 * @param laenge
	 * @param hoehe
	 */
	public Quader(double laenge, double hoehe) {
		this(laenge,laenge,hoehe);
	}

	/**
	 * @param laenge
	 * @param breite
	 * @param hoehe
	 */
	public Quader(double laenge, double breite, double hoehe) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	/**
	 * Volumina of the cube
	 * @return volumina
	 */
	public double volumen(){
		return laenge*breite*hoehe;
	}
	/**
	 * 
	 * @return
	 */
	public double oberflaeche(){
		return(2*(laenge*breite+laenge*hoehe+hoehe*breite));
	}
	/**
	 * @return the laenge
	 */
	public double getLaenge() {
		return laenge;
	}

	/**
	 * @param laenge the laenge to set
	 */
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	/**
	 * @return the breit
	 */
	public double getBreite() {
		return breite;
	}

	/**
	 * @param breit the breit to set
	 */
	public void setBreite(double breite) {
		this.breite = breite;
	}

	/**
	 * @return the hoehe
	 */
	public double getHoehe() {
		return hoehe;
	}

	/**
	 * @param hoehe the hoehe to set
	 */
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Quader q=new Quader(2,3,4);
		System.out.println("Quader ("+q.getLaenge()+","+q.getBreite()+","+q.getHoehe());
		System.out.println("Oberflaeche: "+q.oberflaeche());
		System.out.println("Volumen: "+q.volumen());

	}

}
