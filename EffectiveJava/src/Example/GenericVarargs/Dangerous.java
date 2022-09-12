package Example.GenericVarargs;

import java.util.List;

public class Dangerous {
	
	static void dangerous(List<String>... stringLists) {
		
		List<Integer> inList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = inList; //Heap pollution
		
		String s = stringLists[0].get(0); //ClaasCastException
	}

	
	public static void main(String[] args) {
		
		dangerous(List.of("There be dragons!"));
	}
}
