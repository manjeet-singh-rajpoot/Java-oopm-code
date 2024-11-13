abstract class A{
       abstract void show();
}
class B extends A{
    String name="Manjeet singh";
    int age=19;
    char sec='A';
        void show()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(sec);
        }
};
public class 2_ABSTRACT_CLASS{
    public static void main(String args[]){
         B obj=new B();
         obj.show();
    }
}