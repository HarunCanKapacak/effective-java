package Example.InnerClass;

public class NonStaticNested {

	//private olsa bile inner s�n�flardan eri�ilebilir
	private String s�zc�k = "S�zl�k";
	
	public class NonStaticNestedClass{
		
		public void yazBunu() {
			System.out.println(s�zc�k);
		}
	}
}
