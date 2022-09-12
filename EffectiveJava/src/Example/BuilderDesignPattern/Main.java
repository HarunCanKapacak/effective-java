package Example.BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("mont", 15000, "Kenzo");
		Product product2 = new Product("araba");
		Product product3 = new Product("Laptop",20000,"asus",25);
		
		
//bu yap� daha esnek ve istedi�imiz de�eri alabiliyoruz ekstra bir �aba sarfetmeden
 //spring @Builder anotasyonu ile temelini yazm�� oldu�umuz i�in tamam�n� kendi hallediyor ve bize
//bu yap�y� kullanmam�z� sa�l�yor.
	ProductBuilder product4 = new ProductBuilder.Builder("telefon").
			brandVermekIsteyenler("apple")
				.priceVermekIsteyenler(15000).
				unitsInStockVermekIsteyenler(20).
				build();

	
	
	ProductBuilder product5 = new ProductBuilder.Builder("klavye")
			.priceVermekIsteyenler(50)
			.build();
	}

}
