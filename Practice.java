
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

// class C extends A
// {
// 	public void set()
// 	{
// 		System.out.println("class C");
// 	}
// }

public class Practice {
 
	public static void main(String[] args)
	{
		B obj = new B();
        obj.display();
        obj.show();
        // C obj2 = new C();
        // obj2.set();
	}
 
}
 
