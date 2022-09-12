package Example.InnerClass;



public class Main {

	public static void main(String[] args) {
		
		
		//�ok fazla operasyon olan s�n�flarda StaticNested kullan�m� tercih edilir
		StaticNested.StaticNesteClass nesne = new StaticNested.StaticNesteClass();

		
		//Ba�l�l�k yarat�yor ana s�n�f�n nesnesini olu�turmadan inner class�n nesnesini olu�turam�yoruz
		NonStaticNested nonStatic = new NonStaticNested();
		NonStaticNested.NonStaticNestedClass nesne2 = nonStatic.new NonStaticNestedClass();
		nesne2.yazBunu();
		
		//Local classes
		LocalClass lc = new LocalClass();
		
		
		//Anonim
		SuperClass sc = new SuperClass() {
			public void yazBeni() {
				System.out.println("Anonim");
			}
		};
	     sc.yazBeni();
	}
	

}


















