/**
 * 
 */
package arrays;

/**
 * @author Walter Rafeiner-Magor
 *
 */
public class Funktion {
	private double[] values;
	public final static int MIN=-10;
	public final static int MAX=10;

	/**
	 * 
	 */
	public Funktion() {
		values=new double[MAX-MIN+1];
	}
	public void berechnen(){
		for(int i=0;i<values.length;i++){
			int x=i+MIN;
			values[i]=2*x*x-8;			
		}
	}
	public void ausgeben(){
		for(int i=0;i<values.length;i++){
			System.out.println("f("+(i+MIN)+")="+values[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funktion f=new Funktion();
		f.berechnen();
		f.ausgeben();
	}

}
