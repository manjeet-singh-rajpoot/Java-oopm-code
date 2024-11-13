class A{
    int a,b;
    A()
    {
        a=10;
        b=20;
    }
    void display(A obj)
    {
          System.out.println("a= "+obj.a+"\nb= "+obj.b);
    }
    void get()
    {
        display(this);
    }
};public class this2{
    public static void main(String args[]){
        A obj=new A();
        obj.get();
    }
}