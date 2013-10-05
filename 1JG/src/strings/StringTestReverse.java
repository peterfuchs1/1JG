/**
 * 
 */
package strings;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class StringTestReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "erster String";
		String s2 = "lese";
		String s3 = "Anna";
		System.out.println(reverse(s1));
		System.out.println(reverse(s2));
		System.out.println(reverse(s3));
	}

	public static String reverse(String s) {
		String ret = "";
		for (int i = s.length() - 1; i >= 0; i--)
			ret = ret + s.charAt(i);
		return ret;
	}
}
