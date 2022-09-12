package Example.ComparableAndComparator;

import java.util.Comparator;

public class IsmeGore implements Comparator<Kitap>{

	@Override
	public int compare(Kitap o1, Kitap o2) {
		
		return o1.ad.compareTo(o2.ad);
	}

}
