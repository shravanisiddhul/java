import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int temp=0;
        boolean isPrime = true;
        if(n<=1)
        {
            isPrime = false;
        }
        else{
            for(int i=2;i<=n; i++)
            {
                if(n % i == 0)
                {
                    temp = temp+i;
                    break;
                }

            }
        }
        if(isPrime)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }


    }
} 