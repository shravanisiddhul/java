// package inheritance;
import java.util.*;
class shape
{
	public void area()
	{
		System.out.println("Display");
	}
	
}
class Triangle extends shape
{
	public void area(int l,int h)
	{
		System.out.println("Area of Triangle is : "+(l*h)*2);
	}
}




public class SingleInheritance {
    public static void main(String[] args)
	{
		Triangle t1 = new Triangle();
		t1.area(3, 4);
        
	}
 
}
