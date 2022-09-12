package Example.MutableAndImmutable;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
	
		//immutable
		
		String isim = new String("Harun");
		System.out.println(isim.toLowerCase());
		System.out.println(isim);// nesnede deðiþiklik yapýlmýyor çýktý ayný þekilde yazýlýyor "Harun"

		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); //2022-07-21
		localDate.plusDays(1);
		System.out.println(localDate); // 2022-07-21 çýktý yine deðiþmedi immutable
		
		
		
		//mutable
		
		Date date = new Date();
		System.out.println(date); //Thu Jul 21 18:53:16 TRT 2022
		date.setDate(3);;
		System.out.println(date); // Sun Jul 03 18:53:16 TRT 2022 çýktý deðiþti date mutable
		
	
		
		//Immutable Bir class neden final olmalýdýr
	  	Mutable mutable = new Mutable(4);
    	Immutable ýmmutable = (Immutable) mutable;
    	System.out.println(ýmmutable.getValue()); //çýktý:4
    	
    	mutable.setValue(8); 
    	
    	System.out.println(ýmmutable.getValue());// Çýktý:8 immutable final olmadýðý için deðeri deðiþti. 
    	
    	//immutable Dezavantaj
    	
    	BigInteger  fact = new BigInteger("1");
    	System.out.println(fact);//1
    	fact = fact.flipBit(0); //Tekrar bir atama yapmak zorundayýz deðerini deðiþtiremiyoruz
    	System.out.println(fact);//0
    	
    	BitSet bits = new BitSet(1);
    	System.out.println(bits);//{}
    	bits.flip(0);
    	System.out.println(bits);//{0}
    	
    	
    	
    	
		

	}

	
	
}




















