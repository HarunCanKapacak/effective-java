package Example.AccessModifiers;

public class AccessModifiers {
	  private String asd= ""; //sýnýf dýþýnda eriþilemez
	    private void mesaj() {
	        System.out.println("merhaba");//sýnýf dýþýnda eriþilemez
	    }
	    private String a(){
	        mesaj();
	        return asd;
	        //sýnýf içerisinde eriþilebilir.
	    }

	    protected void mesajj(){ //ayný paket içerisinden ve extend yada implement edildiði sýnýfdan eriþilir.
	        System.out.println("merhaba");
	    }

	     void mesajjj(){ //eriþim belirteci eklenmezse sadece ayný paket içerisinden eriþilebilir.
	        System.out.println("merhaba");
	    }

	    public static String a ="a";//paket baðýmsýz sýnýf üzerinden eriþilebilir oluyor.

	    private static String b="b";//private static i ezmez yine sadece bulunduðu sýnýf tarafýndan eriþilebilir.

	    public static final String c="c"; //baþka sýnýftan eriþilebilir fakat deðeri deðiþtirleme (immutable)

	    public final void mesajjjj(){
	        System.out.println("merhaba"); //bir metod final ise override edilemez.(immutable)
	    }

	    //bir sýnýf final ise sýnýf extend edilemez.(immutable)

	    //abstract sýnýfýn nesnesi oluþturulamaz.
	    //abstract metod yazmak istersek sýnýfýnda abstract olmasý gerekli.


	}


























