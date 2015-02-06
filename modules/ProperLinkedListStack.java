package modules;

import interfaces.StackerForList;

/**
 * Created by extradikke on 06.02.15.
 */
public class ProperLinkedListStack<T> implements StackerForList<T> {
    private int size = 0;
    private Node first;
    private Node last;



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean push(T thing) {
        if (first == null){
            first = new Node(thing);
            last = first;
            size++;
        } else { Node tempNode = new Node(thing);
            last.next = tempNode;
            last = tempNode;
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
        Node tempNode = last;
        return null;
    }

    @Override
    public String toString() {
        return "ProperLinkedListStack{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    public class Node<T>{
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
