
//  Simple Inheritance
class A
{
	public void display()
	{
		System.out.println("class A");
	}
	
}
 

class B extends A
{
	public void show()
	{
		System.out.println("class B");
	}
}

class C extends B
{
	public void set()
	{
		System.out.println("class C");
	}
}

 
public class MultilevelInheritance {
    public static void main(String[] args)
	{
		C obj = new C();
        obj.display();
        obj.show();
        obj.set();
	}
}

