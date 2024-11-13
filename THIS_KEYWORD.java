class person{
    String name;
    int age;
    person(String name,int age)
    {
       this.name=name;
       this.age=age;
    }
    void display()
    {
       System.out.println("name= "+name+" \nage= "+age);
    }
    void changename(String name)
    {
         this.name=name;
    }
    void changeage(int age)
    {
       this.age=age;
    }
    void show()
    {
         System.out.println("changename = "+name+"\nage = "+age);
    }
};
public class bhabi{
 public static void main(String args[]){
      person obj=new person("Manjeet",18);
      obj.display();
      obj.changename("Raj");
      obj.changeage(19);
      obj.show();
 }
}