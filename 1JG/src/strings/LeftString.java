package strings;

/**
 * Programm ist ein "Ersatz" f�r die substring Methode.
 * 
 * 
 * @author Michael St�ger 
 * @version 29.1.2013
 */
public class LeftString
{
    public static void main(String[] args){
		//Variablen einlesen
        String eingabe = javax.swing.JOptionPane.showInputDialog(null,"Gib den zu k�rzenden String ein");
        int anzahl = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,"Wie viele Zeichen?"));
		//String k�rzen und ausgeben
        System.out.println("Der gek�rzte String: "+CutString(eingabe,anzahl));
        //Tests
        System.out.println("Tests:");
        System.out.println("3 Stellen von Name:"+CutString("Name",3));
        System.out.println("2 Stellen von SEW:"+CutString("SEW",4));
        System.out.println("1 Stelle von XY:"+CutString("XY",1));
    }
    public static String CutString(String eingabe, int anzahl){
            if(eingabe.length()<=anzahl) //Wenn die anzahl gr��er die l�nge ist eingabe zur�ckgeben
                return eingabe;
            else{ //Sonst den String k�rzen
				//Variablen einlesen
                int position=0;
                String ausgabe="";
				//Immer eine position in einen String schreiben und dann die position um eines erh�hen
                for(int counter=anzahl;counter!=0;counter--){
                    ausgabe = ausgabe+eingabe.charAt(position);
                    position++;
                }
            return ausgabe; //Den gek�rzten String zur�ckgeben
        }
    }
}
