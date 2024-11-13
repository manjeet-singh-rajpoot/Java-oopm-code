import java.util.*;
class A implements Runnable{
    public void run()
    {
        System.out.println("my name is manjeet");
    }
};
class B implements Runnable{
    public void run()
    {
          System.out.println("My name is raj");
    }
};
public class thread1{
   public static void main(String args[]){
       A bullet1=new A();
       Thread gun1=new Thread(bullet1);
        gun1.start();

    B bullet2=new B();
    Thread gun2=new Thread(bullet2);
    gun2.start();
   }
}