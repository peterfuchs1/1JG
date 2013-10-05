package a29;
/**
 * Write a description of class MitArrays here.
 * 
 * @author Alagic Semir
 * @version 1.03.2013
 */

public class MitArrays{
    private int[] i = new int[6];
    private int summe;
    private int produkt;
    private int differenz;
    public MitArrays(){
        for(int x = 0;x<i.length;x++){
            i[x]=x+1;
        }
        produkt=summe=differenz=0;
    }
    public void berechnen(){
        produkt=1;
        for(int x = 0;x<i.length;x++){
            summe+=i[x];
            produkt*=i[x];
            differenz-=i[x];
        }

    }
    public void ausgeben(){
        System.out.println("Die Summe betr�gt: "+summe);
        System.out.println("Das Produkt betr�gt: "+produkt);
        System.out.println("Die Differnenz betr�gt: "+differenz);
    }
    public static void main(String[] args){
        MitArrays c = new MitArrays();
        c.berechnen();
        c.ausgeben();
    }
}
