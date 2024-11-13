import java.util.*;
class A extends Thread{
    String name;
       A(String name)
       {
          // super(name);
          this.name=name;
       }
       public void run()
       {
          System.out.println("I am a thread");
          System.out.println(name);
        }
};
public class mythr{
    public static void main(String args[]){
          A obj =new A("manjeet");
          obj.start();
         //For getting Id//
      System.out.println("id is : "+obj.getId());
    }
}