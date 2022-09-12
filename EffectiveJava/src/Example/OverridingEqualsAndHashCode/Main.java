package Example.OverridingEqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//EQUALS
		
		DenemeS�n�f d1 = new DenemeS�n�f(3,5);
		DenemeS�n�f d2 = new DenemeS�n�f(3,5);
		
		System.out.println(d1.equals(d2)); //Sonu� false d�necektir ��nk� equals methodu override edilmedi.
		
		
		DenemeS�n�fOverride d3 = new DenemeS�n�fOverride(3,5);
		DenemeS�n�fOverride d4 = new DenemeS�n�fOverride(3,5);
		
		System.out.println(d3.equals(d4));//Sonu� true d�necektir ��nk� equals methodumuzu override ettik.
		
		List<DenemeS�n�f> x = new ArrayList<>();
		DenemeS�n�f z = new DenemeS�n�f(4,6);
		x.add(z);
		System.out.println(x.contains(new DenemeS�n�f(4,6)));//false
		
		List<DenemeS�n�fOverride> y = new ArrayList<>();
		DenemeS�n�fOverride v = new DenemeS�n�fOverride(4, 6);
		y.add(v);
		System.out.println(y.contains(new DenemeS�n�fOverride(4, 6)));//true
		
        
		//HASHCODE
		Map<DenemeS�n�f, String> a = new HashMap<>();
		a.put(new DenemeS�n�f(1, 2), "�lk eleman");
		System.out.println(a.get(new DenemeS�n�f(1,2)));//Hashcode override edilmedi�i i�in sonu� null d�ner.
		
		
		
		Map<DenemeS�n�fOverride, String> b = new HashMap<>();
		b.put(new DenemeS�n�fOverride(1, 2), "�lk eleman");
		System.out.println(b.get(new DenemeS�n�fOverride(1,2)));//Hashcode override edildi�i i�in ilk eleman yaz�s�n� yazd�r�r.
	}

}


















