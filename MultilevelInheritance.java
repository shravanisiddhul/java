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

class EqilateralTriangle extends Triangle
{
	public void area(int l,int h)
	{
		System.out.println("Area of Eqilateral Triangle is : "+(l*h)*2);
	}
}




public class MultilevelInheritance {
    public static void main(String[] args)
	{
		EqilateralTriangle t1 = new EqilateralTriangle();
		t1.area(3, 4);
        
	}
 
}
