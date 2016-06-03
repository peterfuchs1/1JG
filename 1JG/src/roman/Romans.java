package roman;
import javax.swing.*;
/**
 * Die Klasse wandelt eine ganze Zahl [1,3999] in die roemische Schreibweise um
 * Bei der Eingabe wird geprüuft, ob die Zahl im Wertebereich liegt bzw.
 * durch try & catch sichergestellt, dass es sich um eine ganz Zahl handelt
 * Falls keine Zahl (=Leerstring) eingegeben wurde, wird das Programm verlassen
 * 
 * @author Walter Rafeiner-Magor
 * @version 2016-06-02
 */
public class Romans
{
    /**
     * main-Methode: Wird beim Start verwendet
     * 
     * @param  args    Argumente, welche beim Start mitgegeben wurden
     */
    public static void main(String[] args)
    {
        int zahl=0;
        String eingabe;
        String ausgabe="";
        while (zahl<1 || zahl>3999){
            eingabe= JOptionPane.showInputDialog("Roemische Zahlen: Gib eine ganze Zahl zwischen 1 und 3999 ein:");
            try{
                zahl= Integer.parseInt(eingabe);
            }
            catch (NumberFormatException e){
            	if(eingabe.equals("")) break;
            	System.err.println("Bitte gib eine ganze Zahl zwischen 1 und 3999 ein!");
            }
        }
        ausgabe= intToRoman(zahl);
        if(zahl!=0)
        	System.out.println("Hallo, deine Zahl lautet: "+ausgabe);
        else
        	System.out.println("Du hast leider keine Zahl eingegeben");
    }
    public static String intToRoman(int zahl){
    	String ausgabe="";
        while(zahl>0){
            if(zahl>=1000){
                ausgabe+="M";
                zahl-=1000;
            }
            else if(zahl>=900){
                ausgabe+="CM";
                zahl-=900;
            }
            else if(zahl>=500){
                ausgabe+="D";
                zahl-=500;
            }
            else if(zahl>=400){
                ausgabe+="CD";
                zahl-=400;
            }
            else if(zahl>=100){
                ausgabe+="C";
                zahl-=100;
            }
            else if(zahl>=90){
                ausgabe+="XC";
                zahl-=90;
            }
            else if(zahl>=50){
                ausgabe+="L";
                zahl-=50;
            }
            else if(zahl>=40){
                ausgabe+="XL";
                zahl-=40;
            }
            else if(zahl>=10){
                ausgabe+="X";
                zahl-=10;
            }
            else if(zahl>=9){
                ausgabe+="IX";
                zahl-=9;
            }
            else if(zahl>=5){
                ausgabe+="V";
                zahl-=5;
            }
            else if(zahl>=4){
                ausgabe+="IV";
                zahl-=4;
            }
            else if(zahl>=1){
                ausgabe+="I";
                zahl-=1;
            }
        }
       return ausgabe;
    }    
}

