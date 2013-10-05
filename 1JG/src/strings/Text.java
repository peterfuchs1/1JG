package strings;

/**
 * Ein Programm, das von einem String nur eine gewisse Anzahl von Zeichen wieder zur�ckgeben kann.
 * 
 * @author Daniel May 
 * @version 1.0
 */
public class Text
{
    /**
     * @return gibt den gew�nschten Teil des Anfangsstrings zur�ck.
     * @param anzahl Ein Integer Wert der die Anzahl der Zeichen des Substrings festlegt.
     * Gibt nur einen gew�nschten teil eines Strings wieder zur�ck.
     */
    public static String leftString(String s, int anzahl){
        int l=s.length();//Die l�nge des Strings wird ausgelesen.
        String substring="";
        if (anzahl>=l){
            return s;//Wenn die Anzahl der gew�nschten Zeichen gr��er oder gleich der L�nge ist wird der Anfangsstring zur�ckgegeben.
        }else{
            for (int i=0;i<anzahl;i++){
                substring=substring+s.charAt(i);
            }
            return substring;
            /*
             * Verkettet einen Buchstaben des Strings nacheinander bis die gew�nschte Anzahl an Zeichen erreicht ist,
             * und speichert die Referenz in der substring Variable.
             * Die Variable substring wird zur�ckgegeben. 
             */
        }
    }
    public static void main(String []args){
        String s="723.982";
        int anzahl=5;
        System.out.println("1. String: "+s+", Anzahl der gew�nschten Zeichen: "+anzahl);
        System.out.println("leftString: "+Text.leftString(s,anzahl));
        System.out.println();
        
        s="gesamter String";
        anzahl=15;
        System.out.println("2. String: "+s+", Anzahl der gew�nschten Zeichen: "+anzahl);
        System.out.println("leftString: "+Text.leftString(s,anzahl));
        System.out.println();
        
        s="Erdbeerk�se";
        anzahl=7;
        System.out.println("3. String: "+s+", Anzahl der gew�nschten Zeichen: "+anzahl);
        System.out.println("leftString: "+Text.leftString(s,anzahl));
        System.out.println();
        /*
         * Es wird der Variable s eine Referenz zugewiesen.
         * Der Variable anzahl wird ein Int-Literal zugewiesen.
         * Es werden Informationen �ber den string und die Anzahl ausgegeben und danach der Substring selbst.
         * Dies passiert 3-mal mit immer anderen Referenzen und anderer Anzahl.
         */
    }
}
