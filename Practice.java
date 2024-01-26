import java.util.*;
public class Practice
{
    public static void EvenOrNot(int n) 
    {
        if (n % 2 ==0) 
        {
            System.out.println("No is Even");
        } 
        else{
            System.out.println("No is Odd");
        }   
    }

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        EvenOrNot(n);
    }
}