package sterne;
import javax.swing.*;

/**
 * Programm fragt eine Zahl von 2-12 ab und zeichnet ein Quadrat das 2-12
 * Zeichen breit und hoch ist. Dieses Quadrat ist innen leer.
 * 
 * @author Hausknecht Sebastian
 * @version 12-01-2013
 */
public class QuadrateZeichnen {
	public static void main(String []args){
        char s='*';//Erstellen der Variable s vom Datentyp char mit dem Wert '*'
        char l=' ';//Erstellen der Variable l vom Datentyp char mit dem Wert ' '
        byte a;//Erstellen der Variable a vom Datentyp byte
        do {
            a=Byte.parseByte(JOptionPane.showInputDialog("Bitte eine Zahl von 2-12 eingeben"));//Der Benutzer gibt eine Zahl zwischen 2 und 12 ein
            if (a<2 ^ a>12){
                System.out.println("Du darfst nur eine Zahl von 2-12 eingeben.");//Wenn die eingegebene Zahl nicht dem Schema entspricht, wird ein Text ausgegeben
            }else{
            }
        }while (a<2 ^ a>12);
        for (byte i=1;i<=a;i++){
            for (byte j=1;(i==1)&&(j<a);j++){
                System.out.print(s);
            }
        
            if (i==1){
                System.out.println(s);
            }else{
            }
         
            if ((i>=2)&&(i<a)){
                System.out.print(s);
            }else{
            }
          
            for (byte k=2;(i>1)&&(k<a)&&(i<a);k++){
                System.out.print(l);
            }
      
            if ((i>1)&&(i<a)){
                System.out.println(s);
            }else{
            }
           
            for (byte m=1;(i==a)&&(m<=a);m++){
                System.out.print(s);
            }
            
        }
    }
}
