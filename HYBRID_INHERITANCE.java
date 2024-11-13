                       //hybrid inheritance//

                       import java.io.*;
                       import java.util.*;
                       class A
                        {
                           public void input()
                           {
                            System.out.println("manjeet");
                           } 
                        }
                       class B extends A{
                             //public:
                             public void output()
                             {
                                 System.out.println("raj");
                               }   
                       };
                       class c extends A{
                            public void show()
                            {
                                 System.out.println("name : raj");
                            }
                       }
                       class D extends B
                       {
                             public void display()
                             {
                                   System.out.println("name : manjeet");
                             }
                       }
                       public class single {
                           public static void main(String[] args) {
                                c obj=new c();
                               obj.input();
                               // obj.output();
                                 obj.show();
                              
                                 B obj2=new B();
                                  obj.input();
                                  obj2.output();
                                   //obj2.show();
                       
                               D obj3=new D();
                               obj3.output();
                               obj3.display();
                           }
                       }
                       