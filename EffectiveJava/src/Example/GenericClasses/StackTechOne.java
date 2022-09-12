package Example.GenericClasses;

import java.util.Arrays;
import java.util.EmptyStackException;

//Generic stack using E[] (pages 130-133)
public class StackTechOne<E> {

	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACÝTY = 16;
	
	@SuppressWarnings("unchecked")
	public StackTechOne() {
		elements = (E[]) new Object [DEFAULT_INITIAL_CAPACÝTY];
	}
	
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public E pop() {
		if(size == 0)
			throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null;
		return result;
     	}
     
	 public boolean isEmpty() {
		 return size == 0;
	 }

     public void ensureCapacity() {
    	 if(elements.length == size)
    		 elements = Arrays.copyOf(elements, 2* size + 1);
     }











}






























