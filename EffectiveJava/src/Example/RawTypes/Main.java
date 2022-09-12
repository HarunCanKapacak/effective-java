package Example.RawTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        List<String> isimListesi = new ArrayList<>();
        isimListesi.add("Harun");
        isimListesi.add("can");
        //isimListesi.add(Boolean.FALSE); //bad


        String isimAl = (String) isimListesi.get(1);///cast etsek bile iþe yaramýyor hata fýrlatýyor.

        System.out.println(isimAl);

	}

}
