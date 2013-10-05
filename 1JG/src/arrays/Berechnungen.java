package arrays;

public class Berechnungen {
	private double[] werte;
	/**
	 * Konstruktor mit einem Parameter als double Array
	 * @param werte
	 */
	public Berechnungen(double[] werte) {
		this.werte = werte;
	}

	public static final int MAX_VALUES=10;
	/**
	 * 
	 */
	public Berechnungen() {
		werte=new double[MAX_VALUES];
	}
	
	
	
	/**
	 * Kopie des Arrays
	 * @return double Array
	 */
	public double[] copy (){
		double neu[]=new double[werte.length];
		for (int i=0;i< werte.length;i++)
			neu[i]=werte[i];
		return neu;
		
	}



	public Berechnungen(int anzahl) {
		werte=new double[anzahl];
	}
	public int size(){
		return werte.length;
	}
	public void setValue(int i,double value){
		if(i<0||i>=werte.length) return;
		werte[i]=value;
	}
	public double getValue(int i){
		if(i<0||i>=werte.length) throw new ArrayIndexOutOfBoundsException(i);
		return werte[i];
	}
	public double mittelWert(){
		return summe()/werte.length;
	}
	public double summe(){
		double s=0.0;
		for(int i=0;i<werte.length;i++)
			s+=werte[i];
		return s;
	}
	public double max(){
		int i=0;
		double maximum=werte[i++];
		while(i<werte.length)
			maximum=Math.max(maximum, werte[i++]);
		return maximum;
	}
	public double min(){
		int i=0;
		double minimum=werte[i++];
		while(i<werte.length)
			minimum=Math.min(minimum, werte[i++]);
		return minimum;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Berechnungen m1=new Berechnungen(100);
		for(int i=0;i< m1.size();i++){
			m1.setValue(i, i+1);
		}
		System.out.println("Der Mittelwert von m1 beträgt: "+m1.mittelWert());
		System.out.println("Die Summe aller Elemente von m1 beträgt: "+m1.summe());
		System.out.println("Die Anzahl aller Elemente von m1 beträgt: "+m1.size());
		System.out.println("Die höchste Wert aller Elemente von m1 beträgt: "+m1.max());
		System.out.println("Die niedrigste Wert aller Elemente von m1 beträgt: "+m1.min());
	}

}
