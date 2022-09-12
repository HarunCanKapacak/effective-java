package Example.AbstractVsInterface;

public interface SarkıYazarı {
	
	public void sarkıYaz();
	
	
	//override etmek zorunda değiliz 
	default boolean siirYazabiliyorMusun() {
		
		return true;
	}

}
