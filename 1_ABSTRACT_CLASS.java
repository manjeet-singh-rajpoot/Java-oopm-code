import java.io.*;           //ABSTRACT CLASS//
abstract class A{
      void add()
      {
         int a=10;
         int b=20;
        int c=a+b;
        System.out.println(c);
      }
abstract void sub();
abstract void multi();
}
class B extends A{
      void sub()
       {
          int a=20;
          int b=10;
        int c=a-b;
        System.out.println(c);
       }
        void multi()
     {
          int a=10;
          int b=20;
          int c=a*b;
          System.out.println(c);
     }
};

public class dynamic{
    public static void main(String args[]){
        B obj=new B();
       // obj.add();
        obj.sub();
        obj.multi();
    }
}
