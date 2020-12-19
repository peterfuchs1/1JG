package hamster;

public class MauerDaException extends RuntimeException {
	public MauerDaException(String s) {
		System.err.println(s);
	}
	public MauerDaException() {
		this("Ich bin gegen die Wand gelaufen!");
	}
}
