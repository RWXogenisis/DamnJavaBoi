//implementation of stack

import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        ArrayList<Integer> stack = new ArrayList<Integer>();
        
        
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        
        System.out.println("Peeking the top element: " + stack.get(stack.size()-1));
        
        //popping the element
        stack.remove(stack.size()-1);
        System.out.println("list: " + stack);
        
        //pushing the element
        stack.add(5);
        
        System.out.println("list: " + stack);
        
        
        //searching for a value
        System.out.println("if the list contains 5: " + stack.contains(5));
        
        //checking if the stack is empty
        
        System.out.println("Is the stack empty?: " + stack.isEmpty());
        
    }
}
