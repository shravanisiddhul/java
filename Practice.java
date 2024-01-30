import java.util.*;
public class Practice
{
    // Print Fibonacci Series
    public static int PrintPower(int x,int n)
    {
        
        if(n == 0)
        {
            
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        int xpownm1 = PrintPower(x, n-1);
        int xpown = x * xpownm1;
        System.out.println(x+ " raised to "+n+ " is : "+xpown);
        return xpown;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();
        System.out.println("Enter Power No :");
        int n = sc.nextInt();

        PrintPower(x, n);
    }
}