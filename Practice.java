import java.util.*;
public class Practice{
    public static void SumOfOdd(int n,int sum)
    {
        for(int i=1;i<=n;i=i+2)
        {
            sum = sum + i;
        }
        System.out.println("Sum of all Odd Numbers : "+sum);
        return;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int sum = 0;
        SumOfOdd(n,sum);
    }
}