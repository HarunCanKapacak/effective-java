package Example.CompositonVsInheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		K�t�BirKal�t�m�rne�i k�t� = new K�t�BirKal�t�m�rne�i();
		k�t�.add("k�t�");
		
		
		
		
		Kitap kitap1 = new Kitap("A kitab�");
		Kitap kitap2 = new Kitap("B kitab�");
		
		List<Kitap> kitapListesi = new ArrayList<Kitap>();
		
		kitapListesi.add(kitap1);
		kitapListesi.add(kitap2);
		
		K�t�phane k�t�phane = new K�t�phane(kitapListesi);
		
		List<Kitap> k�t�phanedekiT�mKitaplar = k�t�phane.kutuphanedekiT�mKitaplar();
		
		for (Kitap kitap : k�t�phanedekiT�mKitaplar) {
			
			System.out.println(kitap.getIsim());
		}
		
	
	}

}
















