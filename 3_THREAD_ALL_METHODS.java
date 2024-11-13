import java.util.*;
class A extends Thread{
    
    int i=0;
    public void run()
    {
    while(i<356)
        {
            System.out.println("my name is Thread1");
            i++;
        }
    }
};
class B extends Thread{
    int i=0;
    public void run(){
    while(i<456)
       {
         System.out.println("My name is thread2");
         i++;
       }
}
};
public class seeta{
    public static void main(String args[]){
        A obj=new A();
        B obj2=new B();
        obj.start();
        try
        {
        obj.join();
        obj.sleep(450);
        }catch(Exception e)
        {
            System.out.println(e);
        }
      obj.sleep(456);
      obj.interrupt();
        obj2.start();
    }
}