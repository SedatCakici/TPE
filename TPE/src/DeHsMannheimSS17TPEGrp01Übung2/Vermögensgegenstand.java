package DeHsMannheimSS17TPEGrp01Übung2;

public class Vermögensgegenstand {

	protected final String name; // <-- Abtract rein...
	protected final long kaufpreis; // <-- Abtract rein...
	protected final String kaufdatum; // <-- Abtract rein...

	public Vermögensgegenstand(String name, long kaufpreis, String kaufdatum) {
		super();
		this.name = name;
		this.kaufpreis = kaufpreis;
		this.kaufdatum = kaufdatum;
	}
}
