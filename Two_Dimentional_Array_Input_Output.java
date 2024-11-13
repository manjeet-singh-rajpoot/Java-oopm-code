import java.util.*;
public class  array {
public static void main(String[]args){
  int row,colum;
  Scanner s1=new Scanner(System.in);
   System.out.println("Enter row: ");
 //  Scanner s1=new Scanner(System.in);
         row=s1.nextInt();
   System.out.println("Enter colum: ");
  // Scanner s2=new Scanner(System.in);
         colum=s1.nextInt();
   int arr[][]=new int[row][colum];
  //System.out.println("array is: ");
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<colum;j++)
    {
         arr[i][j]=s1.nextInt();
    }
  }
  System.out.println("array is: ");
  for(int i=0;i<row;i++)
  {
     for(int j=0;j<colum;j++)
     {
           System.out.print(arr[i][j]+" ");
     }
     System.out.println();
  }
}
}