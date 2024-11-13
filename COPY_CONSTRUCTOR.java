                           //Copy Constructor//
import java.io.*;
//import java.util.scanner;
class A
{
     String name;
     int id;
     String add;
       A(String name,int id,String add)
       {
           this.name=name;
           this.id=id;
           this.add=add;
       }
       A(A obj2)
       {
             this.name=obj2.name;
             this.id=obj2.id;
             this.add=obj2.add;
       }
}
public class cop {
    public static void main(String[] args) {
        A obj= new A("manjeet singh",67,"ganj katanga");
        System.out.println("name : "+obj.name+"\n id : "+obj.id+"\n adress: "+obj.add);

        System.out.println();
        A obj2=new A(obj);
        System.out.println("name: "+obj2.name+"\n id : "+obj2.id+"\n address "+obj2.add);
    }
}
