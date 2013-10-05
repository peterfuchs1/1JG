package statistik;

import java.util.Arrays;

public class A36 {

	private double mArray[];
	
	/**
	 * @param mArray
	 */
	public A36(double[] mArray) {
		this.mArray = mArray;
		
	}
	/**
	 * Gibt die Anzahl aller Werte zurück
	 * @return anzahl
	 */
	public int anzahl(){
		return mArray.length;
	}
	/**
	 * Berechnung des Miniimums aller Elemente
	 * @return min
	 */
	public double minimum(){
		double min=mArray[0];
		int anzahl=anzahl();
		for(int i=1;i<anzahl;i++){
			min=(mArray[i]<min)?mArray[i]:min;
		}
		return min;
	}
	/**
	 * Berechnung des Maximums aller Elemente
	 * @return max
	 */
	public double maximum(){
		double max=mArray[0];
		int anzahl=anzahl();
		for(int i=1;i<anzahl;i++){
			max=(mArray[i]>max)?mArray[i]:max;
		}
		return max;
	}
	/**
	 * Berechnung des arithmetischen Mittelwertes
	 * @return Mittelwert
	 */
	public double durchschnitt(){
		double d=0;
		for(int i=0;i<mArray.length;i++){
			d+=mArray[i];
		}
		return d/mArray.length;
	}
	/**
	 * Berechnet die Standardabweichung der Werte
	 * @return s
	 */
	public double standardAbweichung(){
		double s=0;
		double durch=durchschnitt();
		int anzahl=mArray.length;
		for(int i=0;i<anzahl;i++){
			double dif=mArray[i]-durch;
			s=s+dif*dif;
		}
		return Math.sqrt(s/(anzahl-1));
	}
	public double modalWert(){
		int anzahl=anzahl();
		double[] sortiert=Arrays.copyOf(mArray, anzahl);
				Arrays.sort(sortiert);
		
		double wert=sortiert[0];
		double gesucht=wert;
		int haeufigkeit=0;
		for(int i=0;i<anzahl;){
			wert=sortiert[i];
			for(int x=0;i<anzahl&&wert==sortiert[i];i++){
				x++;
				if(x>haeufigkeit){
					gesucht=wert;
					haeufigkeit=x;
				}
			}
		
		}
		return gesucht;
	}
	/**
	 * Berechnung des Medians aller Werte
	 * @return
	 */
	public double median(){
		int anzahl=anzahl();
		double[] sortiert=Arrays.copyOf(mArray, anzahl);
				Arrays.sort(sortiert);
		return sortiert[anzahl/2-1];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A36 s=new A36(new double[]{2.0,4.0,5.0,5.0,1.0,0.0,1.0,4.0,5.0,4.0,5.0});
		System.out.println("Die Anzahl der Werte  betraegt: "+s.anzahl());
		System.out.println("Das Minimum der Werte  betraegt: "+s.minimum());
		System.out.println("Das Maximum der Werte  betraegt: "+s.maximum());
		System.out.println("Der Durchschnitt der Werte  betraegt: "+s.durchschnitt());
		System.out.println("Die Standardabweichung der Werte  betraegt: "+s.standardAbweichung());
		System.out.println("Der Median der Werte  betraegt: "+s.median());
		System.out.println("Der Modalwert der Werte  betraegt: "+s.modalWert());
	}

}
