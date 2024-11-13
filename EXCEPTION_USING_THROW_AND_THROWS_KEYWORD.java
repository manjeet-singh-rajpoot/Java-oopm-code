import java.util.*;
class A extends Exception {
      public static void devide() throws ArithmeticException
      {
        int a=10;
        int b=0;
        int result=a/b;
    System.out.println("result is : "+result);
      }
}
public class calam{
    public static void main(String args[]){
        
        try{
              throw new A();
        }catch(Exception e)
        {
            System.out.println("Exception...");
        }
    }
}