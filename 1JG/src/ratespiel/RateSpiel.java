package ratespiel;
import javax.swing.JOptionPane;
/**
* Write a description of class RateSpiel here.
* 
* @author Florian Triska 
* @version 14.11.2012
*/
public class RateSpiel
{
public static void main (String[]args){
int zufall;
zufall= (int) (Math.random ()*20-1);
int zahl;
zahl=Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie eine Zahl zwischen 1 und 20 ein!"));
if (zahl==zufall){
System.out.println("Herzlichen Gl¸ckwunsch Richtig! ");
}else{
if (zahl>zufall){
System.out.println("Die Zahl ist zu groﬂ!");
}else{
System.out.println("Die Zahl ist zu klein!");
}
}
zahl=Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie eine Zahl zwischen 1 und 20 ein!"));
if (zahl==zufall){
System.out.println("Beim 2. Versuch ist auch gut. Richtig.");
}else{
if (zahl>zufall){
System.out.println("Die Zahl ist zu groﬂ!");
}else{
System.out.println("Die Zahl ist zu klein!");
}
}
zahl=Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie eine Zahl zwischen 1 und 20 ein!"));
if (zahl==zufall){
System.out.println("Richtig!");
}else{
if (zahl>zufall){
System.out.println("Die Zahl ist zu groﬂ!");
}else{
System.out.println("Die Zahl ist zu klein!");
}
}
System.out.println("Die Zahl war "+zufall+".");

}
}