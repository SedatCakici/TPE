// FERTIG
package DeHsMannheimSS17TPEGrp01�bung2;

public class Aktie extends Verm�gensgegenstand implements Handelbar {
	protected long anzahl;

	public Aktie(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super(name, kaufpreis, kaufdatum);
		this.anzahl = anzahl;
	}

	public void setKurs(long kurs) {
		this.aktuellerPreis = kurs;
	}

}
