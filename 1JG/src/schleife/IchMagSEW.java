package schleife;
import simple.Input;
/**
 * Ich mag SEW, bis ich genug habe.
 * 
 * @author Walter Rafeiner-Magor 
 * @version 2016-02-29
 */
public class IchMagSEW
{
    /**
     * main-Methode: Wird beim Start verwendet
     * 
     * @param  args    Argumente, welche beim Start mitgegeben wurden
     */
    public static void main(String[] args)
    {
        boolean nochmals;
        do 
        {        
            System.out.println("Ich mag SEW!");
            nochmals=Input.getBoolean("Magst du SEW?");
        }
        while(nochmals==true);
    }
}
