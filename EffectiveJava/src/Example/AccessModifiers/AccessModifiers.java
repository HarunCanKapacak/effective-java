package Example.AccessModifiers;

public class AccessModifiers {
	  private String asd= ""; //s�n�f d���nda eri�ilemez
	    private void mesaj() {
	        System.out.println("merhaba");//s�n�f d���nda eri�ilemez
	    }
	    private String a(){
	        mesaj();
	        return asd;
	        //s�n�f i�erisinde eri�ilebilir.
	    }

	    protected void mesajj(){ //ayn� paket i�erisinden ve extend yada implement edildi�i s�n�fdan eri�ilir.
	        System.out.println("merhaba");
	    }

	     void mesajjj(){ //eri�im belirteci eklenmezse sadece ayn� paket i�erisinden eri�ilebilir.
	        System.out.println("merhaba");
	    }

	    public static String a ="a";//paket ba��ms�z s�n�f �zerinden eri�ilebilir oluyor.

	    private static String b="b";//private static i ezmez yine sadece bulundu�u s�n�f taraf�ndan eri�ilebilir.

	    public static final String c="c"; //ba�ka s�n�ftan eri�ilebilir fakat de�eri de�i�tirleme (immutable)

	    public final void mesajjjj(){
	        System.out.println("merhaba"); //bir metod final ise override edilemez.(immutable)
	    }

	    //bir s�n�f final ise s�n�f extend edilemez.(immutable)

	    //abstract s�n�f�n nesnesi olu�turulamaz.
	    //abstract metod yazmak istersek s�n�f�nda abstract olmas� gerekli.


	}


























