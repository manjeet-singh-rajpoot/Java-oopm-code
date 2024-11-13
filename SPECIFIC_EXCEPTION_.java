import java.util.*;
public class excetp{
    public static void main(String args[]){
    //int [] marks=new int [3];
   // marks[0]=28;
   // marks[1]=56;
   // marks[2]=84;
   int marks[]={12,34,56};
    int ind;
    System.out.println("Enter arrary index: ");
    Scanner s=new Scanner(System.in);
         ind=s.nextInt();
  System.out.println(" arrary index : "+marks[ind]);

    System.out.println("Enter number: ");
    Scanner s1=new Scanner(System.in);
       int num=s1.nextInt();    
        try{
        System.out.println("divide is: "+marks[ind]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occured.....");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutofboundException occured.....");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("OtherException occured.....");
            System.out.println(e);
        }
        System.out.println("Exception ended......");
    }
}