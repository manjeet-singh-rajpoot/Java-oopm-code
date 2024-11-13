interface A{
    public void show();
    public void display();
};
class B implements A{
    public void show()
     {
        String name="raj";
        String add="Ganj";
        System.out.println(name);
        System.out.println(add);
     }
     public void display()
     {
        String name="raj";
        String add="Ganj";
        System.out.println(name);
        System.out.println(add);
     }
};
public class interfaced{
   public static void main(String args[]){
         B obj=new B();
         obj.show();
         obj.display();
   }
}