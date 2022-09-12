package Example.ToString;

public class Main {

	public static void main(String[] args) {
		   //bad
        Request as = new Request();
        as.setBody("Body");
        as.setHeader("Header");

        System.out.println(as.toString()); // Çýktý : Example.ToString.Request@5e91993f to string ovverride edilmediði için 
        //anlamsýz bi çýktý aldýk


        //good
        RequestToString sa= new RequestToString();
        sa.setBody("Body");
        sa.setHeader("Header");

        System.out.println(sa.toString()); //RequestToString{header='Header', body='Body'}

	}

}
