
interface Animal{
    public void tail();
    
interface Herbivorus
{
    public void eat();
}   
}
class Horse implements Animal,Herbivorus
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


public class MultipleINheritance {
    public static void main(String args [])
    {
        Horse horse = new Horse();
        horse.tail();
        horse.eat();
        
    }
}
