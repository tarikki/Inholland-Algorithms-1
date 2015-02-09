package testers;

import modules.ProperLinkedListStack;
import modules.StackOperations;

/**
 * Created by extradikke on 09.02.15.
 */
public class Stack3 {
    public static void main(String[] args) {

        // stack 3 a
        ProperLinkedListStack<Integer> properLinkedListStack = new ProperLinkedListStack<Integer>();
        properLinkedListStack.push(1);
        properLinkedListStack.push(2);
        properLinkedListStack.push(3);
        System.out.println(StackOperations.peek(properLinkedListStack));

        // stack 3 c
        ProperLinkedListStack<Integer> storage = new ProperLinkedListStack<Integer>();
        for (int i = 0; i < properLinkedListStack.size()+2; i++) {
            int popped = properLinkedListStack.pop();
            storage.push(popped);

            if (properLinkedListStack.size() == 0){
                System.out.println(popped);
            }
        }
        System.out.println(storage);
        for (int i = 0; i < storage.size()+2; i++) {
            properLinkedListStack.push(storage.pop());
        }
        System.out.println(properLinkedListStack);

        // stack 3 d

        for (int i = 0; i < properLinkedListStack.size()+2; i++) {
            int popped = properLinkedListStack.pop();

            if (properLinkedListStack.size() != 0){
                storage.push(popped);
                System.out.println(popped);
            }
        }
        System.out.println(storage);
        for (int i = 0; i < storage.size()+1; i++) {
            properLinkedListStack.push(storage.pop());
        }
        System.out.println(properLinkedListStack);

        // stack 3 e
    }
}
