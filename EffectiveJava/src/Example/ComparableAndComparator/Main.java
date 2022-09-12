package Example.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
		kitapListesi.add(new Kitap("�ibumi",500));
		kitapListesi.add(new Kitap("Otomatik Portakal",200));
		kitapListesi.add(new Kitap("Ab",300));
		Collections.sort(kitapListesi);
		System.out.println("S�ralama 1");
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
		System.out.println("S�ralama2");
		IsmeGore isimK�yaslama = new IsmeGore();
		Collections.sort(kitapListesi, isimK�yaslama);
		for (Kitap kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}

		
		
		
	}

}
