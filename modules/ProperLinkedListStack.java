package modules;

import interfaces.Stacker;


/**
 * Created by extradikke on 06.02.15.
 */
public class ProperLinkedListStack<T> implements Stacker<T> {
    private int size = 0;
    private Node stackTop;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean push(T thing) {
        if (stackTop == null) {
            stackTop = new Node(thing, null);
            size++;
        } else {
            stackTop = new Node(thing, stackTop);
            size++;

        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T pop() {
        if (size != 0) {
            Node popped = stackTop;
            stackTop = stackTop.previous;
            size--;
            return (T) popped.data;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String nodes = "  ";
        Node next = stackTop;
        while (next != null) {
            nodes += next.data + ", ";
            next = next.previous;
        }
        nodes = nodes.substring(0, nodes.length() - 2);
        return "ProperLinkedListStack{" +
                "size=" + size +
                ", data:" + nodes +

                '}';
    }

    public class Node<T> {
        private T data;
        private Node previous;

        public Node(T data, Node previous) {
            this.data = data;
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
