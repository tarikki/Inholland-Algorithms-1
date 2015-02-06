package testers;

import modules.StackOfThing_LinkedList;

/**
 * Created by extradikke on 06.02.15.
 */
public class LinkedListTester {

    public static void main(String[] args) {
        StackOfThing_LinkedList<Integer> stackOfThing_linkedList = new StackOfThing_LinkedList<Integer>();
        stackOfThing_linkedList.push(4);
        System.out.println(stackOfThing_linkedList);
        stackOfThing_linkedList.push(56);
        stackOfThing_linkedList.push(33);
        System.out.println(stackOfThing_linkedList);
        int anything = stackOfThing_linkedList.pop();
        System.out.println(anything);
        System.out.println(stackOfThing_linkedList);

    }
}
