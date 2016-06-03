package switch_case;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		String eingabeT=JOptionPane.showInputDialog("Gib eine ganze Zahl ein: ");
		switch(eingabeT){
		case "2": case "3": case "5": case"7": 
			System.out.println("Die Zahl "+eingabeT+" ist eine Primzahl!");
			break;
		case "1": case "4": case "6": case"8": case "9": case"10":
			System.out.println("Die Zahl "+eingabeT+" ist keine Primzahl!");
			break;
		default:
			System.out.println("Die Zahl "+eingabeT+" kann nicht analysiert werden!");
		}
	}
}
