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
		System.out.println("Min byte:"+minByte());
		System.out.println("Max byte:"+Byte.MAX_VALUE);
		System.out.println("Min short:"+Short.MIN_VALUE);
		System.out.println("Max short:"+Short.MAX_VALUE);
		System.out.printf("Min char: %d\n",(int)Character.MIN_VALUE);
		System.out.printf("Max char: %d\n",(int)Character.MAX_VALUE);
		System.out.println("Min int:"+Integer.MIN_VALUE);
		System.out.println("Max int:"+Integer.MAX_VALUE);
		System.out.println("Min long:"+Long.MIN_VALUE);
		System.out.println("Max long:"+Long.MAX_VALUE);
		System.out.println(""+7/10);
		System.out.println(""+7/10.0);
		long s = 291745225931L;
		float f = s;
		System.out.println(f);
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
	
	private static byte minByte(){
		return Byte.MIN_VALUE;
	}
}
