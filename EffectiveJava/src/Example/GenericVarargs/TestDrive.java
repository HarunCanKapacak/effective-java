package Example.GenericVarargs;

public class TestDrive {
	
	
	//bu kullan�mda bizim icin arraylist gibi birsey olusturuyor ve istedigimiz kadar parametre verebiliyoruz
	//bu kullan�mda baska bir parametre vermek istersek ... kullan�m� herzaman sonda olmal�d�r 
	static void sumTest(int ...v) {
		System.out.println(v.length);
		System.out.println(v[0]);
	}

	public static void main(String[] args) {
		
		
		sumTest(1);
		sumTest(1,2,3);
		
		
	}
}
