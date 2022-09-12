package Example.ComparableAndComparator;

public class Kitap  implements Comparable<Kitap>{
	
	String ad;
	int sayfa;
	



	public Kitap(String ad, int sayfa) {
		super();
		this.ad = ad;
		this.sayfa = sayfa;
	}




	@Override
	public int compareTo(Kitap o) {
		return this.sayfa - o.sayfa;
		
	}




	@Override
	public String toString() {
		return "Kitap [ad=" + ad + ", sayfa=" + sayfa + "]";
	}

}
