//2import java.util.io.*; //File is created...//
import java.io.File;
import java.io.IOException;
public class code{
    public static void main(String atrgs[])
    {
    try{
        File obj=new File("monu.txt");
       // System.out.println("File is Succesfully created...");
           if(obj.createNewFile())
           {
            System.out.println("File is Succesfully created...");
           }
           else{
            System.out.println("File already Exists..");
           }
    }catch(IOException e)
    {
        System.out.println("Error occured..");
        e.printStackTrace();
    }

    }
}