package figur;

public class Rechteck {
	private double a;
	private double b;
	/**
	 * Standardkonstruktor
	 */
	public Rechteck() {
		this(0,0);
	}
	/**
	 * Ein Quadrat wird erstellt
	 * @param a Seitenlaenge
	 */
	public Rechteck(double a) {
		this(a,a);	
	}
	/**
	 * Es wird ein Rechteck mit Laenge und Breite erstellt
	 * @param a Laenge
	 * @param b Breite
	 */
	public Rechteck(double a, double b){
		this.a=a;
		this.b=b;
	}
	/**
	 * Umfang des Rechtecks
	 * @return Umfang als double
	 */
	public double umfang(){
		return 2*(a+b);
	}
	/**
	 * Flaeche des Rechtecks
	 * @return Flaeche als double
	 */
	public double flaeche(){
		return a*b;
	}
	
	/**
	 * Breite auslesen
	 * @return the a
	 */
	public double getA() {
		return a;
	}
	/**
	 * Breite setzen
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * Laenge auslesen
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * Laenge setzen
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rechteck r1=new Rechteck();
		
		r1.setA(3);
		r1.setB(4);
		Rechteck r2=new Rechteck(3,4);
		double breite=r2.getA();
		double laenge=r2.getB();
		System.out.println("Es wurde ein Rechteck mit Laenge:"+laenge+" und Breite:"+breite+" erstellt");
		System.out.println("besitzt den Umfang:"+r2.umfang()+" und die Flaeche:"+r2.flaeche());
	}

}
