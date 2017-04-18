// FERTIG
package DeHsMannheimSS17TPEGrp01Übung2;

public class Rentenpapier extends Festgeld implements Handelbar {
	protected final long laufzeit = 10;
	protected final float zinssatz = (float) 1.5;
	protected double kurs;

	public Rentenpapier(String name, long kaufpreis, String kaufdatum) {
		super(name, kaufpreis, kaufdatum);
	}

	public long zins() {
		return ((long) (kaufpreis * (Math.pow(laufzeit, (1 + (zinssatz / 100))))));
	}

	public void auskunft() {
		System.out.println(zins());
	}

	public void setKurs(double kurs) {
		this.kurs = kurs;
	}
}
