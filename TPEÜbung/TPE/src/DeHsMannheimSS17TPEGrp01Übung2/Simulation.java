package DeHsMannheimSS17TPEGrp01Übung2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
//		// >>>>>>>>>> Scanner <<<<<<<<<<
//		Scanner s = new Scanner(System.in);
//		// >>>>>>>>>> Variablen assign <<<<<<<<<<
//		Portfolio port = new Portfolio();
//		ArrayList <Portfolio> portArray = new ArrayList<Portfolio>();
//		String name = "";
//		byte eingabe;
//		final boolean check = true;
//		// >>>>>>>>>> Simulation <<<<<<<<<<
//		do {
//			// >>>>>>>>>> text output <<<<<<<<<<
//			System.out.println("1: neue Konto Anlegen");
//			System.out.println("2. Checken wer der besitzer ist");
//			System.out.println("3. was in den Portfolio reinlegen");
//			System.out.println("4. IST NOCH LEER");
//			System.out.println("5. IST NOCH LEER");
//			System.out.println("6: Beenden");
//			eingabe = s.nextByte();
//			switch (eingabe) {
//			case 1:
//				System.out.println("bitte name eingaben: ");
//				name = s.next();
//				System.out.println("ihr Account wurde erstellt");
//				break;
//			case 2:
//				System.out.println(name);
//				break;
//			case 3:
//
//				System.out.println("was möchten Sie in Ihr Portfolio legen");
//				String ifAbfrage = s.next();
//				if (ifAbfrage.equals("Aktie")) {
//					Aktie e = port.aktieErstellen();
////					portArray.add(e);
//				}
//				if (ifAbfrage.equals("Festgeld")) {
//					Festgeld e = port.festgeldErstellen();
////					portArray.add(e);
//				}
//				if (ifAbfrage.equals("Rentenpapier")) {
//					Rentenpapier e = port.rentenpapierErstellen();
////					portArray.add(e);
//				}
//				if (ifAbfrage.equals("Immobilien")) {
//					Immobilien e = port.immobillienErstellen();
////					portArray.add(e);
//				}
//				
//				break;
//			case 4:
//				break;
//			case 5:
//				break;
//			case 6:
//				System.out.println("Cya Prof. Hummel");
//				System.exit(0);
//			default:
//				break;
//			}
//		} while (check);
//
		Portfolio p1 = new Portfolio();
		Aktie aktie1 = new Aktie("BASF", 6102l, "18.04.17",1000);
		p1.addVmg(aktie1);
		p1.addVmg(new Aktie("MAN", 8925l, "18.04.17",240));
		
		Portfolio p2 = new Portfolio();
		
		// Kurs1
		aktie1.setKurs(6127);
		
		//Kurs2
		aktie1.setKurs(8439);
		
		
		
	}

}
