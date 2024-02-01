import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        

        if(age < 0)
        {
            System.out.println("Enter Correct Age");
        }else if (age < 18)
        {
            System.out.println(" Not Eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}