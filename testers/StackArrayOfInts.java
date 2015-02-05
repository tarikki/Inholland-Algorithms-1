package testers;

import modules.StackOfThings_Array;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackArrayOfInts {
    public static void main(String[] args) {
        int integer = 0;
        String string = "dikke";
        StackOfThings_Array stack = new StackOfThings_Array<Integer>();
        stack.push(string);
        stack.push(integer);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
