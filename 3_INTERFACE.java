interface A{
    void add();
    void sub();
};
interface B 
{
      void multi();
      void divide();
};
class c implements A,B
{
    public void add()
    {
          int a=10,b=20,c;
          c=a+b;
          System.out.println(c);
    }
    public void sub()
    {
          int a=10,b=20,c;
          c=a+b;
          System.out.println(c);
    }
    public void multi()
    {
          int a=10,b=20,c;
          c=a+b;
          System.out.println(c);
    }
    public void divide()
    {
          int a=10,b=20,c;
          c=a+b;
          System.out.println(c);
    }
};
public class interf{
    public static void main(String args[]){
          c obj =new c();
          obj.add();
          obj.sub();
          obj.multi();
          obj.divide();
    }
}