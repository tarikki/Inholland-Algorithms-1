package testers;

import modules.StackOfThings_Array;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackArrayOfInts {
    public static void main(String[] args) {
        int integer = 0;
        String string = "something";
        StackOfThings_Array<Integer> stack = new StackOfThings_Array<Integer>();
        stack.push(9384564);
        stack.push(integer);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
    }
}
