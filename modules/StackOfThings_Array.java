package modules;

import interfaces.Stacker;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackOfThings_Array<T> implements Stacker<T> {

    private T[] stack;
    private String type;
    private boolean typeAssigned = false;

    public StackOfThings_Array() {
        stack = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean push(Object number) {

        if (!typeAssigned) {
            type = number.getClass().getName();
            typeAssigned = true;
        }

        if (number.getClass().getName().equals(type)) {
            @SuppressWarnings("unchecked")
            T[] newStack = (T[]) new Object[size() + 1];
            System.out.println(stack.getClass().getName());
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            newStack[newStack.length - 1] = (T) number;
            stack = newStack;
            return true;
        } else {
            System.out.println("nope!");
            return false;
        }


    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public Object pop() {
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[size() - 1];
        Object popped = stack[size() - 1];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        stack = newStack;

        return popped;
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
