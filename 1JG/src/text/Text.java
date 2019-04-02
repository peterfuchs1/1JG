package text;

public class Text {
	public static int toLowerCase(int z) {
		if(z>64 && z<91) z += 32;
		return z;
	}
	public static int toUpperCase(int z) {
		if(z>96 && z<123) z -= 32;
		return z;
	}
}
