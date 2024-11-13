class person{              //base class
       void message()
       {
         System.out.println("This is base class");
       }
};
class human extends person
{
      void message()
      {
         System.out.println("this is student class");
      }
      void display()
      {
         message();
         super.message();
      }
};
public class SUPER_KEYWORD_WITH_METHOD{
    public static void main(String args[]){
       human obj=new human();
       obj.display();
    }
}
