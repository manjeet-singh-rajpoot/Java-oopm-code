
import java.util.*;
import java.util.Hashtable;
 class hash{
    public static void main(String args[]){
        Hashtable<Integer,String>h1=new Hashtable<Integer,String>();
        Hashtable<Integer,String>h2=new Hashtable<Integer,String>();
               
          //H1 //
        h1.put(1,"one");
        h1.put(2,"two");
        h1.put(3,"three");

        //H2//
      h2.put(4,"four");
      h2.put(5,"five");
      h2.put(6,"six");

    System.out.println("h1 mapping "+h1);
    System.out.println("h2 mapping "+h2);
    }
}