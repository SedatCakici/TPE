package DeHsMannheimSS17TPEGrp01�bung2;

public abstract class Verm�gensgegenstand {

	protected final String name;
	protected final long kaufpreis;
	protected final String kaufdatum;
	protected long aktuellerPreis;

	public Verm�gensgegenstand(String name, long kaufpreis, String kaufdatum) {
		super();
		this.name = name;
		this.kaufpreis = kaufpreis;
		this.kaufdatum = kaufdatum;
		this.aktuellerPreis = kaufpreis;
	}
}
