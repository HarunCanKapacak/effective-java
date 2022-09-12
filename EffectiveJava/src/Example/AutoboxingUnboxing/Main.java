package Example.AutoboxingUnboxing;

import java.util.ArrayList;


public class Main {

	
	private static long topla() {
		
		Long sum = 0L;
		for (int i = 0; i < 150; i++ ) {
			sum += i;
		}
		
		return sum;
	}
	
	private static long toplama() {
		
		long sum = 0L;
		for (int i = 0; i < 150; i++ ) {
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Integer number = 100; //Wrapper Class <- pritimive variable
		int autoboxing = number; //Integer tipinden int tipine otomatik olarak atadýk.
		

		
		//example1
		String kelime = new String ("java");
		String kelime2 = "java";
		String kelime3 = "java";
		
		System.out.println(kelime == kelime2); // false
		System.out.println(kelime2 == kelime3); //true
		
		 //check example2
		long start = System.nanoTime();
		topla();
		long end = System.nanoTime();
		long totalTime = end - start;
		System.out.println(totalTime);
		//284400
		
		 //check example2
		long start1 = System.nanoTime();
		toplama();
		long end1 = System.nanoTime();
		long totalTime1 = end1 - start1;
		System.out.println(totalTime1);
		//3300
		
		//check example3
		ArrayList<Integer> integer = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integer.add(Integer.valueOf(i));
		}
		for (int i = 0; i < integer.size(); i++) {
			System.out.println(integer.get(i).intValue());
		}
		
		}
		

	}
















