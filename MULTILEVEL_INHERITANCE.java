                       //multilevel inheritance//

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
                       class c extends B{
                            public void show()
                            {
                                  System.out.println("Address: ganj katanga");
                            }
                       }
                       public class single {
                           public static void main(String[] args) {
                                c obj=new c();
                                obj.input();
                                obj.output();
                                obj.show();
                           }
                       }
                       