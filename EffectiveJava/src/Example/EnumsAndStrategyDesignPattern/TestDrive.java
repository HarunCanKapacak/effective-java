package Example.EnumsAndStrategyDesignPattern;

public class TestDrive {

//Tür güvenliği yok
//Debug zorlaşacak	
	
	public static final int APPLE_FUJI  = 0;
	public static final int APPLE_PIPPIN  = 1;
	public static final int APPLE_GRANNY_SMITH  = 2;
	
	
	public static final int ORANGE_NAVEL  = 0;
	public static final int ORANGE_TEMPLE  = 1;
	public static final int ORANGE_BLOOD  = 2;
	
	public enum Apple{FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orange{NAVEL, TEMPLE, BLOOD}
    
    //Singletonların genelleştirilmiş hali
	

}
