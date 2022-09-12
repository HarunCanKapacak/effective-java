package Example.BuilderDesignPattern;

public class ProductBuilder {




	private String productName;
	
	
	//Seçime göre deðiþir
	private long price;
	private String brand;
	private long unitsInStock;
	
	public static class Builder{
		
		
		private String productName;
	
		private long price;
		private String brand;
		private long unitsInStock;
		
		public Builder(String productName) {
			super();
			productName = productName;
		}
		
		public Builder priceVermekIsteyenler(long price) {
			this.price = price;
			return this;
		}
		
		public Builder brandVermekIsteyenler(String brand) {
			this.brand = brand;
			return this;
		}
		public Builder unitsInStockVermekIsteyenler(long unitsInStock) {
			this.unitsInStock = unitsInStock;
			return this;
		}
		public ProductBuilder build() {
			return new ProductBuilder(this);
		}
		
	}
	    public ProductBuilder(Builder builder) {
	 productName=builder.productName;
	 price=builder.price;
	 brand=builder.brand;
	 unitsInStock=builder.unitsInStock;
			 
		
	}
}































