package Example.BuilderDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("mont", 15000, "Kenzo");
		Product product2 = new Product("araba");
		Product product3 = new Product("Laptop",20000,"asus",25);
		
		
//bu yapý daha esnek ve istediðimiz deðeri alabiliyoruz ekstra bir çaba sarfetmeden
 //spring @Builder anotasyonu ile temelini yazmýþ olduðumuz iþin tamamýný kendi hallediyor ve bize
//bu yapýyý kullanmamýzý saðlýyor.
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
