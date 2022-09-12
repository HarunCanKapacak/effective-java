package Example.GenericClasses;

public class Main {

	public static void main(String[] args) {
		
		//Sadece String türünde ekleme yapabilirim
		StackTechOne<String> st = new StackTechOne<>();
		
		for (String string : args) {
			st.push(string);
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop().toUpperCase());
		}

		GenericType<String> gt = new GenericType<>();
		gt.add("harun");
		gt.add("can");
		gt.add("kapacak");
		System.out.println(gt.getAll());
	}

}
