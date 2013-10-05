package arrays;
/**
 * Grundrechnungsarten
 * @author Walter Rafeiner-Magor
 * @version 1.0
 */
public class OhneArrays {
	private int i1,i2,i3,i4,i5,i6;
	private int summe, produkt, differenz;
	/**
	 * Default-Konstruktor
	 * initialisiert
	 */
	public OhneArrays(){
		i1=1;
		i2=2;
		i3=3;
		i4=4;
		i5=5;
		i6=6;
		produkt=1;
		summe=differenz=0;
	}
	/**
	 * Summe berechnen
	 */
	public void summeBerechnen(){
		summe=i1+i2+i3+i4+i5+i6;
	}
	/**
	 * Produkt berechnen
	 */
	public void produktBerechnen(){
		produkt=i1*i2*i3*i4*i5*i6;
	}
	/**
	 * Differenz berechnen
	 */
	public void differenzBerechnen(){
		differenz=-i1-i2-i3-i4-i5-i6;
	}
	/**
	 * Werte am Bildschirmausgeben
	 */
	public void ausgeben(){
		System.out.println("Die Summe betraegt: "+summe);
		System.out.println("Das Produkt betraegt: "+produkt);
		System.out.println("Die Differenz betraegt: "+differenz);
	}
	public static void main(String[] args) {
		OhneArrays a=new OhneArrays();
		a.summeBerechnen();
		a.produktBerechnen();
		a.differenzBerechnen();
		a.ausgeben();
	}
}
