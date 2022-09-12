package Example.InnerClass;



public class Main {

	public static void main(String[] args) {
		
		
		//Çok fazla operasyon olan sýnýflarda StaticNested kullanýmý tercih edilir
		StaticNested.StaticNesteClass nesne = new StaticNested.StaticNesteClass();

		
		//Baðlýlýk yaratýyor ana sýnýfýn nesnesini oluþturmadan inner classýn nesnesini oluþturamýyoruz
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


















