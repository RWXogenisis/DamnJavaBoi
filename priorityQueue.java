// queue
import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
       PriorityQueue<Integer> p = new PriorityQueue<Integer>();
       
       p.add(1);
       p.add(2);
       p.add(3);
       
       Iterator l1 = p.iterator();
       while(l1.hasNext()){
           System.out.println(l1.next());
       }
       p.poll();
       System.out.println("queue: "+p);
    }
}
/*
Output:
1
2
3
queue: [2, 3]

if it was 1 3 2 then on poll it would have resulted in the same array as the smallest element is removed
*/
