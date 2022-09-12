package Example.ShallowCopyDeepCopy;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPAC�TY=16;

    public String stackName;

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public Stack(){
        this.elements= new Object[DEFAULT_INITIAL_CAPAC�TY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }

    public Object pop(){
        if (size==0)
            throw new EmptyStackException();
        Object result=elements[--size];
        elements[size]= null;
        return result;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private void ensureCapacity(){
        if(elements.length==size)
            elements= Arrays.copyOf(elements,2*size+1);
    }
}



















