// FERTIG
package DeHsMannheimSS17TPEGrp01Übung2;

public class Aktie extends Vermögensgegenstand implements Handelbar {
	protected long anzahl;

	public Aktie(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super(name, kaufpreis, kaufdatum);
		this.anzahl = anzahl;
	}

	public void setKurs(long kurs) {
		this.aktuellerPreis = kurs;
	}

}
