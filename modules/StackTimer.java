package modules;

/**
 * Created by extradikke on 13.02.15.
 */
public class StackTimer {



    public StackTimer(int start, int increment, int times) {

        for (int n = start; n < (start + (increment * (times))); n += increment) {

            ProperLinkedListStack<Integer> properLinkedListStack = new ProperLinkedListStack<>();
            ProperLinkedListStack<Integer> storage = new ProperLinkedListStack<>();

            for (int numbers = 0; numbers < n; numbers++) {
                properLinkedListStack.push(numbers);
            }
            double totalTime = 0;
            int maxTimes = 10;
            for (int averaginTimes = 0; averaginTimes < maxTimes; averaginTimes++) {


            long startTime = System.nanoTime();


            for (int i = 0; i < n; i++) {
                int popped = properLinkedListStack.pop();
                storage.push(popped);

            }

            for (int i = 0; i < n; i++) {
                properLinkedListStack.push(storage.pop());
            }
            totalTime += (double)(System.nanoTime() - startTime)/1000000;
            }
            System.out.println(properLinkedListStack.size() + "\t " + totalTime/maxTimes);



        }
    }
}
