package Example.GenericClasses;

import java.util.ArrayList;

public class GenericType <T>{
	
	private ArrayList<T> list = new ArrayList<>();
	
	
	public void add(T t) {
		this.list.add(t);
	}
	
	public ArrayList<T> getAll() {
		
		return this.list;
	}

	
}
