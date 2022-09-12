package Example.StaticFactoryVsConstructor;

public class Product {
	private String productName;
	private  long price;
	
	public Product(String productName, long price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public static Product ExpenciveProduct(String productName) {
		return  new Product(productName,9500 );
		
	}
}
