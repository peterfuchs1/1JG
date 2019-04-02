package text;

public class TextTest {

	public static void main(String[] args) {
		int z1= 65, z2= 90, z3=64, z4=91, z5= 40;
		System.out.println("vorher: "+(char)(z1)+" nachher: "+(char)Text.toLowerCase(z1));
		System.out.println("vorher: "+(char)(z2)+" nachher: "+(char)Text.toLowerCase(z2));
		System.out.println("vorher: "+(char)(z3)+" nachher: "+(char)Text.toLowerCase(z3));
		System.out.println("vorher: "+(char)(z4)+" nachher: "+(char)Text.toLowerCase(z4));
		System.out.println("vorher: "+(char)(z5)+" nachher: "+(char)Text.toLowerCase(z5));
		System.out.println("vorher: "+(char)(z1+32)+" nachher: "+(char)Text.toUpperCase(z1+32));
		System.out.println("vorher: "+(char)(z2+32)+" nachher: "+(char)Text.toUpperCase(z2+32));
		System.out.println("vorher: "+(char)(z3+32)+" nachher: "+(char)Text.toUpperCase(z3+32));
		System.out.println("vorher: "+(char)(z4+32)+" nachher: "+(char)Text.toUpperCase(z4+32));
		System.out.println("vorher: "+(char)(z5+32)+" nachher: "+(char)Text.toUpperCase(z5+32));

	}

}
