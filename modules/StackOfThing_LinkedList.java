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
        T thing = stack.pop();
        return thing;
    }

    @Override
    public String toString() {
        return "StackOfThing_LinkedList{" +
                "stack=" + stack +
                '}';
    }
}
