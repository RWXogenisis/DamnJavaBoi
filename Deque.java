// queue
import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
        ArrayDeque <Integer> q = new ArrayDeque<Integer>();
        
        q.add(1);
        q.addFirst(2);
        q.addLast(3);
        
        System.out.println("queue: " + q);
        System.out.println("Dequeue the elemnt: " + q.pollFirst());
        // or pollLast or poll
        //rest are the same, ListIterator for iteration, and to add we use add
    }
}
