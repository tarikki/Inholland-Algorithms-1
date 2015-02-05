package testers;

import modules.StackOfInts_Array;
import modules.Stacker;

/**
 * Created by extradikke on 04/02/15.
 */
public class StackArrayOfInts {
    public static void main(String[] args) {
        StackOfInts_Array stack = new StackOfInts_Array();
        stack.push(3);
        stack.push(67);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
