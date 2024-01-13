import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age,Name,Salary of an Employee : ");
        System.out.println("Enter Name : ");  
        String name = sc.nextLine();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Salary : ");
        double salary = sc.nextDouble();
        
        System.out.println("(" +name+", "+age+", "+salary+")");
    }
}