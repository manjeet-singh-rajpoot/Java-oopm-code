class A{
    void add()
    {
       int a=10;
       System.out.println("a= "+a);
    }
};
class B extends A{
   void add()
   {
       int a=20;
     System.out.println("a= "+a);
   }
};
public class dynamic{
 public static void main(String args[]){
     A obj=new B();
     obj.add();
 }
}