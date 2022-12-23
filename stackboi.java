import java.util.*;

public class Main{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Hola");
        stack.push("there");
        stack.push("amigo");
        
        System.out.println("Is the stack empty: " + stack.empty());
        System.out.println("Stack: " + stack);
        System.out.println("Pop the element: " + stack.pop());
        System.out.println("Pushing the new element: " + stack.push("Boi"));
        System.out.println("Stack: " + stack);
        System.out.println("Is Boi there: " + stack.search("Boi"));
        //returns 1 as it is indexed from right to left
        ListIterator<String> l1 = stack.listIterator(0);
        while(l1.hasNext()){
            System.out.println(l1.next());
        }
        
    }
}
