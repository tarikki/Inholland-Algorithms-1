package modules;

import interfaces.Stacker;
import interfaces.StackerForList;

import java.util.LinkedList;

/**
 * Created by extradikke on 06.02.15.
 */
public class StackOfThing_LinkedList<T> implements StackerForList<T>{

    private LinkedList<T> stack = new LinkedList<T>();

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean push(T thing) {
        stack.push(thing);
        return true;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public T pop() {
        if (size() != 0){
        T thing = stack.pop();
        return thing;}
        else {
            throw new ArrayIndexOutOfBoundsException("Noooo");
        }
    }

    @Override
    public String toString() {
        return "StackOfThing_LinkedList{" +
                "stack=" + stack +
                '}';
    }
}
