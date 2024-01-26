import java.util.*;
public class Practice{
    public static void Factorial(int n,int fact)
    {
        
        if(n<0)
        {
            System.out.println("Invalid number ");
            return;
        }
        for(int i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+ " is : "+fact);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int fact = 1;

        Factorial(n,fact);        
    }
}