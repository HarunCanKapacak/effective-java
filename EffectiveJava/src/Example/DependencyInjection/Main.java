package Example.DependencyInjection;

public class Main {

	public static void main(String[] args) {
		
		Yaz�AnaliziUtility.isValid();
		Yaz�AnaliziSingleton.INSTANCE.isValid();
		
		
		Yaz�AnaliziDependencyInjection asd = new Yaz�AnaliziDependencyInjection(new S�zl�k("T�rk�e"));
		asd.isValid();

	}

}
