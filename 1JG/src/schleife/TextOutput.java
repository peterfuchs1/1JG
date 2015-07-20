package schleife;

import java.io.Console;
import java.util.stream.LongStream;

import javax.swing.JOptionPane;

/**
 * @author Michael Borko <mborko@tgm.ac.at>
 *
 *         Schreibe ein Programm, das einen von dir gewählten Text öfters am
 *         Bildschirm anzeigt. Wie oft der Text angezeigt werden soll, kann der
 *         Benutzer über eine Eingabe bestimmen. Achte darauf, dass auch
 *         ungewöhnliche Zahlen gut verarbeitet werden können. Fehler, die durch
 *         Eingabe von ungültigen Zeichen entstehen müssen nicht behandelt
 *         werden.
 * 
 *         Die Klasse muss eine main-Methode enthalten, mit der sich das
 *         Programm starten lässt und alle besprochenen Dokumentations- und
 *         Stilrichtlinien befolgen (Javadoc-Kommentar, Groß-/Kleinschreibung,
 *         ....).
 */
public class TextOutput {

	private static String text = "Lorem ipsum dolor sit amet, consetetur"
			+ " sadipscing elitr, sed diam nonumy eirmod tempor invidunt"
			+ " ut labore et dolore magna aliquyam erat, sed diam voluptua."
			+ " At vero eos et accusam et justo duo dolores et ea rebum."
			+ " Stet clita kasd gubergren, no sea takimata sanctus est"
			+ " Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet,"
			+ " consetetur sadipscing elitr, sed diam nonumy eirmod tempor"
			+ " invidunt ut labore et dolore magna aliquyam erat, sed diam"
			+ " voluptua. At vero eos et accusam et justo duo dolores et ea"
			+ " rebum. Stet clita kasd gubergren, no sea takimata sanctus"
			+ " est Lorem ipsum dolor sit amet.";
	private Long counter = 0L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TextOutput textOutput = new TextOutput();
		// It should be possible to pass the args argument
		textOutput.input(null);
		textOutput.print();
	}

	/**
	 * This method gets the user input from either the Console or the
	 * JOptionPane input dialog and stores it in the object variable counter
	 * through the parseLong() method.
	 * 
	 * @param counter
	 *            If this string is set, the input will be overriden
	 */
	public void input(String counter) {

		String input = counter;
		String info = "Please tell me how often do you want "
				+ "to see the \"Lorem ipsum\" text? (integer please) ";

		if (counter == null) {
			Console c = System.console();
			if (c != null) {
				input = c.readLine(info);
			} else {
				System.err.println("No console available, " + "switching to JOptionPane ...");
				input = JOptionPane.showInputDialog(info);
			}
		}

		try {
			this.counter = Long.parseLong(input);
		} catch (NumberFormatException nfe) {
			System.err.println("You typed a non recognizable number!");
		} catch (Exception e) {
			System.err.println("Something went terribly wrong!");
		}
	}

	/**
	 * This method is printing the static text to the stdout of the system
	 */
	public void print() {
		LongStream.rangeClosed(1, counter).forEach(i -> System.out.println(text));
	}
}