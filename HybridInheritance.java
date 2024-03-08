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
class EquilateralTriangle extends Triangle
{
	public void area(int l,int h)
	{
		System.out.println("Area of Eqilateral Triangle is : "+(l*h)*2);
	}
}

class Circle extends shape
{
	public void area(int r)
	{
		System.out.println("Area of Circle is : "+3.14*r*r);
	}
}

public class HybridInheritance {
    public static void main(String[] args)
	{
		EquilateralTriangle t1 = new EquilateralTriangle();
		t1.area(3, 4);

		Circle c1 = new Circle();
		c1.area(5);
	}
 
}
