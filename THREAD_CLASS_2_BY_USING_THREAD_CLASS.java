import java.util.*;
class A extends Thread{   //BY THREAD CLASS//
      public void run()
      {
           String name="manjeet";
           System.out.println("name is : "+name);
           System.out.println("This is class A");
      }
};
class B extends Thread{
      public void run()
      {
          String name="Raj";
          System.out.println("Name : "+name);
          System.out.println("This is class B");
      }
};
public class mythread{
    public static void main(String args[]){
        A obj=new A();
        B obj2=new B();
        obj.start();
        obj2.start();
    }
}