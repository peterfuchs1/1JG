package strings;

import javax.swing.JOptionPane;

public class ZahlenEingabe {

	public static void main(String[] args) {
		String text="";
		while(!text.equals("ENDE"))
		{
			text=JOptionPane.showInputDialog("Gib einen Text ein: ");
			boolean korrekt=true;
			for(int i=0;korrekt && i<text.length();++i)
				korrekt=Zahlen.istZahlenteil(text.charAt(i));
			if(korrekt){
				double d=Double.parseDouble(text);
				System.out.println(1/d);
			}
		}
		
	}

}
