// queue
import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
        Queue <Integer> q = new <Integer>LinkedList();
        
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Dequeue the elemnt: " + q.poll());
        //rest are the same, ListIterator for iteration, and to add we use add
    }
}
