import java.util.*;
public class  loop1 {
public static void main(String[]args){
    
   int arr[]=new int[2];
   System.out.println("enter array: ");
 //  Scanner s=new Scanner(System.in);

     for(int i=0;i<2;i++)
     {
       // if(s.hasNextInt())
       Scanner s=new Scanner(System.in);
        arr[i]=s.nextInt();
     }
     int sum=0;
    for(int i=0;i<2;i++)
    {
        sum=sum+arr[i];
    }
    System.out.print("sum: "+sum);
}
}