package modules;

import java.util.Arrays;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackOfInts_Array implements Stacker {
    int[] stack = new int[0];


    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean push(int number) {
        int[] newStack = new int[stack.length+1];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        newStack[newStack.length-1] = number;
        stack = newStack;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public int pop() {
        int returnable = stack[stack.length-1];
        int[] newStack = new int[stack.length-1];
        System.arraycopy(stack, 0, newStack, 0, stack.length-1);
        stack = newStack;

        return returnable;
    }


    @Override
    public String toString() {
        String printable = "";
        for (int i : stack) {
            printable += " " + i + "," ;
        }
        return printable;
    }
}
