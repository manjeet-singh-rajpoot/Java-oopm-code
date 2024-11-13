   //Single inheritance//

   import java.io.*;
          import java.util.*;
           class A
                       {
                             
                           public void input()
                        {
                                 System.out.println("Name : manjeet");
                            }
                       };
                       class B extends A{
                             //public:
                             public void output()
                             {
                               System.out.println("class = 12 th");
                             }
                       };
                       public class single {
                           public static void main(String[] args) {
                                B obj=new B();
                                obj.input();
                                obj.output();
                           }
                       }
                       