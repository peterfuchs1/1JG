package hamster;

public class FeldLeerException extends RuntimeException {
	public FeldLeerException(String s) {
		System.err.println(s);
	}
	public FeldLeerException() {
		this("Hier liegt kein Korn!");
	}
}
