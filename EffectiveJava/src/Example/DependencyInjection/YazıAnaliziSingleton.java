package Example.DependencyInjection;

public class YazıAnaliziSingleton {
	
	//Temel özelliği tek bir instance olucak ve onun üzerinden çalışacak
	
	private static final Sözlük türkçe = new Sözlük("Türkçe");
	public static YazıAnaliziSingleton INSTANCE = new YazıAnaliziSingleton();
	
	
	private YazıAnaliziSingleton() {
		
		
	}
	public boolean isValid() {
		return true;
	}
	

}
