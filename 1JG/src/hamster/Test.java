package hamster;

public class Test extends HamsterKlasse {
	public static void main(String[] args) {
		
		int felder;
		felder = 1;
		int koerner;
		koerner = 0;
		while (kornDa() == true) {
			nimm();
			koerner = koerner + 1;
		}
		while (vornFrei() == true) {
			vor();
			felder = felder + 1;
		}
		if (koerner < felder) {
			linksUm();
			linksUm();
			while (koerner < felder) {
				gib();
				vor();
				while (maulLeer() == true) {
					vor();
				}
			}
		}
		if (koerner >= felder) {
			linksUm();
			linksUm();
		}
		while (kornDa() == false) {
			gib();
			vor();
			koerner = koerner - 1;
			if (vornFrei() == false) {
				schreib("Ich habe noch " + koerner + " Körner im Maul");
			}
		}
	}
}
