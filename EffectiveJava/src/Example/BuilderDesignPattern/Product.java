package Example.BuilderDesignPattern;

public class Product {

	//Gerekli
	private String ProductName;
	
	
	//Seçime göre deðiþir
	private long price;
	private String brand;
	private long unitsInStock;
	
	//Telescope pattern
	public Product(String productName) {
		super();
		ProductName = productName;
	}
	public Product(String productName, long price, String brand, long unitsInStock) {
		super();
		ProductName = productName;
		this.price = price;
		this.brand = brand;
		this.unitsInStock = unitsInStock;
	}
	
	public Product(String productName, long price, String brand) {
		super();
		ProductName = productName;
		this.price = price;
		this.brand = brand;
	}

	
	
	
}




















