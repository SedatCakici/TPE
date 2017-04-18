// FERTIG
package DeHsMannheimSS17TPEGrp01Übung2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AktieTest {

	@Test
	public void nameTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11");
		String output = ak.name;
		assertEquals("SAP", output);
	}

	@Test
	public void kaufpreisTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11");
		long output = ak.kaufpreis;
		assertEquals(1000000000, output);

		ak = new Aktie("SAP", 0, "12.11");
		output = ak.kaufpreis;
		assertEquals(0, output);

		ak = new Aktie("SAP", -1, "12.11");
		output = ak.kaufpreis;
		assertEquals(-1, output);
	}

	@Test
	public void kaufdatumTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11");
		String output = ak.kaufdatum;
		assertEquals("12.11", output);
	}

	@Test
	public void aktuellerStandTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11");
		ak.setKurs(1);
		long output = ak.aktuellerStand();
		assertEquals(1000000000, output);

		ak.setKurs(.5);
		output = ak.aktuellerStand();
		assertEquals(500000000, output);

		ak.setKurs(-.5);
		output = ak.aktuellerStand();
		assertEquals(-500000000, output);
	}

	@Test
	public void setKursTest() {
		Aktie ak = new Aktie("SAP", 1000000, "10.12");
		ak.setKurs(2d);
		double output = ak.kurs;
		assertEquals(2d, output, 0);

		ak.setKurs(.5d);
		output = ak.kurs;
		assertEquals(0.5, output, 0);

		ak.setKurs(-2d);
		output = ak.kurs;
		assertEquals(-2, output, 0);

		ak.setKurs(-.5d);
		output = ak.kurs;
		assertEquals(-0.5, output, 0);
	}

}
