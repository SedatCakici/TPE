package DeHsMannheimSS17TPEGrp01Übung2;

public abstract class Vermögensgegenstand {

	protected final String name;
	protected final long kaufpreis;
	protected final String kaufdatum;
	protected long aktuellerPreis;

	public Vermögensgegenstand(String name, long kaufpreis, String kaufdatum) {
		super();
		this.name = name;
		this.kaufpreis = kaufpreis;
		this.kaufdatum = kaufdatum;
		this.aktuellerPreis = kaufpreis;
	}
}
