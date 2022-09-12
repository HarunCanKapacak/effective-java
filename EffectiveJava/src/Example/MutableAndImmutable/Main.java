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
		System.out.println(isim);// nesnede de�i�iklik yap�lm�yor ��kt� ayn� �ekilde yaz�l�yor "Harun"

		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); //2022-07-21
		localDate.plusDays(1);
		System.out.println(localDate); // 2022-07-21 ��kt� yine de�i�medi immutable
		
		
		
		//mutable
		
		Date date = new Date();
		System.out.println(date); //Thu Jul 21 18:53:16 TRT 2022
		date.setDate(3);;
		System.out.println(date); // Sun Jul 03 18:53:16 TRT 2022 ��kt� de�i�ti date mutable
		
	
		
		//Immutable Bir class neden final olmal�d�r
	  	Mutable mutable = new Mutable(4);
    	Immutable �mmutable = (Immutable) mutable;
    	System.out.println(�mmutable.getValue()); //��kt�:4
    	
    	mutable.setValue(8); 
    	
    	System.out.println(�mmutable.getValue());// ��kt�:8 immutable final olmad��� i�in de�eri de�i�ti. 
    	
    	//immutable Dezavantaj
    	
    	BigInteger  fact = new BigInteger("1");
    	System.out.println(fact);//1
    	fact = fact.flipBit(0); //Tekrar bir atama yapmak zorunday�z de�erini de�i�tiremiyoruz
    	System.out.println(fact);//0
    	
    	BitSet bits = new BitSet(1);
    	System.out.println(bits);//{}
    	bits.flip(0);
    	System.out.println(bits);//{0}
    	
    	
    	
    	
		

	}

	
	
}




















