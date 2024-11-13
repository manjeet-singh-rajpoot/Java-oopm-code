class test
{
      int a,b;
      test()
      {
          this(10,20);
          System.out.println("this is default class");
      }
      test(int a,int b)
      {
         this.a=a;
         this.b=b;
         System.out.println("this is parametrized construcr");
      }
};
public class this1{
    public static void main(String args[]){
        test obj=new test();
    }
}