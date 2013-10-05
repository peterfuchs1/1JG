package minmax;

public class Min {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b = 5;
		System.out.println("min a:" + a + " b:" + b + "=" + Min.min(a, b));
		System.out.println("max a:" + a + " b:" + b + "=" + Min.max(a, b));
	}

	private static int min(int a, int b) {
		int ret = a;

		if (b < a)
			ret = b;

		return ret;
	}
	private static int max(int a, int b) {
		int ret = a;

		if (b > a)
			ret = b;

		return ret;
	}
}
