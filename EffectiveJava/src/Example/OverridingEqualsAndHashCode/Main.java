package Example.OverridingEqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//EQUALS
		
		DenemeSýnýf d1 = new DenemeSýnýf(3,5);
		DenemeSýnýf d2 = new DenemeSýnýf(3,5);
		
		System.out.println(d1.equals(d2)); //Sonuç false dönecektir çünkü equals methodu override edilmedi.
		
		
		DenemeSýnýfOverride d3 = new DenemeSýnýfOverride(3,5);
		DenemeSýnýfOverride d4 = new DenemeSýnýfOverride(3,5);
		
		System.out.println(d3.equals(d4));//Sonuç true dönecektir çünkü equals methodumuzu override ettik.
		
		List<DenemeSýnýf> x = new ArrayList<>();
		DenemeSýnýf z = new DenemeSýnýf(4,6);
		x.add(z);
		System.out.println(x.contains(new DenemeSýnýf(4,6)));//false
		
		List<DenemeSýnýfOverride> y = new ArrayList<>();
		DenemeSýnýfOverride v = new DenemeSýnýfOverride(4, 6);
		y.add(v);
		System.out.println(y.contains(new DenemeSýnýfOverride(4, 6)));//true
		
        
		//HASHCODE
		Map<DenemeSýnýf, String> a = new HashMap<>();
		a.put(new DenemeSýnýf(1, 2), "Ýlk eleman");
		System.out.println(a.get(new DenemeSýnýf(1,2)));//Hashcode override edilmediði için sonuç null döner.
		
		
		
		Map<DenemeSýnýfOverride, String> b = new HashMap<>();
		b.put(new DenemeSýnýfOverride(1, 2), "Ýlk eleman");
		System.out.println(b.get(new DenemeSýnýfOverride(1,2)));//Hashcode override edildiði için ilk eleman yazýsýný yazdýrýr.
	}

}


















