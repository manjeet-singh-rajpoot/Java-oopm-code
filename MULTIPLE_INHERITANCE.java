                       //multiple inheritance//

                       import java.io.*;
                       import java.util.*;
                       interface A
                        {
                           public void input();
                          
                        }
                       interface B extends A{
                             //public:
                             public void output();
                            
                       };
                       interface c extends A,B{
                            public void show();
                       }
                       class child implements c{
                           public void input()
                           {
                            System.out.println("manjeet");
                           }
                           public void output()
                           {
                             System.out.println("raj");
                           }
                           public void show()
                           {
                                System.out.println("name : raj");
                           }
                       }
                       public class single {
                           public static void main(String[] args) {
                                child obj=new child();
                                obj.input();
                                obj.output();
                                 obj.show();
                           }
                       }
                       