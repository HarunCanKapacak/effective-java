package Example.DependencyInjection;

public class Main {

	public static void main(String[] args) {
		
		YazıAnaliziUtility.isValid();
		YazıAnaliziSingleton.INSTANCE.isValid();
		
		
		YazıAnaliziDependencyInjection asd = new YazıAnaliziDependencyInjection(new Sözlük("Türkçe"));
		asd.isValid();

	}

}
