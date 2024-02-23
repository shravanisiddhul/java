class Student {
    int id;
    String name;
  
    // Constructor
    Student(int i, String n) {
      id = i;
      name = n;
    }
  
    // Method to display the values
    void display() {
      System.out.println(id + " " + name);
    }
  }
  
  public class Practice {
    public static void main(String[] args) {
      // Creating objects and passing values
      Student s1 = new Student(111, "Karan");
      Student s2 = new Student(222, "Aryan");
  
      // Calling method to display the values of object
      s1.display();
      s2.display();
    }
  }