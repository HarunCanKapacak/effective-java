package Example.GenericVarargs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {
	
	//Hatalý kullaným

	static <T> T[] toArray(T... args) {
		return args;

	}

	static <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {

		case 0:
			return toArray(a, b);
		case 1:
			return toArray(a, c);
		case 2:
			return toArray(b, c);
		}
		throw new AssertionError();

	}

	public static void main(String[] args) {
    
		String[] arr = pickTwo("good", "fast", "cheap");
		System.out.println(Arrays.toString(arr));
	}
}



























