package Example.CompositonVsInheritance;

import java.util.List;

public class K�t�phane {
	
	private final List<Kitap> kitaplar;

	public K�t�phane(List<Kitap> kitaplar) {
		super();
		this.kitaplar = kitaplar;
	}
	
	public List<Kitap> kutuphanedekiT�mKitaplar(){
		
		return kitaplar;
	}

	
}
