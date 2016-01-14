package operatoren;

public class Reihenfolge {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 5;
		int num3 = 7;
		
		if(num1 == 9 && num2 == 2 || num3 == 7){
			System.out.println("1: Du hast gewonnen!");
		}
		
		if(num1 == 9 && (num2 == 2 || num3 == 7)){
			System.out.println("2: Du hast gewonnen!");
		}
		
		if(num1 == 9 || num2 == 2 || num3 == 7){
			System.out.println("3: Du hast gewonnen!");
		}
		
		
	}

}
