package Example.DependencyInjection;

public class YazýAnaliziUtility {
	
	
	//temel özelliði baþka classda newlenmez (private constructor)

	private static final Sözlük türkçe = new Sözlük("Türkçe");
	
	private YazýAnaliziUtility(){}
	
	
	public static boolean isValid() {
		return true;
	}
	
	

}
