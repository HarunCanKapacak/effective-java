package Example.DependencyInjection;

public class Yaz�AnaliziSingleton {
	
	//Temel �zelli�i tek bir instance olucak ve onun �zerinden �al��acak
	
	private static final S�zl�k t�rk�e = new S�zl�k("T�rk�e");
	public static Yaz�AnaliziSingleton INSTANCE = new Yaz�AnaliziSingleton();
	
	
	private Yaz�AnaliziSingleton() {
		
		
	}
	public boolean isValid() {
		return true;
	}
	

}
