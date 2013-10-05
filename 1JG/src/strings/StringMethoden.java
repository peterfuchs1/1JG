/**
 * 
 */
package strings;

/**
 * @author Walter Rafeiner-Magor
 * 
 */
public class StringMethoden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "ein String";
		String s2 = "ein String";
		String s3 = new String("ein String");
		String s4 = s3;

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s4: " + (s1 == s3));
		System.out.println("s2 == s3: " + (s2 == s3));
		System.out.println("s3 == s4: " + (s3 == s4));

		System.out.println("s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));
		System.out.println("s2.equals(s3): " + (s2.equals(s3)));
		System.out.println("s3.equals(s4): " + (s3.equals(s4)));
		String s5 = "23423";
		System.out.println(s5 + "=" + parseInt(s5));
		String s6 = "12.12351235";
		System.out.println(s6 + "=" + parseDouble(s6));

	}

	public static int parseInt(String s) {
		int ret = 0;
		String s0 = "0";
		int nullWert = s0.charAt(0);
		int len = s.length();
		for (int i = 0; i < len; i++) {
			int c = (int) s.charAt(i) - nullWert;
			if (c >= 0 && c <= 9) {
				ret = ret * 10 + c;
			} else
				break;
		}
		return ret;
	}

	public static double parseDouble(String s) {
		double ret = 0;
		boolean nachkomma = false;
		long nenner = 1;
		int nullWert = '0';
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char z = s.charAt(i);
			if (z == '.')
				nachkomma = true;
			else {
				int c = (int) z - nullWert;
				if (c >= 0 && c <= 9) {
					if (nachkomma) {
						nenner *= 10;
						ret = ret + (double) c / nenner;
					} else
						ret = ret * 10 + c;
				} else
					return ret;
			}
		}
		return ret;
	}

}
