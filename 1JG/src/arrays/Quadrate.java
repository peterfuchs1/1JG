/**
 * 
 */
package arrays;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class Quadrate {
	private int[] array;

	public Quadrate() {
		array = new int[10];
		int [ ] array2 = {1,2,3,4,5};
		String [ ] namen= {"Gustaf", "Hans", "Klaus", "Maria", "Gustaf"};  /* Initialisierungsliste eines String-Arrays */
		String name = namen[3];
	}

	public void berechenen() {
		for (int i = 0; i < array.length; i++) {
			int basis=i+1;
			array[i]=basis*basis;
		}
	}

	public void ausgeben() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Das Quadrat von "+(i+1)
					+" ergibt: "+array[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Quadrate q=new Quadrate();
		q.berechenen();
		q.ausgeben();
		

	}

}
