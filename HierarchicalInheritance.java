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

class Circle extends shape
{
	public void area(int r)
	{
		System.out.println("Area of Circle is : "+3.14*r*r);
	}
}

public class HierarchicalInheritance {
    public static void main(String[] args)
	{
		Triangle t1 = new Triangle();
		t1.area(3, 4);

		Circle c1 = new Circle();
		c1.area(5);
	}
 
}
