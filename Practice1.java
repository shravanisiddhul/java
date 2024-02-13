import java.util.*;
public class Practice1 {
 
	public static void main(String[] args) {
		
		Employee emp = new Employee();
	    emp.calculateGrade();
	}
 
}
class Employee
{
	public int Id;
	public String Name;
    public int age;
    public int salary;
	
	public void calculateGrade()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Id : ");
		int Id = sc.nextInt();
        System.out.println("Enter Employee Name : ");
		String Name = sc.next();
        System.out.println("Enter employee age : ");
        int age = sc.nextInt();
        System.out.println("Enter employee salary : ");
        int salary = sc. nextInt();

        System.out.println("Id is : "+Id);
        System.out.println("Name is : "+Name);
        System.out.println("Age is : "+age );
        System.out.println("Salary is : "+salary);

        if (salary >= 60000 && salary <= 70000) {
            System.out.println("A grade");
        } else if (salary >= 50000 && salary < 60000) {
            System.out.println("B grade");
        } else if (salary >= 40000 && salary < 50000) {
            System.out.println("C grade");
        } else {
            System.out.println("No grade");
        }
    }
}

// // [8:41 PM] Jay Prakash
// import java.util.Scanner;
 
// class Employee {
//     public int Id;
//     public String Name;
//     public int Age;
//     public double Salary;
 
//     public void calculateGrade() {
//         if (Salary >= 60000 && Salary <= 70000) {
//             System.out.println("Grade: A");
//         } else if (Salary >= 50000 && Salary < 60000) {
//             System.out.println("Grade: B");
//         } else if (Salary >= 40000 && Salary < 50000) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("No Grade");
//         }
//     }
// }
 
// public class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
 
//         System.out.println("Enter employee details:");
 
//         Employee emp = new Employee();
 
//         System.out.print("ID: ");
//         emp.Id = sc.nextInt();
 
//         System.out.print("Name: ");
//         emp.Name = sc.next();
 
//         System.out.print("Age: ");
//         emp.Age = sc.nextInt();
 
//         System.out.print("Salary: ");
//         emp.Salary = sc.nextDouble();
 
//         System.out.println("Employee details - ID: " + emp.Id + ", Name: " + emp.Name + ", Age: " + emp.Age
//                 + ", Salary: " + emp.Salary);
 
//         emp.calculateGrade();
//     }
// }
 
// [8:41 PM] raghu chander
// public class Employee {

//     private int id;

//     private String name;

//     private int age;

//     private double salary;

//     public Employee(int id, String name, int age, double salary) {
// this.id = id;

//         this.name = name;

//         this.age = age;

//         this.salary = salary;

//     }

//     public char calculateGrade() {

//         if (salary >= 60000 && salary <= 70000) {

//             return 'A';

//         } else if (salary >= 50000 && salary < 60000) {

//             return 'B';

//         } else if (salary >= 40000 && salary < 50000) {

//             return 'C';

//         } else {

//             return ' ';

//         }

//     }

// }
// [8:41 PM] Pooja Maheshwari
// public class Employee {
//     private int id;
//     private String name;
//     private int age;
//     private double salary;
 
//     public Employee(int id, String name, int age, double salary) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.salary = salary;
//     }
 
//     public void calculateGrade() {
//         if (salary >= 60000 && salary <= 70000) {
//             System.out.println("Grade: A");
//         } else if (salary >= 50000 && salary < 60000) {
//             System.out.println("Grade: B");
//         } else if (salary >= 40000 && salary < 50000) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("No Grade");
//         }
//     }
// }
// [8:42 PM] Alfiya Rayeen
// Create an Employee class
 
// properties: Id,Name,Age,salary
 
// method: calculate the grade of emp
 
// salary = 60k to 70k = A
//  	 50k to 60k = B
//  40k to 50k = C
//  below 40k = no grade
// [8:44 PM] UDAY (Guest)
// import java.util.Scanner;

// class employee

// {

// 	public int Id,salary;

// 	public String Name;
 
// 	public void display()

// 	{

// 		Scanner sc = new Scanner(System.in);

// 		Id = sc.nextInt();

//                  salary = sc.nestInt();
 
// 		Name = sc.next();

//          if(salary>60000 && salary<70000){
 
// 		System.out.println("A");

// }

// else if(salary>50000 && salary<60000){
 
// 		System.out.println("B");

// }

// else if(salary>40000 && salary<50000){
 
// 		System.out.println("c");

// }

// else{

// system.out.println("no grade");

// 	}

// }

// public class Demo {

// 	public static void main(String[] args) {

// 		Student s = new Student();

// 		s.display();

// 	}

// }
// [8:44 PM] Alfiya Rayeen
// Certainly! Here's a simple Java representation of the Employee class with the specified properties and the method to calculate the grade based on the salary:
 
// ```java
// public class Employee {
//     private int id;
//     private String name;
//     private int age;
//     private double salary;
 
//     public Employee(int id, String name, int age, double salary) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.salary = salary;
//     }
 
//     public String calculateGrade() {
//         if (salary >= 60000 && salary <= 70000) {
//             return "A";
//         } else if (salary >= 50000 && salary < 60000) {
//             return "B";
//         } else if (salary >= 40000 && salary < 50000) {
//             return "C";
//         } else {
//             return "No grade";
//         }
//     }
 
    
 
    