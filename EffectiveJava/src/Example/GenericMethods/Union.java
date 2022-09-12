package Example.GenericMethods;

import java.util.HashSet;
import java.util.Set;

//Compile time da tip g�venli�i
//autoboxing unboxing gibi cast operasyonlar�n�n onune gecmemizi sa�l�yor
//daha esnek bir yap� sa�l�yor

public class Union {
	// access modifier <convertion> d�n��Tipi methodName(parametre)
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
		Set<Integer> turkiye = Set.of(3, 4, 5);// bu method Integerda olabilir Double da Generic bize burda yard�mc�
												// oluyor set kulland���m�z i�inde tekrarlanan kay�d� koymuyor.

		Set<Integer> birlesim = union(fenerbahce, turkiye);
		System.out.println(birlesim);

		topla(44, 34.55); // String veya Boolean de�er veremiyorum Numberdan extend etti�imiz i�in sadece
						// number turunden degerler verebiliyoruz.

	}
}