interface A{
    default void show()
    {
        System.out.println("raj");
    }
};
interface B extends A{
    default void display()
    {
        System.out.println("manjeet");
    }
};
class c implements B{
     void sum()
     {
        System.out.println("bbb..");
     }
};
public class interf{
public static void main(String args[]){
    c obj=new c();
    obj.show();
    obj.display();
    obj.sum();
}
}