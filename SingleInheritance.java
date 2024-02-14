// package inheritance;
 
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


public class SingleInheritance {
    public static void main(String[] args)
	{
		B obj = new B();
        obj.display();
        obj.show();
        
	}
 
}
