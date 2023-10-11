import Interface.Futbolcu;
import Interface.GencYetenek;
import Interface.TeknikAdam;
import Interface.Yönetici;

public class Main {
	public static void main(String []args) {
		
	 NormalTopçu();
	 YetenekliTopçu();
	 Yönet();
	 
	}
	private static void Yönet() {
		TeknikAdam teknik= new TeknikAdam();
		teknik.TakımıYönet();
		teknik.TakımıKontrol();
		
	}
	private static void YetenekliTopçu() {

		GencYetenek genç= new GencYetenek();
		genç.calımAt();
		genç.güzelGiyin();
		
	}
	private static void NormalTopçu() {
		Futbolcu fut= new Futbolcu();
		fut.formagiy();
		fut.kramponbağla();
		fut.pasAt();
		fut.şutAt();
		
	}



	

}
