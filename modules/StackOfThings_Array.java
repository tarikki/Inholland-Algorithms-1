package modules;

import interfaces.Stacker;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackOfThings_Array<T> implements Stacker<T> {

    private T[] stack;


    public StackOfThings_Array() {
        stack = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean push(T number) {
            @SuppressWarnings("unchecked")
            T[] newStack = (T[]) new Object[size() + 1];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            newStack[newStack.length - 1] = number;
            stack = newStack;
            return true;
    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public T pop() {
        if (size() == 0){
            return null;
        } else {
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[size() - 1];
        T popped = stack[size() - 1];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        stack = newStack;

        return popped;}
    }


    @Override
    public String toString() {
        String printable = "";
        for (Object i : stack) {
            printable += " " + i + ",";
        }
        return printable;
    }
}
