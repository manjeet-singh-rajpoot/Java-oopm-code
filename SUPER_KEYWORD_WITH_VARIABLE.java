class vehicle{
    int maxspeed=100;
};
class car extends vehicle{
     int maxspeed=120;
     void display()
     {
        System.out.println("maxspeed: "+super.maxspeed);
     }
};
public class supar{
  public static void main(String args[]){
    car obj=new car();
    obj.display();
  }
}