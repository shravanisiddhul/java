import java.util.Scanner;
 
class Student
 
{
	public int Id;
	public String Name;
	
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		Id = sc.nextInt();
		Name = sc.next();
		System.out.println("id is: "+Id+"  Name is: "+Name);
	}
}
public class practice2 {
 
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();
	}
 
}