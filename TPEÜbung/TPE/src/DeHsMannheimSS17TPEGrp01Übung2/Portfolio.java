package DeHsMannheimSS17TPEGrp01Übung2;

import java.util.ArrayList;
import java.util.Scanner;

public class Portfolio {
//	Scanner s = new Scanner(System.in);
//
//	public Aktie aktieErstellen() {
//		System.out.println("geben sie den namen ein");
//		String name = s.next();
//		System.out.println("geben sie den kaufpreis ein");
//		long kaufpreis = s.nextLong();
//		System.out.println("geben sie den kaufdatum ein");
//		String kaufdatum = s.next();
//		Aktie aktie = new Aktie(name, kaufpreis, kaufdatum);
//		return aktie;
//	}
//
//	public Festgeld festgeldErstellen() {
//		System.out.println("geben sie den namen ein");
//		String name = s.next();
//		System.out.println("geben sie den kaufpreis ein");
//		long kaufpreis = s.nextLong();
//		System.out.println("geben sie den kaufdatum ein");
//		String kaufdatum = s.next();
//		Festgeld festgeld = new Festgeld(name, kaufpreis, kaufdatum);
//		return festgeld;
//	}
//
//	public Rentenpapier rentenpapierErstellen() {
//		System.out.println("geben sie den namen ein");
//		String name = s.next();
//		System.out.println("geben sie den kaufpreis ein");
//		long kaufpreis = s.nextLong();
//		System.out.println("geben sie den kaufdatum ein");
//		String kaufdatum = s.next();
//		Rentenpapier rentenpapier = new Rentenpapier(name, kaufpreis, kaufdatum);
//		return rentenpapier;
//	}
//
//	public Immobilien immobillienErstellen() {
//		System.out.println("geben sie den namen ein");
//		String name = s.next();
//		System.out.println("geben sie den kaufpreis ein");
//		long kaufpreis = s.nextLong();
//		System.out.println("geben sie den kaufdatum ein");
//		String kaufdatum = s.next();
//		Immobilien immo = new Immobilien(name, kaufpreis, kaufdatum);
//		return immo;
//	}
	ArrayList<Vermögensgegenstand> vmgs = new ArrayList<Vermögensgegenstand>();
	
	void addVmg(Vermögensgegenstand e){
	vmgs.add(e);
	}
	
	void berecheWert(){
		for(int i =0;i < vmgs.size(); i++){
			
		}
	}
	

}
