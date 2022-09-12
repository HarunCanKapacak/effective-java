package Example.GenericMethods;

import java.util.HashSet;
import java.util.Set;

//Compile time da tip güvenliði
//autoboxing unboxing gibi cast operasyonlarýnýn onune gecmemizi saðlýyor
//daha esnek bir yapý saðlýyor

public class Union {
	// access modifier <convertion> dönüþTipi methodName(parametre)
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	public static <T extends Number> int topla(T deger1, T deger2) {
		return deger1.intValue() + deger2.intValue();
	}

	public static void main(String[] args) {
		Set<Integer> fenerbahce = Set.of(1, 2, 3);
		Set<Integer> turkiye = Set.of(3, 4, 5);// bu method Integerda olabilir Double da Generic bize burda yardýmcý
												// oluyor set kullandýðýmýz içinde tekrarlanan kayýdý koymuyor.

		Set<Integer> birlesim = union(fenerbahce, turkiye);
		System.out.println(birlesim);

		topla(44, 34.55); // String veya Boolean deðer veremiyorum Numberdan extend ettiðimiz için sadece
						// number turunden degerler verebiliyoruz.

	}
}