package Example.AbstractVsInterface;

public interface Sark�Yazar� {
	
	public void sark�Yaz();
	
	
	//override etmek zorunda de�iliz 
	default boolean siirYazabiliyorMusun() {
		
		return true;
	}

}
