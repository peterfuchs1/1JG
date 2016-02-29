package simple;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 * Class Input - input class for input of simple input types
 * via simple dialog box.  
 * eg. int, char, String,float or boolean.
 * 
 * @author: Bruce Quig
 * @author: Michael Kolling
 * @author: Walter Rafeiner-Magor
 *
 * @version: 1.1
 * Date:     28.01.2016
 */

public class Input
{
    // instance variables
    static final String STRING_TITLE = "Gib einen String ein";
    static final String CHAR_TITLE = "Gib ein char ein";
    static final String INT_TITLE = "Gib einen int ein";
    static final String BOOLEAN_TITLE = "Waehle True oder False aus";
    static final String FLOAT_TITLE = "Gib einen float ein";
    static final String TRUE = "True";
    static final String FALSE = "False";
    static final String EMPTY_STRING = "";
    /**
     * no instance allowed
     */
    private Input(){}
    /**
     * String input from the user via a simple dialog.
     * @param prompt the message string to be displayed inside dialog    
     * @return String input from the user.
     **/
    public static String getString(String prompt)
    {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = { "OK" };

        boolean validResponse = false;

        String result = null;

        while(!validResponse) 
        {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                JOptionPane.QUESTION_MESSAGE,
                                                JOptionPane.OK_CANCEL_OPTION,
                                                null,
                                                options, 
                                                options[0]);
            
            optionPane.setWantsInput(true);
            JDialog dialog = optionPane.createDialog(null, STRING_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            
            Object response = optionPane.getInputValue();
            
            if(response != JOptionPane.UNINITIALIZED_VALUE) 
            {
                result = (String)response;
                validResponse = true;
            }      
            else 
            {
                commentArray[1] = "Ungueltiger Wert : " + result;
                commentArray[2] = "Gib einen gueltigen Wert fuer String ein";
            }
        }
        return result;
    }


    /**
     * char input from the user via a simple dialog.
     * @param prompt the message string to be displayed inside dialog  
     * @return char input from the user.
     **/
    public static char getChar(String prompt)
    {
        char response ='-';

        String result = null;

        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = { "OK" };

        boolean validResponse = false;

        while(!validResponse) 
        {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                JOptionPane.QUESTION_MESSAGE,
                                                JOptionPane.OK_CANCEL_OPTION,
                                                null,
                                                options, 
                                                options[0]);
            
            optionPane.setWantsInput(true);
            JDialog dialog = optionPane.createDialog(null, CHAR_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            
            Object input = optionPane.getInputValue();
            if(input != JOptionPane.UNINITIALIZED_VALUE) 
            {
                result = (String)input;
                if(result != null && result.length() == 1) 
                {
                     response = result.charAt(0);
                     validResponse = true;
                }
                else 
                { 
                     commentArray[1] = "Ungueltiger Wert : " + result;
                     commentArray[2] = "Gib einen Character ein"; 
                }
            }
            else 
            { 
                commentArray[1] = "Ungueltiger Wert : " + result;
                commentArray[2] = "Gib einen Character ein"; 
            }
        }
        return response;
    }



    /**
     * boolean selection from the user via a simple dialog.
     * @param prompt message to appear in dialog
     * @return boolean selection from the user
     **/
    public static boolean getBoolean(String prompt)
    {
        Object[] commentArray = {prompt, EMPTY_STRING};
        boolean validResponse = false;
        int result = -1;

        while(!validResponse)
        {
            Object[] options = {TRUE, FALSE};
            result = JOptionPane.showOptionDialog(null,
                                         commentArray,
                                         BOOLEAN_TITLE,
                                         JOptionPane.YES_NO_OPTION,
                                         JOptionPane.QUESTION_MESSAGE,
                                         null,     //don't use a custom Icon
                                         options,  //the titles of buttons
                                         TRUE );  //the title of the default button
            
            // check true or false buttons pressed
            if(result == 0 || result == 1)
                validResponse = true;
            else
                commentArray[1] = "Ungueltige Auswahl : Waehle true oder false Button";
        }
        return (result == 0);
    }




   /**
    * returns integer input from the user via a simple dialog.
    * @param prompt the message string to be displayed inside dialog
    * @return the input integer
    **/
    public static int getInt(String prompt)
    {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = { "OK" };

        boolean validResponse = false;

        int response = 0;
        while(!validResponse) 
        {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                JOptionPane.QUESTION_MESSAGE,
                                                JOptionPane.OK_CANCEL_OPTION,
                                                null,
                                                options, 
                                                options[0]);
            
            optionPane.setWantsInput(true);
            JDialog dialog = optionPane.createDialog(null, INT_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            
            String result = (String)optionPane.getInputValue();

            try 
            {
                //workaround for BlueJ bug - misses first exception after compilation
                response = Integer.parseInt(result);
                response = Integer.parseInt(result);
                validResponse = true;      
            } 
            catch(NumberFormatException exception) 
            {
                if(result.equals("uninitializedValue"))
                        result = "";    
                commentArray[1] = "Ungueltiger int: " + result;
                commentArray[2] = "Gib einen gueltigen Wert fuer int ein";
            }
        }
        return response;
    }


   /**
    * returns a float input from the user via a simple dialog.
    * @param prompt the message string to be displayed inside dialog
    * @return the input float
    **/
    public static  float getFloat(String prompt)
    {
        Object[] options = { "OK" };
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};

        boolean validResponse = false;
        float response = 0.0f;

        while(!validResponse) 
        {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                JOptionPane.QUESTION_MESSAGE,
                                                JOptionPane.OK_CANCEL_OPTION,
                                                null,
                                                options, 
                                                options[0]);
            
            optionPane.setWantsInput(true);
            JDialog dialog = optionPane.createDialog(null, FLOAT_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            
            String result = (String)optionPane.getInputValue();
            
            // convert String to float
            try 
            {
                // workaround for BlueJ bug - misses first exception after recompilation?
                response = Float.valueOf(result).floatValue();
                response = Float.valueOf(result).floatValue();
                validResponse = true;      
            } 
            catch(NumberFormatException exception) 
            {
                commentArray[1] = "Ungueltiger float: " + result;
                commentArray[2] = "Gib einen gueltigen Wert fuer float ein";
            }
        }
        return response;
    }
}
