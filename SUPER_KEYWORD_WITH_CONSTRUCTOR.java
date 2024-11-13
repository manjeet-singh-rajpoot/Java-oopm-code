class person{
    person()
    {
        System.out.println("this is person");
    }
};
class student extends person{
    student()
    { 
        super();
         System.out.println("student is person");
    }
};
public class SUPER_KEYWORD_WITH_CONSTRUCTOR{
   public static void main(String args[]){
    person obj=new person();
    student obj2=new student();
   }
}