class Employee
{
  int empid;
  String e_name;
  int salary;

  public void emp_Info()
  {
    System.out.println("Employee id : "+this.empid);
    System.out.println("Employee Name is : "+this.e_name);
    System.out.println("Salary of Employee is : "+this.salary);
  }
  // Employee()
  // {

  // }
}
public class Practice
{
  public static void main(String args [])
  {
    Employee e1 = new Employee();
    e1.empid = 1;
    e1.e_name = "Shravani";
    e1.salary = 100000; 
    e1.emp_Info();
  }
  
}