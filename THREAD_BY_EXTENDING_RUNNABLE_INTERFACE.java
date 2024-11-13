import java.lang.Thread;
class A extends Thread   //CREAT THREAD : BY EXTENDING THREAD CLASS//
{
    public void run()
    {
        try{
        System.out.println("thread: "+Thread.currentThread().getId()+  " isrunning");
          }
          catch(Exception e)
          {
            System.out.println("Exception ended");
          }
    }
}
public class threadss{
    public static void main(String args[]){
        int n=8;
        for(int i=0;i<n;i++)
        {
           A obj =new A();
            obj.start();
        }
    }
}