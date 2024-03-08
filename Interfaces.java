interface Animal{
    public void tail();
    
   
}
class Horse implements Animal
{
    public void tail()
    {
        System.out.println("Horse have tail");
    }
    public void eat()
    {
        System.out.println("Horse eat Grass");
    }
}

class Apes implements Animal
{
    public void tail()
    {
        System.out.println("Apes doesn't have tail");
    }
    public void eat()
    {
        System.out.println("Apes it banana");
    }
}

public class Interfaces {
    public static void main(String args [])
    {
        Horse horse = new Horse();
        horse.tail();
        horse.eat();
        Apes apes = new Apes();
        apes.tail();
        apes.eat();
    }
}
