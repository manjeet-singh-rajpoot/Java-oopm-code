//2import java.util.io.*; //File is created...//File is Written...//
import java.io.FileWriter;
import java.io.IOException;
public class code{
    public static void main(String atrgs[])
    {
        /* 
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
     */
     
        try{
            FileWriter obj =new FileWriter("monu.txt");
            obj.write("MY NAME IS Arjun..");
            obj.close();
        System.out.println("Succesfully Written....");
        }catch(IOException e)
        {
             System.out.println("Some Error Occured.....");
             e.printStackTrace();
        }

    }
}