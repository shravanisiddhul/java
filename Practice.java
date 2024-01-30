import java.util.*;
public class Practice
{
    // Print Fibonacci Series
    public static void PrintFibo(int f1,int f2,int n)
    {
        
        if(n == 0)
        {
            return;
        }
        int f3 = f1 + f2;
        System.out.print(" "+f3);
        PrintFibo(f2, f3,n-1);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        System.err.print(f1+" "+f2);

        PrintFibo(f1, f2, n-2);
    }
}