import java.util.Scanner;
public class Functions4 {
    
    public static void calculateFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i=n; i>=1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+ " is "+fact);

    }

        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no : ");
            int  n = sc.nextInt();
            calculateFactorial(n);
    
        }
    }

