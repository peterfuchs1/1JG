package arrays;

public class QuadratWurzeln {
	private double[] werte;
	/**
	 * Konstruktor mit einem Parameter als double Array
	 * @param werte
	 */
	public QuadratWurzeln(double[] werte) {
		this.werte = werte;
		init();
	}

	public static final int MAX_VALUES=10;
	/**
	 * 
	 */
	public QuadratWurzeln() {
		werte=new double[MAX_VALUES];
		init();
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

	public void init(){
		for (int i=0;i< werte.length;i++)
			werte[i]=Math.sqrt(i);		
	}


	public QuadratWurzeln(int anzahl) {
		werte=new double[anzahl];
		init();
	}
	public int size(){
		return werte.length;
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
	public double mittelwert(){
		return summe()/werte.length;
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
		QuadratWurzeln m1=new QuadratWurzeln(100);
		System.out.println("Die Anzahl aller Elemente von m1 beträgt: "+m1.size());
		System.out.println("Der Mittelwert von m1 beträgt: "+m1.mittelWert());
		System.out.println("Die Summe aller Elemente von m1 beträgt: "+m1.summe());

		m1=new QuadratWurzeln();		
		System.out.println("Die Anzahl aller Elemente von m1 beträgt: "+m1.size());
		System.out.println("Der Mittelwert von m1 beträgt: "+m1.mittelWert());
		System.out.println("Die Summe aller Elemente von m1 beträgt: "+m1.summe());
		
		double[] array=new double[20];
		m1=new QuadratWurzeln(array);		
		System.out.println("Die Anzahl aller Elemente von m1 beträgt: "+m1.size());
		System.out.println("Der Mittelwert von m1 beträgt: "+m1.mittelWert());
		System.out.println("Die Summe aller Elemente von m1 beträgt: "+m1.summe());
	}

}
