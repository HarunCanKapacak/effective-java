package Example.JavaBitwiseOperations;

public class Main {
	
	public static void main(String[] args) {
		
		
		//0001 -> 0010
		int x = 1;
		System.out.println(x<<1);//2
		
		
		//0100 -> 0001
		int a = 4;
		System.out.println(a>>2);//1
		
		int b = -1;
		//111111....1 ->0000000...0001
		System.out.println(b>>>31); // 1
	}
}
