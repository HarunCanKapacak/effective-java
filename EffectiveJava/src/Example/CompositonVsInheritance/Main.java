package Example.CompositonVsInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		KötüBirKalıtımÖrneği kötü = new KötüBirKalıtımÖrneği();
		kötü.add("kötü");
		
		
		
		
		Kitap kitap1 = new Kitap("A kitabı");
		Kitap kitap2 = new Kitap("B kitabı");
		
		List<Kitap> kitapListesi = new ArrayList<Kitap>();
		
		kitapListesi.add(kitap1);
		kitapListesi.add(kitap2);
		
		Kütüphane kütüphane = new Kütüphane(kitapListesi);
		
		List<Kitap> kütüphanedekiTümKitaplar = kütüphane.kutuphanedekiTümKitaplar();
		
		for (Kitap kitap : kütüphanedekiTümKitaplar) {
			
			System.out.println(kitap.getIsim());
		}
		
	
	}

}
















