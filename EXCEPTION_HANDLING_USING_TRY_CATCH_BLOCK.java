import java.util.*;
public class excetp{
    public static void main(String args[]){
        //int n;
        int a=100;
        int b=0;
        try{
            int c=a/b;
        System.out.println(c);
        }catch(Exception e)
        {
            System.out.println("Exception failed.....");
            System.out.println(e);
        }
        System.out.println("Exception ended......");
    }
}