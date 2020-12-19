package hamster;

public class MaulLeerException extends RuntimeException {
	public MaulLeerException(String s) {
		System.err.println(s);
	}
	public MaulLeerException() {
		this("Hier liegt kein Korn!");
	}
}
