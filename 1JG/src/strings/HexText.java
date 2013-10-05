/**
 * 
 */
package strings;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class HexText {

	public static String toHexString(int i) {
		String ret = "";
		for(String hexzahl = "0123456789ABCDEF";i>0;i=i/16)
			ret = "" + hexzahl.charAt(i % 16) + ret;
		return "0x" + ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			int value = (int) (Math.random() * 2500);
			System.out.println("hex von " + value + ": " + toHexString(value));
		}
	}

}
