// FERTIG NICHT GANZ
package DeHsMannheimSS17TPEGrp01Übung2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RentenpapierTest {
	@Test
	public void nameTest(){
		Rentenpapier re = new Rentenpapier("Euro", 1000, "12.10");
		String output = re.name;
		assertEquals("Euro",output);
	}
	
	@Test
	public void kaufpreisTest(){
		Rentenpapier re = new Rentenpapier("Euro", 1000, "12.10");
		long output = re.kaufpreis;
		assertEquals(1000,output);
		
		re = new Rentenpapier("Euro", 0, "12.10");
		output = re.kaufpreis;
		assertEquals(0,output);

		re = new Rentenpapier("Euro", -1000, "12.10");
		output = re.kaufpreis;
		assertEquals(-1000,output);
		
	}
	
	@Test
	public void kaufdatumTest(){
		Rentenpapier re = new Rentenpapier("Euro", 1000, "12.10");
		String output = re.name;
		assertEquals("Euro",output);
	}
	
	@Test
	public void zinsTest() {
		Rentenpapier re = new Rentenpapier("Euro", 100, "12.10");
		long output = re.zins();
		assertEquals(1035, output);
	}
	
	@Test
	public void setKursTest(){
		Rentenpapier re = new Rentenpapier("SAP", 1000000, "10.12");
		re.setKurs(2d);
		double output = re.kurs;
		assertEquals(2d, output,0);
		
		re.setKurs(.5d);
		output = re.kurs;
		assertEquals(0.5, output,0);
		
		re.setKurs(-2d);
		output = re.kurs;
		assertEquals(-2, output,0);
		
		re.setKurs(-.5d);
		output = re.kurs;
		assertEquals(-0.5, output,0);
	}

}