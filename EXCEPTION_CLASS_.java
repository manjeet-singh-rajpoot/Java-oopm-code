import java.util.*;
 class A extends Exception{
       public String toString()
       {
        return super.toString()+"I am a String";
       }
       public String getMessage()
       {
         return super.getMessage()+"I am a Message";
       }
 };
 public class getmessage{
    public static void main(String args[]){
          int a;
          Scanner s=new Scanner(System.in);
          a=s.nextInt();
           
        if(a<666)
        {
            try{
                throw new A();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
    }
 }