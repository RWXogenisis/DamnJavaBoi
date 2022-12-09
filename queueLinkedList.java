//queue implementation

import java.util.*;

class Main {
    public static void main(String[] args) {
        // creating the queue
        
        LinkedList <Integer> queue = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        
        int option = 1;
        while(option != 0){
            option = scan.nextInt();
            if(option==1){
                //dequeue
                System.out.println("Head of teh queue: " + queue.get(0));
                queue.remove(0);
                System.out.println("After deleting: " + queue);
            }
            
            else if(option == 2){
                System.out.println("Enter the element: ");
                queue.add(scan.nextInt());
            }
            
            else if(option == 3){
                System.out.println("The list is: " + queue);
                ListIterator<Integer> l = queue.listIterator(queue.size());
                while(l.hasPrevious()){
                    System.out.println(l.previous());
                }
                ListIterator<Integer> l1 = queue.listIterator(0);
                while(l.hasNext()){
                    System.out.println(l.next());
                }
            }
            
        }
    }
}
