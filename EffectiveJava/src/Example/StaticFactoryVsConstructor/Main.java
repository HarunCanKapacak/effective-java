package Example.StaticFactoryVsConstructor;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("laptop",20000);
		
		Product P1 = Product.ExpenciveProduct("Telefon");

	}

}
