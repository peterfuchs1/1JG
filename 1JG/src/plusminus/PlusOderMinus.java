package plusminus;

public class PlusOderMinus {

	public static void main(String[] args) {
		int zahl = 42;
		System.out.printf("Zahl %d: ++ -> %d -- -> %d\n", 
				zahl, 
				plusOderMinus(zahl, '+'),
				plusOderMinus(zahl, '-'));
		
		System.out.println("20  minus 1 = "+plusOderMinus(20, '-'));

	}
	public static int plusOderMinus(int zahl, char op){
		switch(op){
		case '+': zahl++; break;
		case '-': zahl--;
		}
		return zahl;
	}
	
}
