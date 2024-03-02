import java.util.*;

// Parameterized Constructor
class Car
{
  String color;
  float speed;

  Car(String color, float speed) {
    
    this.color = color;
    this.speed = speed;
  }

  public void carInfo()
  {
    System.out.println("Color of car is : "+this.color);
    System.out.println("Speed of color is :"+this.speed);
  }
}
public class Practice
{
    public static void main(String args [])
    {
        System.out.println("Car 1 Details are :"); 
        Car C1 = new Car("Purple",120);
        C1.carInfo();

        System.out.println();
        System.out.println("Car 2 Details are :");
        Car C2 = new Car("Neavy Blue",125);
        C2.carInfo();
        System.out.println();
    }
}