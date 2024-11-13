import java.util.*;
public class array{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40};
        int sum=0;
        for(int i=0;i<4;i++)
        {
           System.out.println("array: "+arr[i]);
           sum=sum+arr[i];
          // System.out.println(sum);
        }
       // System.out.println("\n");
        System.out.println("sum is : "+sum);
    }
}