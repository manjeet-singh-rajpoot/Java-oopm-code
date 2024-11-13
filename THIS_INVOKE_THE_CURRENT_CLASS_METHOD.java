class test{
    void display()
    {
        System.out.println("thid is display function");
        this.show();
    }
    void show()
        {
           System.out.println("This is show function");
        }
};
public class this2{
    public static void main(String args[]){
        test obj=new test();
        obj.display();
    }
}