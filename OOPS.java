class Pen
{
    String color ;
    String type ;
    public void writing()
    {
        System.out.println("I'm a Pen");
    }
    public void printColor()
    {
        System.out.println("My color is : "+this.color);
    }
    public void printType()
    {
        System.out.println("My type is : "+this.type);
    }

}

public class OOPS {
    public static void main(String args [])
    {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.writing();
        pen1.printColor();
        pen1.printType();

        pen2.writing();
        pen2.printColor();
        pen2.printType();
    }
}
