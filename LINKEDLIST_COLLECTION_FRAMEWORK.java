import java.util.*;
public class ARRAYLIST{
    public static void main(String args[])
    {
         LinkedList<Integer>l1=new LinkedList<Integer>();
            l1.add(2);
            l1.add(3);
            l1.add(4);
           l1.set(0,3);
            l1.add(5);
            l1.add(6);
          //  l1.clear();
          l1.clone();
          l1.addLast(8);
          l1.addFirst(9);
          l1.remove(0);
         System.out.println(l1.contains(25));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(5));
         l1.set(0,56);
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}