package console;

public class StringBegin {

	public static void main(String[] args) {
		String s=args[0];
		if(s.startsWith(": ", 2))
			System.out.println(s+" hat an der Stelle 3-4 ein [: ]");
	}

}
