/**
 * 
 */
package strings;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "ein String";
		String s2 = "ein String";
		String s3 = new String("ein String");
		String s4 = s3;
		String s5= "kein String";
		
		int laenge=s3.length();
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s4: " + (s1 == s3));
		System.out.println("s2 == s3: " + (s2 == s3));
		System.out.println("s3 == s4: " + (s3 == s4));

		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));
		System.out.println("s2.equals(s3): " + (s2.equals(s3)));
		System.out.println("s3.equals(s5): " + (s3.equals(s5)));
	}

}
