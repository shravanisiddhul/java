import java.util.*;

// Copy Constructor
class Car
{
  String color;
  float speed;

  public void carInfo()
  {
    System.out.println("Color of car is : "+this.color);
    System.out.println("Speed of color is :"+this.speed);
  }

  Car(Car C2) 
  {
    this.color = C2.color;
    this.speed = C2.speed;
  }
  Car()
  {

  }
}
public class Practice
{
    public static void main(String args [])
    {
        System.out.println("Car 1 Details are :"); 
        Car C1 = new Car();
        C1.color = "Purple";
        C1.speed = 120;

        C1.carInfo();

        System.out.println();
        System.out.println("Car 2 Details are :");
        Car C2 = new Car(C1);
        C2.carInfo();
        // System.out.println();
    }
}