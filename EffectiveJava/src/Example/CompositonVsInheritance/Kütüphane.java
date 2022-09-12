package Example.CompositonVsInheritance;

import java.util.List;

public class Kütüphane {
	
	private final List<Kitap> kitaplar;

	public Kütüphane(List<Kitap> kitaplar) {
		super();
		this.kitaplar = kitaplar;
	}
	
	public List<Kitap> kutuphanedekiTümKitaplar(){
		
		return kitaplar;
	}

	
}
