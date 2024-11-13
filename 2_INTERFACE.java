interface A{
    final int a=10;
    static void display()
    {
       System.out.println("raj");
    }
};
public class interf implements A{
       public static void main(String args[])
       {
            A.display();
            System.out.println(a);
       }
}