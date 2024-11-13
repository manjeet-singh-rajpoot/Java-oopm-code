import java.lang.Thread;
class A extends Thread{
    String name;
       A(String name)
       {
          super(name);
         // this.name=name;
       }
       public void run()
       {
         while(true){
        //  System.out.println("I am a thread");
          System.out.println(this.getName());
        }
      }
};
public class mythr{
    public static void main(String args[]){
          A obj =new A("manjeet");
          A obj2=new A("Raj(most important)");
          A obj3=new A("Arjun");
         A obj4=new A("kisan");

         obj.setPriority(Thread.MAX_PRIORITY);
         obj2.start();
         obj3.start();
         obj4.start();
        
    }
   }