import java.util.*;
public class Practice
{
    public static void CalFactorial(int i,int n,int fact)
    {
        
        if(i == n)
        {
            fact = fact * i;
            System.out.println("Factorial of "+n+" number is : "+fact);
            return;
        }
        fact = fact * i;
        CalFactorial(i+1, n, fact);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;

        CalFactorial(i, n, fact);
    }
}