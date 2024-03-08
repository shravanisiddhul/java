abstract class Animal
{
    public void tail()
    {
        
    }
    
}
class Horse extends Animal
{
    public void tail()
    {
        System.out.println("Horse Have tail ");
    }
    public void eat()
    {
        System.out.println("Horse eat Grass");
    }
}

class Apes extends Animal
{
    public void tail()
    {
        System.out.println("Apes doesn't have tail ");
    }
    public void eat()
    {
        System.out.println("Apes it banana");
    }
}

public class Abstraction
{
    public static void main(String args []){
    
    Horse horse = new Horse();
    horse.tail();
    horse.eat();
    Apes apes = new Apes();
    apes.tail();
    apes.eat();
}
}