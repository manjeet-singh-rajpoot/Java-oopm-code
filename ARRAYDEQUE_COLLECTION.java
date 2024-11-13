import java.util.*;
import java.util.ArrayDeque;
public class calam  {
public static void main(String[]args){
    
     ArrayDeque<Integer>l1=new ArrayDeque<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.addFirst(89);
        l1.addLast(90);
       System.out.println(l1.getFirst());
       System.out.println(l1.getLast());   
}
}