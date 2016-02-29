package schleife;
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
        boolean nochmals=true;
        do {        
            System.out.println("Ich mag SEW!");
            nochmals=simple.Input.getBoolean("Magst du SEW?");
        }
        while(nochmals);
    }
}
