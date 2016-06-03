package strings;

public class Zahlen {
	public static boolean istZahlenteil(char c){
		boolean ret;
		switch(c){
		case '+': case '-': case'.':
			ret= true;
			break;
		default: 
			ret=Character.isDigit(c);
		}
		return ret;
	}
}
