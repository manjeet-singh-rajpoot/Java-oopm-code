//2import java.util.io.*; //File is created...//
//import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
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

      
      try{
        File obj=new File("monu.txt");
        Scanner s=new Scanner(obj);
        while(s.hasNextLine())
        {
            String data=s.nextLine();
            System.out.println(data);
        }
        s.close();
      }
      catch(FileNotFoundException e)
      {
          System.out.println("Error");
          e.printStackTrace();
      }*/
      File obj=new File("monu.txt");
      if(obj.delete())
      {
        System.out.println("deleted.......");
      }else{
        System.out.println("Not deleted......");
      }
    }
}