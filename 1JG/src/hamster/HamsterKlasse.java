package hamster;

public class HamsterKlasse {

	// protected static int felderGesamt = HamsterKlasse.felder_OSTEN +
	// HamsterKlasse.felder_SUEDEN;
	protected static int felder_OSTEN = 20;
	protected static int felder_WESTEN = 0;
	protected static int felder_SUEDEN = 10;
	protected static int felder_NORDEN = 0;
	// protected static int felderNochFrei=10;
	protected static int koernerImMaul = 0;
	protected static int kornAufFeld = 10;
	protected static int schritte = 0;
	protected static Richtung look = Richtung.OSTEN;
	protected static int koernerAbgelegt = 0;
	// Am ersten Feld liegen 20 Körner!
	protected static int koernerFeld1 = 20;
	// Im letzen Feld (Osten) liegen 30 Körner!
	protected static int koernerFeldOstenEnde = 30;

	public HamsterKlasse() {
		this(20, 10, 10);
	}

	public HamsterKlasse(int felder_osten) {
		this(felder_osten, 1, 10);
	}

	public HamsterKlasse(int felder_osten, int felder_sueden) {
		this(felder_osten, felder_sueden, 10);
	}

	public HamsterKlasse(int felder_osten, int felder_sueden, int koerner_im_maul) {
		felder_OSTEN = felder_osten;
		felder_SUEDEN = felder_sueden;
		koernerImMaul = koerner_im_maul;
	}
	/**
	 * Ist vor mir noch ein freies Feld?
	 * @return
	 */
	public static boolean vornFrei() {
		switch (HamsterKlasse.look) {
		case OSTEN:
			return (felder_OSTEN > 0);
		case WESTEN:
			return (felder_WESTEN > 0);
		case SUEDEN:
			return (felder_SUEDEN > 0);
		// case NORDEN:
		default:
			return (felder_NORDEN > 0);
		}
	}
	/**
	 * Ich nehme ein Korn auf
	 */
	public static void nimm() {
		if (!kornDa())
			throw new FeldLeerException();

		if (look == Richtung.OSTEN) {
			if (schritte == 0) {
				koernerFeld1--;
				kornGenommen();
				return;
			}

			if (schritte != 0 && felder_OSTEN == 0) {
				koernerFeldOstenEnde--;
				kornGenommen();
				return;
			}
		}
	}
	/**
	 * Ich geben aus, dass ich ein Korn genommen habe
	 */
	private static void kornGenommen() {
		koernerImMaul++;
		String t = (koernerImMaul == 1) ? "ein Korn" : "" + koernerImMaul + " Körner";
		System.err.println("Ich habe nun " + t + " im Maul");
	}

	/**
	 * Ich lege ein Korn ab, solange noch ein Korn im Maul ist
	 */
	public static void gib() {
		if (maulLeer())
			throw new MaulLeerException("Habe kein Korn mehr");
		else {
			koernerImMaul--;
			koernerAbgelegt++;
			System.err.println("Ich habe das " + (koernerAbgelegt) + ". Korn abgelegt");
		} 
			
	}

	/**
	 * Liegt hier ein Korn?
	 * @return
	 */
	public static boolean kornDa() {
		if (look == Richtung.OSTEN) {
			if (schritte == 0) {
				return (koernerFeld1 > 0);
			}

			if (schritte != 0 && felder_OSTEN == 0) {
				return (koernerFeldOstenEnde > 0);
			}
		}
		return false;
	}
	/**
	 * Wenn kein Korn im Maul ist
	 * @return 
	 */
	public static boolean maulLeer() {
		return koernerImMaul < 1;
	}
	/**
	 * Ich drehe mich gegen Uhrzeigersinn
	 */
	public static void linksUm() {
		System.err.println("Ich drehe mich um 90° gegen den Uhrzeigersinn");
		HamsterKlasse.look = HamsterKlasse.look.next();
		System.err.println("Ich schaue nun in Richtung " + HamsterKlasse.look);

	}
	/**
	 * Ich geben den Text auf der Konsole aus
	 * @param s auszugebender Text
	 */
	public static void schreib(String s) {
		System.out.println(s);

	}
	/**
	 * Ich gehe in Blickrichtung ein Feld vorwaerts
	 */
	public static void vor() {
		if (!vornFrei())
			throw new MauerDaException();
		switch (HamsterKlasse.look) {
		case OSTEN:
			felder_OSTEN--;
			felder_WESTEN++;
			break;
		case WESTEN:
			felder_WESTEN--;
			felder_OSTEN++;
			break;
		case SUEDEN:
			felder_SUEDEN--;
			felder_NORDEN++;
			break;
		case NORDEN:
			felder_NORDEN--;
			felder_SUEDEN++;

		}
		System.err.println(
				"[" + felder_NORDEN + "|" + felder_WESTEN + "]" + "Ich gehe den " + (++schritte) + ". Schritt ");

	}

}
