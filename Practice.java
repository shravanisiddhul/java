import java.util.*;
public class Practice{
    public static void EligibilityOfPerson(int age){

        if(age <= 0)
        {
            System.out.println("Invalid age");
        }else if(age<18){
            System.out.println("Person is not Eligible");
        }else{
            System.out.println("Person is Eligible");
        }
        return;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Age :");
        int  age = sc.nextInt();
        
       EligibilityOfPerson(age);
    }
}