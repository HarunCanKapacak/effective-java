package Example.InnerClass;

public class NonStaticNested {

	//private olsa bile inner sýnýflardan eriþilebilir
	private String sözcük = "Sözlük";
	
	public class NonStaticNestedClass{
		
		public void yazBunu() {
			System.out.println(sözcük);
		}
	}
}
