// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class test<T, S>{
    T obj;
    S obj1;
    test(T obj, S obj1){
        this.obj = obj;
        this.obj1 = obj1;
    }
    
    void check(){
        System.out.println(obj.getClass().getSimpleName()+"");
    }
    
    int add(){
        int temp = Integer.parseInt(obj.toString());
        int temp1 = Integer.parseInt(obj1.toString());
        System.out.println(temp+temp1);
        return temp1+temp;
        }
}

class hola {
    public static void main(String[] args) {
        test i = new test(10, 20);
        i.check();
        i.add();
    }
}
