import java.util.*;
class Car
{
  String color;
  float speed;

  public void carInfo()
  {
      System.out.println("Color of Car is :"+this.color);
      System.out.println("Speed of car is :"+this.speed);
  }
}
public class Practice
{
    public static void main(String args [])
    {
        System.out.println("Car 1 Details are :"); 
        Car C1 = new Car();
        C1.color = "Purple";
        C1.speed = 120 ;
        C1.carInfo();

        System.out.println();
        System.out.println("Car 2 Details are :");
        Car C2 = new Car();
        C2.color = "Neavy Blue";
        C2.speed = 125;
        C2.carInfo();
        System.out.println();
    }
}