package modules;

/**
 * Created by extradikke on 13.02.15.
 */
public class StackTimer {

    ProperLinkedListStack<Integer> stack;

    public StackTimer(int start, int increment, int times) {

        for (int n = start; n < (start + (increment * (times))); n += increment) {

            ProperLinkedListStack<Integer> properLinkedListStack = new ProperLinkedListStack<Integer>();
            ProperLinkedListStack<Integer> storage = new ProperLinkedListStack<Integer>();

            for (int numbers = 0; numbers < n; numbers++) {
                properLinkedListStack.push(numbers);
            }
            long startTime = System.nanoTime();
//            System.out.println(properLinkedListStack.size());

            for (int i = 0; i < properLinkedListStack.size() + 2; i++) {
                int popped = properLinkedListStack.pop();
                storage.push(popped);

            }
//            System.out.println(storage.size());
            for (int i = 0; i < storage.size() + 2; i++) {
                properLinkedListStack.push(storage.pop());
            }
            System.out.println("StackSize: " + properLinkedListStack.size() + " Time: " + (double)(System.nanoTime() - startTime)/1000000);


        }
    }
}
