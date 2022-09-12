package Example.DependencyInjection;

public class YazýAnaliziSingleton {
	
	//Temel özelliði tek bir instance olucak ve onun üzerinden çalýþacak
	
	private static final Sözlük türkçe = new Sözlük("Türkçe");
	public static YazýAnaliziSingleton INSTANCE = new YazýAnaliziSingleton();
	
	
	private YazýAnaliziSingleton() {
		
		
	}
	public boolean isValid() {
		return true;
	}
	

}
