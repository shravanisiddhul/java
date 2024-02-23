class Student
{
    String name;
    int age ;

    public void display()
    {
        System.out.println("Name of Student is : "+this.name);
        System.out.println("Age of Student is : "+this.age);
    }
    
}
public class OOPS1
{

    public static void main(String args [])
    {
        Student s1 = new Student();
        s1.name = "shravani";
        s1.age = 20;
        s1.display();
    }

}
