import manju.*;//package//
package manju;
class A{
    public int a=10;
    protected int b=20;
    private int c=30;
    int d=40;
void show()
{
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
}
};
public class harr1{
    public static void main(String args[]){
       // System.out.println("My name is : manjeet");
      A obj=new A();
      obj.show();
    }
}