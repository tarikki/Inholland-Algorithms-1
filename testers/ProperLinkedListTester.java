package testers;

import modules.ProperLinkedListStack;

/**
 * Created by extradikke on 06.02.15.
 */
public class ProperLinkedListTester {

    public static void main(String[] args) {

        ProperLinkedListStack<Integer> stack = new ProperLinkedListStack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

    }
}
