// FERTIG
package DeHsMannheimSS17TPEGrp01Übung2;

public class Immobilien extends Vermögensgegenstand {
	private final long konstatanteSenkungDesKaufpreisBisMaxNull = 50000;
	protected long zeit = 0;
	protected long aktuellerPreis = 0;

	public Immobilien(String name, long kaufpreis, String kaufdatum) {
		super(name, kaufpreis, kaufdatum);
	}

	public void setZeit(long zeit) {
		if (zeit <= 0) {
			this.zeit = 0;
		}
		else{
			this.zeit = zeit;			
		}
	}

	public void setZeitAutomatik() {
		this.zeit++;
	}

	public void wertSinkung() {
		if (kaufpreis < (konstatanteSenkungDesKaufpreisBisMaxNull * zeit)) {
			aktuellerPreis = 0;
		}
		aktuellerPreis = kaufpreis - (zeit * konstatanteSenkungDesKaufpreisBisMaxNull);
	}

	public long getZeit() {
		return zeit;
	}

	public long getAktuellerPreis() {
		return aktuellerPreis;
	}

}
