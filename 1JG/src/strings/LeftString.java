package strings;

/**
 * Programm ist ein "Ersatz" für die substring Methode.
 * 
 * 
 * @author Michael Stöger 
 * @version 29.1.2013
 */
public class LeftString
{
    public static void main(String[] args){
		//Variablen einlesen
        String eingabe = javax.swing.JOptionPane.showInputDialog(null,"Gib den zu kürzenden String ein");
        int anzahl = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,"Wie viele Zeichen?"));
		//String kürzen und ausgeben
        System.out.println("Der gekürzte String: "+CutString(eingabe,anzahl));
        //Tests
        System.out.println("Tests:");
        System.out.println("3 Stellen von Name:"+CutString("Name",3));
        System.out.println("2 Stellen von SEW:"+CutString("SEW",4));
        System.out.println("1 Stelle von XY:"+CutString("XY",1));
    }
    public static String CutString(String eingabe, int anzahl){
            if(eingabe.length()<=anzahl) //Wenn die anzahl größer die länge ist eingabe zurückgeben
                return eingabe;
            else{ //Sonst den String kürzen
				//Variablen einlesen
                int position=0;
                String ausgabe="";
				//Immer eine position in einen String schreiben und dann die position um eines erhöhen
                for(int counter=anzahl;counter!=0;counter--){
                    ausgabe = ausgabe+eingabe.charAt(position);
                    position++;
                }
            return ausgabe; //Den gekürzten String zurückgeben
        }
    }
}
