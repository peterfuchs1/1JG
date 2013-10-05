package arrays;
/**
 * Grundrechnungsarten mit Array
 * @author Walter Rafeiner-Magor
 * @version 1.1
 */
public class MitArrays {
	private int array[];
	private int summe, produkt, differenz;
	/**
	 * Default-Konstruktor
	 * initialisiert alle Attribute
	 */
	public MitArrays(){
		array=new int[6];
		for(int i=0;i<array.length;i++)
			array[i]=i+1;
		summe=differenz=0;
		produkt=1;
	}
	/**
	 * Berechnungen durchführen
	 */
	public void berechnen(){
		for(int i=0;i<array.length;i++){
			summe+=array[i];
			produkt*=array[i];
			differenz-=array[i];
		}	
		
	}
	/**
	 * Ergebnisse ausgeben
	 */
	public void ausgeben(){
		System.out.println("Die Summe betraegt: "+summe);
		System.out.println("Das Produkt betraegt: "+produkt);
		System.out.println("Die Differenz betraegt: "+differenz);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MitArrays a=new MitArrays();
		a.berechnen();
		a.ausgeben();

	}

}
