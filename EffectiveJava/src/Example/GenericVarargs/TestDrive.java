package Example.GenericVarargs;

public class TestDrive {
	
	
	//bu kullanımda bizim icin arraylist gibi birsey olusturuyor ve istedigimiz kadar parametre verebiliyoruz
	//bu kullanımda baska bir parametre vermek istersek ... kullanımı herzaman sonda olmalıdır 
	static void sumTest(int ...v) {
		System.out.println(v.length);
		System.out.println(v[0]);
	}

	public static void main(String[] args) {
		
		
		sumTest(1);
		sumTest(1,2,3);
		
		
	}
}
