/**
 * 
 */
package strings;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class OktalText {

	public static String toOktalString(int i) {
		String ret = "";
		for(String zahl = "01234567";i>0;i=i/8)
			ret = "" + zahl.charAt(i % 8) + ret;
		return "0" + ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			int value = (int) (Math.random() * 2500);
			System.out.println("hex von " + value + ": " + toOktalString(value));
		}
		System.out.println("hex von " + 128 + ": " + toOktalString(128));
	}

}
