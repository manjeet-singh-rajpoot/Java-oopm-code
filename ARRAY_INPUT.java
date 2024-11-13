import java.util.*;
public class  array {
public static void main(String[]args){
      int num;
    int arr[]=new int[2];
    //int[] arr=new int[2];
   System.out.println("enter number: ");
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<2;i++)
  {
     arr[i]=sc.nextInt();
  }
  System.out.println("Array is : ");
  for(int j=0;j<2;j++)
  {
      System.out.println(arr[j]);
  //10
}
}
}