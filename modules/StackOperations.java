package modules;

/**
 * Created by extradikke on 09.02.15.
 */
public class StackOperations {

    public static Object peek(ProperLinkedListStack stack) {
        Object stackTop = stack.pop();
        stack.push(stackTop);
        return stackTop;
    }

}
