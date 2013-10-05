package test_komplex;

public class Komplex {
	private double r;
	private double i;
	/**
	 * @param r
	 * @param i
	 */
	public Komplex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	/**
	 * @param r
	 */
	public Komplex(double r) {
		this(r,0.0);
	}
	/**
	 * standard constructor 
	 */
	public Komplex() {
		this(0.0,0.0);
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}
	/**
	 * @return the i
	 */
	public double getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(double i) {
		this.i = i;
	}
	public Komplex plus(Komplex k){
		this.r+=k.getR();
		this.i+=k.getI();
		return this;
	}
	public static Komplex plus(Komplex left, Komplex right){
		return new Komplex(left.getR()+right.getR(),left.getI()+right.getI());
	}
	public Komplex multiply(double d){
		this.r*=d;
		this.i*=d;
		return this;
	}
	public static Komplex minus(Komplex left, Komplex right){
		return plus(left,right.multiply(-1));
	}

}
