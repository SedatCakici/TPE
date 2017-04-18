// FERTIG
package DeHsMannheimSS17TPEGrp01Übung2;

public class Festgeld extends Vermögensgegenstand {
	protected final long laufzeit = 3;
	protected final double zinssatz = 2;
	private long betrag;

	public Festgeld(String name, long kaufpreis, String kaufdatum) {
		super(name, kaufpreis, kaufdatum);
	}

	public long zins() {
		betrag = (long) (kaufpreis * (Math.pow(1+(zinssatz/100), laufzeit)));
		return betrag;
	}

	public void auskunft() {
		System.out.println(zins());
	}
}
