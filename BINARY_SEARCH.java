import java.util.*;
public class  car {

static int binarysearch(int a[],int n,int key)
{
      int l=0;
      int h=n-1;
      int mid=(l+h)/2;
    while(a[l]<a[h])
    {
         if(key==a[mid])
         {
            return 1;
         }
         else if(key<a[mid])
         {
              l=mid-1;
              System.out.println("found:l "+l);
         }
         else{
              h=mid+1;
              System.out.println("found:h "+h);
         }
         l++;
         break;
    }
    return 0;
}
public static void main(String[]args)
{
     int a[]={10,20,30,40,50};
    System.out.print(binarysearch(a,5,40));      

}
}