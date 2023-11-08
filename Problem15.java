import java.util.Scanner;
public class Problem15 {
    public static void checkPrime(int n)
    {
        boolean flag = false;
        for(int i=2; i<= n/2; i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        System.out.println(+num+" is a prime number");
        else
        System.out.println(+num+ " is not a prime number");
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        checkPrime(n);
    }
}
