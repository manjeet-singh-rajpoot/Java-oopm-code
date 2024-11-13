class a{
    int a;
    int b;
    a()
    {
       a=10;
       b=20;
    }
    a get()
    {
      return this;
    }
    void display()
    {
       System.out.println("a= "+a+" b= "+b);
    }
  }public class this2{
    public static void main(String args[]){
      a obj=new a();
      obj.get().display();
    }
  }
