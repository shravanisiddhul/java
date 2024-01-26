import java.util.*;
public class Practice
{
    public static void Isprime(int n) 
    {
        boolean isPrime = true;
        for(int i=2;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(n+" is a Prime Number ");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }

    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        Isprime(n);
    }
}