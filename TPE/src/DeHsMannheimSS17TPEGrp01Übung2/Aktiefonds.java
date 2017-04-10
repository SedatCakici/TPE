package DeHsMannheimSS17TPEGrp01Übung2;

import java.util.ArrayList;

public class Aktiefonds {
	public ArrayList<Aktie> anSammlungVonAktien = new ArrayList<Aktie>();
	
	public void einenDraufLegen(Aktie e){
	anSammlungVonAktien.add(e);
	}
}
